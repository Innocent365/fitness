package com.lelai.sales.service;

import com.lelai.sales.dao.TUserDesignCourseDao;
import com.lelai.sales.dao.TUserDesignDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author hw
 * @version on 2018/9/25
 */
@Service
public class TCustomizeService {

    @Autowired
    public TUserDesignDao userDesignDao;

    @Autowired
    public TUserDesignCourseDao designCourseDao;


    //public TUserDesign get(TUserDesign tUserDesign){
    //    tUserDesign = userDesignDao.get(tUserDesign);
    //    tUserDesign.setCourses(getDesignCourses(tUserDesign));
    //    tUserDesign.setCourseTotal(getCourseTotal(tUserDesign));
    //    return tUserDesign;
    //}
    //
    //public List<TUserDesign> findAllPage(TUserDesign tUserDesign){
    //    List<TUserDesign> list = userDesignDao.findList(tUserDesign);
    //    for (int i = 0; i < list.size(); i++) {
    //        list.get(i).setOrderNum(i+1);
    //        list.get(i).setCourseTotal(getCourseTotal(list.get(i)));
    //    }
    //
    //    //page.setList(list);
    //    //tUserDesign.setPage(page);
    //    return list;
    //}
    //
    //public List<TUserDesign> findList(TUserDesign tUserDesign){
    //    List<TUserDesign> list = userDesignDao.findList(tUserDesign);
    //    for (int i = 0; i < list.size(); i++) {
    //        list.get(i).setOrderNum(i+1);
    //        list.get(i).setCourseTotal(getCourseTotal(list.get(i)));
    //    }
    //
    //    //page.setList(list);
    //    //tUserDesign.setPage(page);
    //    return list;
    //}
    //
    //@Transactional(readOnly = false)
    //public void save(TUserDesign tUserDesign){
    //    if (tUserDesign.getId() == null){
    //        tUserDesign.preInsert();
    //        userDesignDao.insert(tUserDesign);
    //    }else{
    //        tUserDesign.preUpdate();
    //        userDesignDao.update(tUserDesign);
    //    }
    //}
    //
    //@Transactional(readOnly = false)
    //public void delete(TUserDesign tUserDesign){
    //    for (TUserDesignCourse course: tUserDesign.getCourses()) {
    //        designCourseActionDao.deleteAll(course);
    //        designCourseDao.delete(course);
    //    }
    //    userDesignDao.delete(tUserDesign);
    //}
    //
    //@Transactional(readOnly = false)
    //public void generateCourse(TUserDesign tUserDesign){
    //    List<TUserDesignCourse> list = new ArrayList<>();
    //
    //    TUserDesignCourse course;
    //    switch (tUserDesign.getDesired()){
    //        case "1"://"塑形":
    //            //体适能训练
    //            list.add(new TUserDesignCourse(45L, 8));
    //            //心肺功能训练
    //
    //            //力量训练
    //            //自主训练
    //            break;
    //        case "2"://"体态提升":
    //            //基础力量训练
    //            //TRX悬挂系统训练
    //            list.add(new TUserDesignCourse(42L, 2));
    //            break;
    //        case "3"://"康复":
    //            list.add(new TUserDesignCourse(38L, 2));
    //            break;
    //    }
    //    switch (tUserDesign.getLevelAt()){
    //        case "EV1": break;
    //        case "EV2": break;
    //        case "EV3": break;
    //        case "EV4": break;
    //        case "EV5": break;
    //        case "EV6": break;
    //        case "EV7": break;
    //        case "EV8": break;
    //    }
    //
    //    if("教师".equals(tUserDesign.getJob())){
    //
    //    }else if("工程师".equals(tUserDesign.getJob())){
    //
    //    }
    //
    //    if(28 > tUserDesign.getAge()){
    //
    //    }else if(40>tUserDesign.getAge()){
    //
    //    }else{
    //
    //    }
    //
    //    list.stream().forEach(p-> {
    //        p.setDesignId(tUserDesign.getId());
    //        this.saveDesignCourse(p);
    //        tUserDesign.setCourseTotal(tUserDesign.getCourseTotal() + p.getCourseNum());
    //    });
    //}
    //
    //
    ///** TUserDesignCourse */
    //public List<TUserDesignCourse> getDesignCourses(TUserDesign tUserDesign){
    //    return designCourseDao.findAllByDesignId(tUserDesign.getId());
    //}
    //
    //public TUserDesignCourse getCourse(TUserDesignCourse tUserDesignCourse) {
    //    return designCourseDao.get(tUserDesignCourse);
    //}
    //
    //@Transactional(readOnly = false)
    //public void saveDesignCourse(TUserDesignCourse tDesignCourse){
    //    if(tDesignCourse.getId() == null){
    //        tDesignCourse.preInsert();
    //        designCourseDao.insert(tDesignCourse);
    //    }else{
    //        tDesignCourse.preUpdate();
    //        designCourseDao.update(tDesignCourse);
    //    }
    //}
    //
    //@Transactional(readOnly = false)
    //public int getCourseTotal(TUserDesign tUserDesign){
    //    Integer total = designCourseDao.getTotal(tUserDesign.getId());
    //    return total==null? 0:total;
    //}
    //
    //@Transactional(readOnly = false)
    //public void deleteCourseByDesignCourseId(TUserDesignCourse course){
    //    designCourseActionDao.deleteAll(course);
    //    designCourseDao.delete(course);
    //}
    //
    //
    ///** TUserDesignCourseAction */
    //@Transactional(readOnly = false)
    //public List<TUserDesignCourseAction> getCourseActions(TUserDesignCourse tUserDesignCourse){
    //    return designCourseActionDao.findAllByCourseId(tUserDesignCourse);
    //}
    //
    ///** TUserDesignCourseAction */
    //@Transactional(readOnly = false)
    //public void saveCourseActions(TUserDesignCourse tUserDesignCourse){
    //    designCourseActionDao.deleteAll(tUserDesignCourse);
    //    for (TUserDesignCourseAction tAction : tUserDesignCourse.getActions()) {
    //        tAction.setDesignCourse(tUserDesignCourse);
    //        designCourseActionDao.insert(tAction);
    //    }
    //}
}


