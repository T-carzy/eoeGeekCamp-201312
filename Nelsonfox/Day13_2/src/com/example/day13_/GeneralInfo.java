package com.example.day13_;

public class GeneralInfo {
	private int photoId;
	private String name;
	public int getPhotoId() {
		return photoId;
	}
	public void setPhotoId(int photoId) {
		this.photoId = photoId;
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
	 * @param photoId
	 * @param name
	 */
	public GeneralInfo(int photoId, String name) {
		super();
		this.photoId = photoId;
		this.name = name;
	}
}
