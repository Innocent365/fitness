package com.lelai.sales.service;

import com.lelai.sales.dao.SysDictDao;
import com.lelai.sales.dao.SysUserDao;
import com.lelai.sales.domain.modules.Dict;
import com.lelai.sales.domain.modules.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author hw
 * @version on 2018/11/23
 */
@Service
public class SysUserService {

    @Autowired
    public SysUserDao sysUserDao;

    @Autowired
    public SysDictDao sysDictDao;

    public SysUser getSysUser(String loginName){
        return sysUserDao.getSysUser(loginName);
    }

    public List<Dict> getTopTrainData(){
        return sysDictDao.findList("X");
    }

    public List<Dict> getSpecifiedList(String parentId){
        return sysDictDao.findList(parentId);
    }
}
