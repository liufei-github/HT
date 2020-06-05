package com.gs.bean;

import java.util.Date;

/**
 * Created by Administrator on 2019/2/17.
 */
public class DepartmentDetail {
    private int id;

    @Override
    public String toString() {
        return "DepartmentDetail{" +
                "id=" + id +
                ", createBy='" + createBy + '\'' +
                ", createTime=" + createTime +
                '}';
    }

    private String createBy;
    private Date createTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
