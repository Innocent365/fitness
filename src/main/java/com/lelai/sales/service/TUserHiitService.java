package com.lelai.sales.service;

import com.lelai.sales.dao.TUserHiitDao;
import com.lelai.sales.dao.TUserHiitDetailDao;
import com.lelai.sales.domain.cases.TUserHiit;
import com.lelai.sales.domain.cases.TUserHiitDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hw
 * @version on 2018/12/1
 */
@Service
public class TUserHiitService {

    @Autowired
    private TUserHiitDao tUserHiitDao;

    @Autowired
    private TUserHiitDetailDao tUserHiitDetailDao;

    public TUserHiit get(Long id) {
        TUserHiit tUserHiit = tUserHiitDao.get(id);
        tUserHiit.setDetails(tUserHiitDetailDao.findList(tUserHiit.getId()));
        return tUserHiit;
    }

    public Long save(TUserHiit hiit) {
        if(hiit.getId()!=null){
            tUserHiitDao.update(hiit);
            tUserHiitDetailDao.deleteList(hiit.getId());
        }else{
            tUserHiitDao.insert(hiit);
        }

        for (TUserHiitDetail t: hiit.getDetails()) {
            t.settUserHiitId(hiit.getId());
            tUserHiitDetailDao.insert(t);
        }
        return hiit.getId();
    }


    public void delete(Long id) {
        tUserHiitDao.delete(id);
        tUserHiitDetailDao.deleteList(id);
    }

    public List<TUserHiit> getTUserHiitByUser(Long id) {
        List<TUserHiit> list = tUserHiitDao.findList(id);
        list.forEach(p->{
            p.setDetails(tUserHiitDetailDao.findList(p.getId()));
        });
        return list;
    }
}
