package com.lelai.sales.dao;


import com.lelai.sales.domain.design.TUserDesignCourse;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * @author hw
 * @version on 2018/9/25
 */
@Mapper
@Component
public interface TUserDesignCourseDao {

    List<TUserDesignCourse> getListByDesignId(Long tUserDesignId);

    void insert(TUserDesignCourse tUserDesignCourse);

    void update(TUserDesignCourse tUserDesignCourse);

    void delete(Long id);

    void deleteCoursesByCode(TUserDesignCourse course);

}
