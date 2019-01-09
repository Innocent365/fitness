package com.lelai.sales.dao;

import com.lelai.sales.domain.design.TDesignCourse;
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
public interface TDesignCourseDao  {

    List<TDesignCourse> getByDesired(String desired);
}