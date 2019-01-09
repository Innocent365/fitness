package com.lelai.sales.dao;

import com.lelai.sales.domain.cases.TCustomerBodyData;
import com.lelai.sales.domain.cases.TUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author hw
 * @version on 2018/11/23
 */
@Mapper
@Component
public interface TUserDao {

    List<TUser> findList(TUser tUser);

    TUser get(Long id);

    void setIsCase(@Param("id")Long id, @Param("sign") int sign);

    List<TCustomerBodyData> getBodyDateByUser(Long id);

}
