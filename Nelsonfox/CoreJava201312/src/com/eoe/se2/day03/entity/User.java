package com.eoe.se2.day03.entity;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVerionUID=1L;
    private int id;
    private String pwd;
    public String name;
    public User() {
	// TODO Auto-generated constructor stub
}
	public User(int id, String pwd, String name) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", pwd=" + pwd + ", name=" + name + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public static long getSerialverionuid() {
		return serialVerionUID;
	}
    
}
