package com.eoe.se1.day03.entity.Node2_;

public class Scores {
int java;
int android;
int oracle;
int sql;

	public Scores() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "Scores [java=" + java + ", android=" + android + ", oracle="
				+ oracle + ", sql=" + sql + "]";
	}

	public Scores(int java, int android, int oracle, int sql) {
		super();
		this.java = java;
		this.android = android;
		this.oracle = oracle;
		this.sql = sql;
	}

}
