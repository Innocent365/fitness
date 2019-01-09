package com.lelai.sales.dao;

import com.lelai.sales.domain.cases.TUserHiitDetail;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author hw
 * @version on 2018/12/20
 */
@Mapper
@Component
public interface TUserHiitDetailDao {

    Long insert(TUserHiitDetail hiitDetail);
    void update(TUserHiitDetail hiitDetail);
    TUserHiitDetail get(Long id);

    void deleteList(Long hiitId);

    List<TUserHiitDetail> findList(Long hiitId);

}
