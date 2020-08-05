package com.sx.ssqMVC.service.ServiceImpl;

import com.sx.ssqMVC.bean.RwsBean;
import com.sx.ssqMVC.dao.MyDAO;
import com.sx.ssqMVC.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by sunsq on 2020/7/30.
 */
@Service
public class MyServiceImpl implements MyService{

    @Autowired
    private MyDAO dao;

    @Override
    public void insertRwsxx(RwsBean rwsxx) throws Exception {
        dao.insertRwsxx(rwsxx);
    }
}