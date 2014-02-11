package com.eoe.se1.day05;

public class Test15 {
	public enum Season_2{
		SPRING("春天"),SUMMER("夏天"),AUTUN("秋天"),WINTER("冬天");
		public String name;
		private Season_2(String name) {
			this.name=name;
		}
		@Override
		public String toString() {
			return this.name;
		}
	}
	public static void main(String[] args) {
		Season_2 season=Season_2.SUMMER;
		System.out.println(season);
	}
}
