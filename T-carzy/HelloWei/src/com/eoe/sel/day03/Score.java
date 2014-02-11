package com.eoe.sel.day03;

public class Score {

		public int java;
		public int android;
		public int sql;
		public int oracle;
		public Score() {

		}
		public Score(int java, int android, int sql, int oracle) {
			super();
			this.java = java;
			this.android = android;
			this.sql = sql;
			this.oracle = oracle;
		}
		@Override
		public String toString() {
			return "Score [java=" + java + ", android=" + android + ", sql="
					+ sql + ", oracle=" + oracle + "]";
		}
		

}
