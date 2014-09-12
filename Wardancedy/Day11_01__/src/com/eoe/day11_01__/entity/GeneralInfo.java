package com.eoe.day11_01__.entity;

public class GeneralInfo<String> {
	private int photoid;
	private String name;
	public int getPhotoid() {
		return photoid;
	}
	public void setPhotoid(int photoid) {
		this.photoid = photoid;
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
	/**
	 * @param photoid
	 * @param name
	 */
	public GeneralInfo(int photoid, String name) {
		super();
		this.photoid = photoid;
		this.name = name;
	}
}
