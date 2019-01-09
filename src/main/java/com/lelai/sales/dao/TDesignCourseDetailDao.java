package com.lelai.sales.dao;


import com.lelai.sales.domain.design.TDesignCourseDetail;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * salesDAO接口
 * @author sales
 * @version 2018-12-11
 */

@Mapper
@Component
public interface TDesignCourseDetailDao  {

    List<TDesignCourseDetail> getCourseDetailByCode(String code);

    List<TDesignCourseDetail> getCourseDetailById(String designCourseId);
}