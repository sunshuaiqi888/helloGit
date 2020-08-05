package com.sx.ssqMVC.dao;

import com.sx.ssqMVC.bean.RwsBean;

import java.util.List;
import java.util.Map;

/**
 * Created by sunsq on 2020/7/30.
 */
public interface MyDAO {

    void insertRwsxx(RwsBean rwsxx) throws Exception;

    int deleteRwsxxById(String task_id) throws Exception;

    int updateRwsById(RwsBean rwsxx) throws Exception;

    List<RwsBean> findAll() throws Exception;

    Map<String,RwsBean>  findAllToMap() throws Exception;

    RwsBean selectRwsById(String id) throws Exception;

    RwsBean selectRwsByDes(String des) throws Exception;

    /**
     * if动态语句查询
     * @param tj
     * @return
     * @throws Exception
     */
    List<RwsBean> rwsxxif(RwsBean tj) throws Exception;

    /**
     * where动态语句查询
     * @param tj
     * @return
     * @throws Exception
     */
    List<RwsBean> rwsxxwhere(RwsBean tj) throws Exception;

    /**
     * choose动态语句查询
     * @param tj
     * @return
     * @throws Exception
     */
    List<RwsBean> rwsxxchoose(RwsBean tj) throws Exception;

    /**
     * foreach动态语句查询
     * @param tj
     * @return
     * @throws Exception
     */
    List<RwsBean> rwsxxforeach(Object[] tj) throws Exception;

    /**
     * foreach list动态语句查询
     * @param tj
     * @return
     * @throws Exception
     */
    List<RwsBean> rwsxxforeachlist(List<Object> tj) throws Exception;

    /**
     * 引入sql查询
     * @param tj
     * @return
     * @throws Exception
     */
    List<RwsBean> rwsxxSqlFragment(List<RwsBean> tj) throws Exception;
}
