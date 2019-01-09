package com.lelai.sales.dao;


import com.lelai.sales.domain.design.TUserDesignCourse;
import com.lelai.sales.domain.design.TUserDesignCourseDetail;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * @author hw
 * @version on 2018/9/25
 */
@Mapper
@Component
public interface TUserDesignCourseDetailDao {


    List<TUserDesignCourseDetail> getList(Long tUserDesignCourseId);

    List<TUserDesignCourseDetail> getAll(Long tUserDesignCourseId);

    void insert(TUserDesignCourseDetail tUserDesignCourseDetail);

    void update(TUserDesignCourseDetail tUserDesignCourseDetail);

    void deleteAll(Long tUserDesignCourseId);

    void deleteByCourse(TUserDesignCourse course);

    void delete(Long id);

}
