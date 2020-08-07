package com.sx.ssqMVC.test.java;

import com.sx.ssqMVC.bean.CheckBean;
import com.sx.ssqMVC.bean.RwsBean;
import com.sx.ssqMVC.dao.MyDAO;
import com.sx.ssqMVC.dao.MyDAONew;
import com.sx.ssqMVC.mybatisutil.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by sunsq on 2020/7/30.
 */
public class MyDAOTest {

    @Autowired
    private MyDAO dao;
    @Autowired
    private MyDAONew newdao;
    @Autowired
    private SqlSession session;


    /**
     * 获取sqlsession的dao
     */
    @Before
    public void setUp(){
        session = MybatisUtil.getSqlSession();
        dao = session.getMapper(MyDAO.class);
        newdao = session.getMapper(MyDAONew.class);
    }




    /**
     * 关闭sqlsession
     */
    @After
    public void setEnd(){
        if (session!=null){
            session.close();
        }
    }


    @Test
    public void TestDemo1() throws IOException {
        List<RwsBean> list = null;
        try {
            list = dao.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        session.commit();
        if (list!=null){
            for (RwsBean rwsBean : list) {
                System.out.println(rwsBean);
            }
        }
    }

    @Test
    public void TestDemo2() throws IOException {
        String s = "121";
        try {
            RwsBean bean = dao.selectRwsById(s);
            if (bean!=null){
                System.out.println(bean);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * if动态查询
     * @throws IOException
     */
    @Test
    public void TestDemo3() throws IOException {
        RwsBean tj = new RwsBean();
        tj.setTask_id("121");
        try {
            List<RwsBean> list = dao.rwsxxif(tj);
            if (list!=null && list.size()>0){
                for (RwsBean bean : list) {
                    System.out.println(bean);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    /**
     * where动态查询
     * @throws IOException
     */
    @Test
    public void TestDemo4() throws IOException {
        RwsBean tj = new RwsBean();
        tj.setTask_id("121");
        try {
            List<RwsBean> list = dao.rwsxxwhere(tj);
            if (list!=null && list.size()>0){
                for (RwsBean bean : list) {
                    System.out.println(bean);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * choose动态查询
     * @throws IOException
     */
    @Test
    public void TestDemo5() throws IOException {
        RwsBean tj = new RwsBean();
        tj.setTask_des("神");
        try {
            List<RwsBean> list = dao.rwsxxchoose(tj);
            if (list!=null && list.size()>0){
                for (RwsBean bean : list) {
                    System.out.println(bean);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    /**
     * foreach动态查询
     * @throws IOException
     */
    @Test
    public void TestDemo6() throws IOException {
        Object[] tj = new Object[]{"121","122","123"};
        try {
            List<RwsBean> list = dao.rwsxxforeach(tj);
            if (list!=null && list.size()>0){
                for (RwsBean bean : list) {
                    System.out.println(bean);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * foreach list动态查询
     * @throws IOException
     */
    @Test
    public void TestDemo7() throws IOException {
        List<Object> tj = new ArrayList<Object>();
        tj.add("121");
        tj.add("122");
        tj.add("123");
        try {
            List<RwsBean> list = dao.rwsxxforeachlist(tj);
            if (list!=null && list.size()>0){
                for (RwsBean bean : list) {
                    System.out.println(bean);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    /**
     * 引入自定义sql查询
     * @throws IOException
     */
    @Test
    public void TestDemo8() throws IOException {
        List<RwsBean> tj = new ArrayList<RwsBean>();
        tj.add(new RwsBean("121"));
        tj.add(new RwsBean("122"));
        tj.add(new RwsBean("123"));
        try {
            List<RwsBean> list = dao.rwsxxSqlFragment(tj);
            if (list!=null && list.size()>0){
                for (RwsBean bean : list) {
                    System.out.println(bean);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    //*******************************联合查询******************************************

    /**
    今天周五
     * 联合查询 一对多
     * @throws IOException
     */
    @Test
    public void TestDemo9() throws IOException {
        String task_id = "dx20200709";
        try {
            RwsBean bean = newdao.selectRwsById(task_id);
            if (bean!=null){
                System.out.println(bean);
                if (bean.getJcds().size()>0){
                    for (CheckBean checkBean : bean.getJcds()) {
                        System.out.println(checkBean);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
