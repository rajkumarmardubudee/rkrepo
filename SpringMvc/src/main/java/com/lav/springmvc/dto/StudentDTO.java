package com.lav.springmvc.dto;

public class StudentDTO {
	private int id;
	private String name;
	private String dept;
	
	@Override
	public String toString() {
		return "StudentDTO [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
