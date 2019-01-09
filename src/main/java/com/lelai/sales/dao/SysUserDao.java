package com.lelai.sales.dao;

import com.lelai.sales.domain.modules.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;


/**
 * @author hw
 * @version on 2018/11/23
 */
@Mapper
@Component
public interface SysUserDao {

    SysUser getSysUser(String loginName);
}
