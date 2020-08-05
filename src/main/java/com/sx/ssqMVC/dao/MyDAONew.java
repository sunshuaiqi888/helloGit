package com.sx.ssqMVC.dao;

import com.sx.ssqMVC.bean.CheckBean;
import com.sx.ssqMVC.bean.RwsBean;

import java.util.List;

/**
 * Created by sunsq on 2020/8/4.
 */
public interface MyDAONew {

    RwsBean selectRwsById(String task_id) throws Exception;

    List<CheckBean> selectCheckByRwsid(String rwsid) throws Exception;
}
