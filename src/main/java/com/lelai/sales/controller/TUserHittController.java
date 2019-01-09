package com.lelai.sales.controller;

import com.lelai.sales.domain.cases.TUserHiit;
import com.lelai.sales.service.TUserHiitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author hw
 * @version on 2018/12/1
 */
@RestController
@RequestMapping("/hiit")
public class TUserHittController {

    @Autowired
    private TUserHiitService tUserHiitService;

    /** HIIT测试    */
    //@PostMapping("/save")
    @RequestMapping(value = "/save", method = { RequestMethod.POST, RequestMethod.GET })
    //@RequestMapping(value = "/save/{hiit}", method = RequestMethod.POST)
    public Long saveHiit(@RequestBody TUserHiit hiit){
        return tUserHiitService.save(hiit);
    }

    @GetMapping("/{id}")
    public TUserHiit getHiit(@PathVariable Long id){
        return tUserHiitService.get(id);
    }

    @DeleteMapping("/{id}")
    public void delHiit(@PathVariable Long id){
        tUserHiitService.delete(id);
    }

    @GetMapping("{id}/getList")
    public List<TUserHiit> getHiitByUser(@PathVariable Long id){
        return tUserHiitService.getTUserHiitByUser(id);
    }

}
