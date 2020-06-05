package com.gs.bean;

import java.util.List;

public class Department {
	private int id;
	private String title;
	private String des;

	//在一的一端陪一的一端的对象
	private DepartmentDetail detail;

	//在一的一端配多的一端的List
	private List<Emp> emps;

	public List<Emp> getEmps() {
		return emps;
	}

	public void setEmps(List<Emp> emps) {
		this.emps = emps;
	}

	public DepartmentDetail getDetail() {
		return detail;
	}

	public void setDetail(DepartmentDetail detail) {
		this.detail = detail;
	}

	public Department() {
	}

	public Department(int id, String title, String des) {
		this.id = id;
		this.title = title;
		this.des = des;
	}

	public Department(String title, String des) {
		this.title = title;
		this.des = des;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", title=" + title + ", des=" + des
				+ "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	
}
