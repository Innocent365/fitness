package com.lelai.sales.dao;

import com.lelai.sales.domain.cases.*;
import com.lelai.sales.domain.modules.TCourseStoreManage;
import com.lelai.sales.domain.modules.TTrainAction;
import com.lelai.sales.domain.modules.TXfile;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author hw
 * @version on 2018/11/28
 */
@Mapper
@Component
public interface TUserCourseDao {

    List<TCourseStoreManage> getTCourseStoreManage();

    List<TUserTrainCourse> getTUserTrainCourseByUser(Long id);

    List<TUserTrainPart> getTUserTrainPartByUser(Long id);


    List<TUserTrainDaily> getTUserTrainDailyByUser(Long id);

    List<TUserTrainMovement> getTUserTrainMovement(Long id);

    List<TTrainAction> getTUserStrength(Long id);

    void insertXFile(TXfile xfile);

    void savePhoto(TUser user);

    /**
     * 根据训练id查找相关课程描述信息
     * @param planId
     * @return
     */
    TUserTrainDaily getTrainDescribe(String planId);

}
