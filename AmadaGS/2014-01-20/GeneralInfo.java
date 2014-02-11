package com.example.day13;

public class GeneralInfo {

	private int pothoId;
	private String name;
	public int getPothoId() {
		return pothoId;
	}
	public void setPothoId(int pothoId) {
		this.pothoId = pothoId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public GeneralInfo() {
		// TODO Auto-generated constructor stub
	}
	public GeneralInfo(int pothoId, String name) {
		super();
		this.pothoId = pothoId;
		this.name = name;
	}
}
