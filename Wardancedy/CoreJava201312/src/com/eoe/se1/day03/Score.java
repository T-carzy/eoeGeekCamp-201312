package com.eoe.se1.day03;

public class Score {
	public int java;
	public int android;
	public int sql;
	public int oralce;
	public Score() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param java
	 * @param android
	 * @param sql
	 * @param oralce
	 */
	public Score(int java, int android, int sql, int oralce) {
		super();
		this.java = java;
		this.android = android;
		this.sql = sql;
		this.oralce = oralce;
	}
	@Override
	public String toString() {
		return "Score [java=" + java + ", android=" + android + ", sql=" + sql
				+ ", oralce=" + oralce + "]";
	}
}
