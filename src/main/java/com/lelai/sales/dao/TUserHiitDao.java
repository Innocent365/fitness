package com.lelai.sales.dao;

import com.lelai.sales.domain.cases.TUserHiit;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author hw
 * @version on 2018/12/1
 */
@Mapper
@Component
public interface TUserHiitDao {

    Long insert(TUserHiit hiit);
    void update(TUserHiit hiit);
    TUserHiit get(Long id);
    void delete(Long id);

    List<TUserHiit> findList(Long id);

}
