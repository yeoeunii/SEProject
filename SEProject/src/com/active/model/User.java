package com.active.model;

import java.util.HashMap;

public class User
{
	private String id;
	private String pwd;
	private String name;
	private String phone;
	private String email;
	private String major;
	private HashMap<String,String> courseStatus;
	private int type; // information which checkout whether it is Professor or Student

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}
	
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public HashMap<String, String> getCourseStatus() {
		return courseStatus;
	}

	public void setCourseStatus(HashMap<String, String> courseStatus) {
		this.courseStatus = courseStatus;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}	
}