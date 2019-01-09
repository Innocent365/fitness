package com.lelai.sales.controller;

import com.lelai.sales.domain.cases.*;
import com.lelai.sales.domain.modules.TXfile;
import com.lelai.sales.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import static com.lelai.sales.common.UserUtils.parseFile;


/**
 * @author hw
 * @version on 2018/11/20
 */
@RestController
@RequestMapping("/case")
public class TCaseController {

    @Autowired
    private TUserService tUserService;

    @GetMapping("/")
    public List<TUser> getAll(TUser tUser){
        List<TUser> list = tUserService.getAll(tUser);
        return list;
    }

    @GetMapping("/{id}")
    public TUser getUser(@PathVariable Long id){
        return tUserService.get(id);
    }

    @RequestMapping(value = "{id}/setCase/{sign}", method = { RequestMethod.POST, RequestMethod.GET })
    public void setCase(@PathVariable Long id, @PathVariable int sign){
        tUserService.setCase(id, sign);
    }

    /** 身体数据 */
    @GetMapping("{id}/getBodyData")
    public List<TCustomerBodyData> getBodyDataByUser(@PathVariable Long id){
        return tUserService.getBodyDateByUser(id);
    }

    @RequestMapping(value = "{id}/savePhoto/{sign}", method = { RequestMethod.POST, RequestMethod.GET })
    public void savePhoto(@PathVariable Long id, @PathVariable Integer sign, MultipartFile file){
        TXfile xfile = parseFile(file);
        xfile.setId(sign.longValue());//借用字段id用一哈
        if(xfile == null) return;
        tUserService.savePhotoByUser(id, xfile);
    }

    /** 训练概况 */
    @GetMapping("{id}/getTrainCategory")
    public List<TUserTrainCourse> getTrainCategoryByUser(@PathVariable Long id){
        return tUserService.getTUserTrainCourseByUser(id);
    }


    @GetMapping("{id}/getTrainPart")
    public List<TUserTrainPart> getTrainPartByUser(@PathVariable Long id){
        return tUserService.getTUserTrainPartByUser(id);
    }

    /** 训练日历    */
    @GetMapping("{id}/getTrainDaily")
    public List<TUserTrainDaily> getTrainDailyByUser(@PathVariable Long id){
        return tUserService.getTUserTrainDailyByUser(id);
    }

    @GetMapping("getTrainMovement/{id}")
    public List<TUserTrainMovement> getTrainMovementByCourseUser(@PathVariable Long id){
        return tUserService.getTUserTrainMovementByCourseUser(id);
    }

    /** 力量表现    */
    @GetMapping("{id}/getStrength")
    public List<TStrength> getStrengthByUser(@PathVariable Long id){
        return tUserService.getTUserStrengthByUser(id);
    }



}
