package com.sx.ssqMVC.bean;

import java.util.List;

/**
 * Created by sunsq on 2020/7/30.
 */
public class RwsBean {

    private String task_id;
    private String task_unified_id;
    private String task_booknum;
    private String task_des;
    private String task_starttime;
    private String task_endtime;
    private String sport_id;
    private String check_place;
    private String czy_id;
    private String  dis_id;
    private String ttime; //(change_time)别名

    private List<CheckBean> jcds;


    public RwsBean(String task_id) {
        this.task_id = task_id;
    }

    public RwsBean() {
    }

    public String getTask_id() {
        return task_id;
    }

    public void setTask_id(String task_id) {
        this.task_id = task_id;
    }

    public String getTask_unified_id() {
        return task_unified_id;
    }

    public void setTask_unified_id(String task_unified_id) {
        this.task_unified_id = task_unified_id;
    }

    public String getTask_booknum() {
        return task_booknum;
    }

    public void setTask_booknum(String task_booknum) {
        this.task_booknum = task_booknum;
    }

    public String getTask_des() {
        return task_des;
    }

    public void setTask_des(String task_des) {
        this.task_des = task_des;
    }

    public String getTask_starttime() {
        return task_starttime;
    }

    public void setTask_starttime(String task_starttime) {
        this.task_starttime = task_starttime;
    }

    public String getTask_endtime() {
        return task_endtime;
    }

    public void setTask_endtime(String task_endtime) {
        this.task_endtime = task_endtime;
    }

    public String getSport_id() {
        return sport_id;
    }

    public void setSport_id(String sport_id) {
        this.sport_id = sport_id;
    }

    public String getCheck_place() {
        return check_place;
    }

    public void setCheck_place(String check_place) {
        this.check_place = check_place;
    }

    public String getCzy_id() {
        return czy_id;
    }

    public void setCzy_id(String czy_id) {
        this.czy_id = czy_id;
    }

    public String getDis_id() {
        return dis_id;
    }

    public void setDis_id(String dis_id) {
        this.dis_id = dis_id;
    }

    public String getTtime() {
        return ttime;
    }

    public void setTtime(String ttime) {
        this.ttime = ttime;
    }

    public List<CheckBean> getJcds() {
        return jcds;
    }

    public void setJcds(List<CheckBean> jcds) {
        this.jcds = jcds;
    }

    @Override
    public String toString() {
        return "RwsBean{" +
                "task_id='" + task_id + '\'' +
                ", task_unified_id='" + task_unified_id + '\'' +
                ", task_booknum='" + task_booknum + '\'' +
                ", task_des='" + task_des + '\'' +
                ", task_starttime='" + task_starttime + '\'' +
                ", task_endtime='" + task_endtime + '\'' +
                ", sport_id='" + sport_id + '\'' +
                ", check_place='" + check_place + '\'' +
                ", czy_id='" + czy_id + '\'' +
                ", dis_id='" + dis_id + '\'' +
                ", ttime='" + ttime + '\'' +
                ", checkBeens=" + jcds+
                '}';
    }
}