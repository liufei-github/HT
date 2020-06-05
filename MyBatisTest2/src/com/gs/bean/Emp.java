package com.gs.bean;

/**
 * Created by Administrator on 2019/2/16.
 */
public class Emp {
    private int id;
    private String ename;
    private int age;
    private int did;//部门ID

    public Emp() {
    }

    public Emp(String ename, int age, int did) {
        this.ename = ename;
        this.age = age;
        this.did = did;
    }

    @Override

    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", ename='" + ename + '\'' +
                ", age=" + age +
                ", did=" + did +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }
}
