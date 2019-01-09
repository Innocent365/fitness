package com.lelai.sales.dao;


import com.lelai.sales.domain.design.TUserDesign;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * @author hw
 * @version on 2018/9/25
 */
@Mapper
@Component
public interface TUserDesignDao {


    List<TUserDesign> getList();

    TUserDesign get(Long id);

    void insert(TUserDesign tUserDesign);

    void update(TUserDesign tUserDesign);

}
