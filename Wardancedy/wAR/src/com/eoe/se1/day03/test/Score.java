package com.eoe.se1.day03.test;

public class Score {
	 int java;
	 int android;
	 int ppt;
	 int app;
	public Score() {
	// TODO Auto-generated constructor stub
}
	public Score(int java, int android, int ppt, int app) {
		super();
		this.java = java;
		this.android = android;
		this.ppt = ppt;
		this.app = app;
	}
	@Override
	public String toString() {
		return "Score [java=" + java + ", android=" + android + ", ppt=" + ppt
				+ ", app=" + app + "]";
	}
	
}
