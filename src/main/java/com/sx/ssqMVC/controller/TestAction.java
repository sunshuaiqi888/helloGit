package com.sx.ssqMVC.controller;

import com.sx.ssqMVC.bean.RwsBean;
import com.sx.ssqMVC.service.MyService;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by sunsq on 2020/7/27.
 */
@Controller
@RequestMapping("/Test")
public class TestAction {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private MyService service;

    /**
     * 跳转页面
     * @return
     */
    @RequestMapping("/test")
    public String one_test(){
        System.out.println("test");

        return "index";
    }



    /**
     * 跳转页面  加返回数据
     * @return
     */
    @RequestMapping("/one_test")
    public String two_test(HttpServletRequest request, HttpServletResponse response){
        System.out.println("one_test");
        int a = 1;
        int b = 2;
        request.getSession().setAttribute("data",a+b);
        return "Views/one_test";
    }


    @RequestMapping("/three_test")
    @ResponseBody
    public String three_test(HttpServletRequest request,HttpServletResponse response){

        RwsBean rwsxx = new RwsBean();
        rwsxx.setTask_id("ceshiid");
        rwsxx.setTask_des("这是一条神奇的数据");
        try {
            service.insertRwsxx(rwsxx);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("three_test","异常信息",e.getMessage());
        }
        return "success";
    }


}