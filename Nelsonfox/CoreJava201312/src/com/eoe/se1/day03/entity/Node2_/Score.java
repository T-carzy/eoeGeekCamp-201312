package com.eoe.se1.day03.entity.Node2_;

public class Score {
	public  int android;
	public int java;
	public int sql;
	public int oricl;
	public Score() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Score(int android, int java, int sql, int oricl) {
		super();
		this.android = android;
		this.java = java;
		this.sql = sql;
		this.oricl = oricl;
	}

	@Override
	public String toString() {
		return "Score [android=" + android + ", java=" + java + ", sql=" + sql
				+ ", oricl=" + oricl + "]";
	}

}
