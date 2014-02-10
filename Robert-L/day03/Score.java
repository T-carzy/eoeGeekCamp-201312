package com.eoe.se1.day03;

import java.util.ArrayList;

public class Score {
		public  int java;
		public int andriod;
		public int sql;
		public int oracle;
	public Score() {
		// TODO Auto-generated constructor stub
	}
	public Score(int java, int andriod, int sql, int oracle) {
		super();
		this.java = java;
		this.andriod = andriod;
		this.sql = sql;
		this.oracle = oracle;
	}
	@Override
	public String toString() {
		return "Score [java=" + java + ", andriod=" + andriod + ", sql=" + sql
				+ ", oracle=" + oracle + "]";
	}
	
	
}
