package com.lelai.sales.dao;

import com.lelai.sales.domain.modules.Dict;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author hw
 * @version on 2018/12/14
 */
@Mapper
@Component
public interface SysDictDao {

    List<Dict> findList(String parentId);
}
