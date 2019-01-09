package com.lelai.sales.service;

import com.lelai.sales.dao.*;
import com.lelai.sales.domain.design.*;
import com.lelai.sales.domain.modules.TCourseStoreManage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author hw
 * @version on 2018/12/11
 */
@Service
public class TDesignService {

    @Autowired
    private TDesignCourseDao tDesignCourseDao;

    @Autowired
    private TDesignCourseDetailDao tDesignCourseDetailDao;


    @Autowired
    public TUserDesignDao tUserDesignDao;

    @Autowired
    public TUserDesignCourseDao tUserDesignCourseDao;

    @Autowired
    public TUserDesignCourseDetailDao tUserDesignCourseDetailDao;



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

    /**
     * 给客户设计课程的历史
     * @return
     */
    public List<TUserDesign> getTUserDesignList(){
        return tUserDesignDao.getList();
    }

    public void saveTUserDesign(TUserDesign tUserDesign) {
        tUserDesignDao.insert(tUserDesign);
    }

    public void generateCourses(TUserDesign tUserDesign) {
        List<TUserDesignCourse> courses = new ArrayList<>();
        List<TUserDesignCourseDetail> details = new ArrayList<>();

        List<TDesignCourse> list = tDesignCourseDao.getByDesired(tUserDesign.getDesired());
        list.stream().forEach(param->{
            TUserDesignCourse course = new TUserDesignCourse(param);
            course.setDesignCourseDetails(tDesignCourseDetailDao.getCourseDetailById(param.getId()));
            course.settUserDesignId(tUserDesign.getId());
            course.setCreateTime(new Date());
            tUserDesignCourseDao.insert(course);
            courses.add(course);
        });

        courses.stream().forEach(param -> {
            List<TDesignCourseDetail> subList = param.getDesignCourseDetails();
            subList.stream().forEach(p->{
                TUserDesignCourseDetail detail = new TUserDesignCourseDetail(p);
                detail.settUserDesignCourseId(param.getId());
                detail.setCreateTime(new Date());
                details.add(detail);
            });
        });

        details.stream().forEach(param->{
            tUserDesignCourseDetailDao.insert(param);
        });
    }

    public void saveTUserDesignCourse(List<TUserDesignCourse> list) {
        list.forEach(p->{
            if(p.getId()==null)
                tUserDesignCourseDao.insert(p);
            else tUserDesignCourseDao.update(p);
        });
    }

    public void deleteCoursesByCourseCode(TUserDesignCourse course) {
        tUserDesignCourseDetailDao.deleteByCourse(course);
        tUserDesignCourseDao.deleteCoursesByCode(course);
    }

    public List<TUserDesignCourse> getTUserDesignCourseListByDesignId(Long designId){
        List<TUserDesignCourse> list =  tUserDesignCourseDao.getListByDesignId(designId);
        list.stream().forEach(p->{
            if("HIIT训练".equals(p.getContent())){p.setContent("心肺功能训练");}
            Optional<TCourseStoreManage> result = getCourseMap().values().stream().filter(course->
                    p.getContent().equals(course.getCourseName())).findFirst();
            if(result.isPresent())
                p.setPrice(result.get().getCoursePrice().intValue());
        });
        return list;
    }

    public void deleteCourseById(Long id) {
        tUserDesignCourseDao.delete(id);
        tUserDesignCourseDetailDao.deleteAll(id);
    }

    public List<TUserDesignCourseDetail> getTUserDesignCourseDetailAllByCourseId(Long courseId) {
        return tUserDesignCourseDetailDao.getAll(courseId);
    }

    public List<TUserDesignCourseDetail> getTUserDesignCourseDetailsByCourseId(Long courseId) {
        return tUserDesignCourseDetailDao.getList(courseId);
    }

    public void saveUserDesignCourseDetail(List<TUserDesignCourseDetail> list) {
        TUserDesignCourseDetail instance = list.get(0);
        tUserDesignCourseDetailDao.deleteAll(instance.gettUserDesignCourseId());
        list.forEach(p->{
            p.settUserDesignCourseId(instance.gettUserDesignCourseId());
            p.setCreateTime(new Date());
            tUserDesignCourseDetailDao.insert(p);
        });
    }

    /***
     * 课程计划模板
     */
    public List<TDesignCourse> getCourseByDesired(String desired) {
        return tDesignCourseDao.getByDesired(desired);
    }

    public List<TDesignCourseDetail> getCourseDetailAllByCode(String code) {
        return tDesignCourseDetailDao.getCourseDetailByCode(code);
    }

    public List<TDesignCourseDetail> getDesignCourseDetailById(String designCourseId){
        return tDesignCourseDetailDao.getCourseDetailById(designCourseId);
    }



}
