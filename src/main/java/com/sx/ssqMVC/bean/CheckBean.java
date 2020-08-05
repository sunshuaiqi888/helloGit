package com.sx.ssqMVC.bean;

/**
 * Created by sunsq on 2020/8/4.
 */
public class CheckBean {

    private String inspect_id;
    private String task_id;
    private String ath_id;

    public String getInspect_id() {
        return inspect_id;
    }

    public void setInspect_id(String inspect_id) {
        this.inspect_id = inspect_id;
    }

    public String getTask_id() {
        return task_id;
    }

    public void setTask_id(String task_id) {
        this.task_id = task_id;
    }

    public String getAth_id() {
        return ath_id;
    }

    public void setAth_id(String ath_id) {
        this.ath_id = ath_id;
    }

    public CheckBean(String inspect_id, String task_id, String ath_id) {
        this.inspect_id = inspect_id;
        this.task_id = task_id;
        this.ath_id = ath_id;
    }

    public CheckBean() {
    }

    @Override
    public String toString() {
        return "CheckBean{" +
                "inspect_id='" + inspect_id + '\'' +
                ", task_id='" + task_id + '\'' +
                ", ath_id='" + ath_id + '\'' +
                '}';
    }
}