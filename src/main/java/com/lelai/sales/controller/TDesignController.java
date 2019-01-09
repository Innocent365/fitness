package com.lelai.sales.controller;

import com.lelai.sales.domain.design.*;
import com.lelai.sales.domain.modules.Dict;
import com.lelai.sales.service.SysUserService;
import com.lelai.sales.service.TDesignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @author hw
 * @version on 2018/12/11
 */
@RestController
@RequestMapping("/design")
public class TDesignController {

    @Autowired
    private TDesignService tDesignService;

    @Autowired
    private SysUserService sysUserService;

    @GetMapping("/")
    public List<TUserDesign> getTUserDesignCourses(){
        return tDesignService.getTUserDesignList();
    }

    //保存并生成课程计划
    @RequestMapping(value = "/save", method = { RequestMethod.POST, RequestMethod.GET })
    public TUserDesign saveTUserDesign(@RequestBody TUserDesign tUserDesign){
        tDesignService.saveTUserDesign(tUserDesign);
        tDesignService.generateCourses(tUserDesign);
        return tUserDesign;
    }

    @RequestMapping(value = "/addCourse", method = { RequestMethod.POST, RequestMethod.GET })
    public void addCourse(@RequestBody TUserDesignCourse tUserDesignCourse){
        //tDesignService.addCourse(tUserDesignCourse);
        Integer times = Integer.valueOf(tUserDesignCourse.getPeriod());
        List<TUserDesignCourse> list = new ArrayList<>();
        TUserDesignCourse course;
        for (int i = 0; i < times; i++) {
            course = new TUserDesignCourse();
            course.settUserDesignId(tUserDesignCourse.gettUserDesignId());
            course.setCode(tUserDesignCourse.getCode());
            course.setContent(tUserDesignCourse.getContent());
            course.setPeriod(String.valueOf((i+1)));
            list.add(course);
        }
        tDesignService.saveTUserDesignCourse(list);
    }

    @RequestMapping(value = "/editCourses", method = { RequestMethod.POST, RequestMethod.GET })
    public void editCourses(@RequestBody List<TUserDesignCourse> courses){
        TUserDesignCourse course = courses.get(0);
        List<TUserDesignCourse> existList = tDesignService.getTUserDesignCourseListByDesignId(course.gettUserDesignId());

        //保存传入列表中的
        tDesignService.saveTUserDesignCourse(courses);

        //处理要删除的数据
        for (TUserDesignCourse exist: existList) {
            if(exist.getCode().contentEquals(course.getCode()) && !courses.contains(exist)){
                tDesignService.deleteCourseById(exist.getId());
            }
        }
    }

    @RequestMapping(value = "/deleteCourses", method = { RequestMethod.POST, RequestMethod.GET })
    public void deleteCourses(@RequestBody TUserDesignCourse course){
        tDesignService.deleteCoursesByCourseCode(course);
    }

    //获取课程列表
    @GetMapping("{designId}/getCourses")
    public List<TUserDesignCourse> getTUserDesignCourseList(@PathVariable Long designId){
        return tDesignService.getTUserDesignCourseListByDesignId(designId);
    }
    //查看全部
    @GetMapping("/getCourseDetailAll/{courseId}")
    public List<TUserDesignCourseDetail> getTUserDesignCourseDetailAll(@PathVariable Long courseId){
        return tDesignService.getTUserDesignCourseDetailAllByCourseId(courseId);
    }

    //编辑某天
    @GetMapping("/getCourseDetail/{courseId}")
    public List<TUserDesignCourseDetail> getTUserDesignCourseDetails(@PathVariable Long courseId){
        List<TUserDesignCourseDetail> result = tDesignService.getTUserDesignCourseDetailsByCourseId(courseId);
        Map<String, List<Dict>> map = new HashMap<>();
        List<Dict> metaDict =  this.getTrainDetailData("X");

        result.forEach(p->{
            String id = this.getItemDictId(metaDict, p.getBody());
            List<Dict> list;
            if(map.containsKey(id)){
                list = map.get(id);
            }else{
                list = sysUserService.getSpecifiedList(id);
                map.put(id, list);
            }
            p.setMuscleDict(list);

            id = getItemDictId(list, p.getMuscle());
            if(map.containsKey(id)){
                list = map.get(id);
            }else{
                list = sysUserService.getSpecifiedList(id);
                map.put(id, list);
            }
            p.setMovementDict(list);
        });

        return result;
    }

    private String getItemDictId(List<Dict> list, String body){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getLabel().equals(body)){
                return list.get(i).getId();
            }
        }
        return null;
    }

    //获取所有的健身字典--没用上
    @GetMapping("/getSysDictAll")
    public List<Dict> getTrainDetailData(){
        List<Dict> list = sysUserService.getTopTrainData();
        list.stream().forEach(param->{
            param.setChildren(sysUserService.getSpecifiedList(param.getId()));
            param.getChildren().stream().forEach(p->{
                p.setChildren(sysUserService.getSpecifiedList(p.getId()));
                p.getChildren().stream().forEach(p2->{
                    p2.setChildren(sysUserService.getSpecifiedList(p2.getId()));
                });
            });
        });
        return list;
    }

    //获取动作子列表
    @GetMapping("/getSysDict/{parentId}")
    public List<Dict> getTrainDetailData(@PathVariable String parentId){
        return sysUserService.getSpecifiedList(parentId);
    }

    //保存修改
    @RequestMapping(value = "/saveDesignCourseDetails", method = { RequestMethod.POST, RequestMethod.GET })
    public void saveUserDesignCourseDetail(@RequestBody List<TUserDesignCourseDetail> tUserDesignCourseDetails) {
        tDesignService.saveUserDesignCourseDetail(tUserDesignCourseDetails);
    }




    //模板
    @GetMapping("/demo/{desired}")
    public List<TDesignCourse> getDesignCoursesByDesired(@PathVariable String desired){
        return tDesignService.getCourseByDesired(desired);
    }

    @GetMapping("/demo/getCourseDetailAll/{code}")
    public List<TDesignCourseDetail> getDesignCourseDetailAllByCode(@PathVariable String code){
        return tDesignService.getCourseDetailAllByCode(code);
    }


    @GetMapping("/demo/getCourseDetail/{code}")
    public List<TDesignCourseDetail> getDesignCourseDetailByCode(@PathVariable String code){
        //return tDesignService.getDesignCourseDetailById(code);
        return null;
    }
}
