package com.lelai.sales.service;

import com.lelai.sales.dao.TUserCourseDao;
import com.lelai.sales.dao.TUserDao;
import com.lelai.sales.domain.cases.*;
import com.lelai.sales.domain.modules.TCourseStoreManage;
import com.lelai.sales.domain.modules.TTrainAction;
import com.lelai.sales.domain.modules.TXfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.function.Function;

import static com.lelai.sales.common.UserUtils.getFormatDate;
import static com.lelai.sales.common.UserUtils.tryParseInteger;


/**
 * @author hw
 * @version on 2018/11/23
 */
@Service
public class TUserService {

    @Autowired
    public TUserDao userDao;

    @Autowired
    public TUserCourseDao tUserCourseDao;

    public Map<Long, TCourseStoreManage> courseStoreMap;

    public Map<Long, TCourseStoreManage> getCourseMap(){
        if(courseStoreMap == null) {
            courseStoreMap = new HashMap<>();
            List<TCourseStoreManage> list = tUserCourseDao.getTCourseStoreManage();
            list.forEach(p->courseStoreMap.put(p.getId(), p));
        }
        return courseStoreMap;
    }


    public List<TUser> getAll(TUser tUser) {
        return userDao.findList(tUser);
    }

    public TUser get(Long id) {
        return userDao.get(id);
    }

    public void setCase(Long id, int sign){
        userDao.setIsCase(id, sign);
    }

    public List<TCustomerBodyData> getBodyDateByUser(Long id) {
        return userDao.getBodyDateByUser(id);
    }

    public List<TUserTrainCourse> getTUserTrainCourseByUser(Long id) {
        List<TUserTrainCourse> list = tUserCourseDao.getTUserTrainCourseByUser(id);

        Iterator<TUserTrainCourse> iterator = list.iterator();
        while (iterator.hasNext()){
            TUserTrainCourse course = iterator.next();
            if(getCourseMap().get(course.getId()) !=null){
                getCourseMap().get(course.getId()).injectToTUserTrainCourse(course);
            }else{  //早期一些测试课程数据，忽略掉
                //System.out.println(course.getId());
                iterator.remove();
            }
        }

        return list;
    }

    public List<TUserTrainPart> getTUserTrainPartByUser(Long id) {
        return tUserCourseDao.getTUserTrainPartByUser(id);
    }

    public List<TUserTrainDaily> getTUserTrainDailyByUser(Long id) {
        List<TUserTrainDaily> list = tUserCourseDao.getTUserTrainDailyByUser(id);

        Iterator<TUserTrainDaily> iterator = list.iterator();
        while (iterator.hasNext()){
            TUserTrainDaily trainDaily = iterator.next();
            if(getCourseMap().get(trainDaily.getCourseId()) !=null){
                getCourseMap().get(trainDaily.getCourseId()).injectToTUserTrainDaily(trainDaily);
            }else{  //早期一些测试课程(以及被误操作删除的课程)数据，忽略掉
                //System.out.println(course.getId());
                iterator.remove();
            }
        }
        return list;
    }

    public List<TUserTrainMovement> getTUserTrainMovementByCourseUser(Long id) {
        return tUserCourseDao.getTUserTrainMovement(id);
    }

    public List<TStrength> getTUserStrengthByUser(Long id) {
        List<TTrainAction> list = tUserCourseDao.getTUserStrength(id);
        Map<String, TTrainAction> maxMap = new HashMap<>();
        Map<String, TTrainAction> minMap = new HashMap<>();

        Function<TTrainAction, Integer> getWeight = p->{
            String intensity = p.getPlanintensity().replaceAll("kg","");
            return tryParseInteger(intensity.split("/")[0]);
        };

        for (TTrainAction action:list) {
            if(maxMap.containsKey(action.getBodydetail()) == false){
                maxMap.put(action.getBodydetail(), action);
                minMap.put(action.getBodydetail(), action);
            }else{
                if(getWeight.apply(action) > getWeight.apply(maxMap.get(action.getBodydetail()))){
                    maxMap.put(action.getBodydetail(), action);
                }
            }
        }

        List<TStrength> result = new ArrayList<>();
        maxMap.keySet().forEach(p->{
            TTrainAction action = minMap.get(p);

            TStrength t = new TStrength();
            t.setPart(action.getBody());
            t.setMuscle(action.getBodydetail());

            t.setBeginWeight(action.getWeight());
            t.setBeginWeightNum(action.getWeightNum());
            t.setBeginWeightGroupNum(tryParseInteger(action.getPlannum()));
            t.setBeginWeightTip(getTrainDescribe(action.getPlanId()));

            action = maxMap.get(p);
            t.setMaxWeight(action.getWeight());
            t.setMaxWeightNum(action.getWeight());
            t.setMaxWeightGroupNum(tryParseInteger(action.getPlannum()));
            t.setMaxWeightTip(getTrainDescribe(action.getPlanId()));

            result.add(t);
        });

        return result;
    }

    private String getTrainDescribe(String planId){
        TUserTrainDaily t = tUserCourseDao.getTrainDescribe(planId);
        if(getCourseMap().get(t.getCourseId()) != null){
            t.setCourseName(getCourseMap().get(t.getCourseId()).getCourseName());
            t.setCoachName(getCourseMap().get(t.getCourseId()).getCoachName());
        }

        StringBuffer sf = new StringBuffer(getFormatDate(t.getStartTime()));
        if(t.getSort()!=null && t.getSort()  > 0){
            sf.append("第"+t.getSort()+"次");
        }
        sf.append(t.getCourseName()+"课程，教练"+t.getCoachName());
        return  sf.toString();
    }

    public void savePhotoByUser(Long id, TXfile xfile) {
        TUser user = new TUser();
        user.setId(id);
        user.setGender(xfile.getId().intValue());   ////借用字段gender用一哈
        tUserCourseDao.insertXFile(xfile);
        user.setBeginningPhoto(xfile.getId());
        user.setFinishedPhoto(xfile.getId());
        tUserCourseDao.savePhoto(user);
    }
}
