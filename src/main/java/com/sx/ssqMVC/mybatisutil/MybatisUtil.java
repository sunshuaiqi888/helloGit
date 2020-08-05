package com.sx.ssqMVC.mybatisutil;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by sunsq on 2020/7/30.
 *
 * 由于每一次执行 SqlSession 的方法，均需首先获取到该对象。而 SqlSession 对象的获取
 * 又相对比较繁琐，所以，可以将获取 SqlSession 对象定义为一个工具类方法。
 * SqlSession 对象是通过 SqlSessionFactory 对象创建的。由于 SqlSessionFactory 类为重量级
 * 对象，且为线程安全的，所以可以将 SqlSessionFactory 对象定义为单例的。
 */
public class MybatisUtil {

    private static SqlSessionFactory factory;

    public static SqlSession getSqlSession(){
        try {

            if (factory == null){

                InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");

                factory = new SqlSessionFactoryBuilder().build(inputStream);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return factory.openSession();
    }
}