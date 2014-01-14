package com.eoe.pre.oop.day03.entity;

public class Person {


	public static void main(String[] args) {
			Person1[] p=new Person1[4];
			p[0]=new Student("王多英", '男', 22, 1.89, "变态的", "eoe极客训练营", "1205班");
			p[1]=new Teacher("张大飞", '男', 33, 1.79, "豪放的", "eoe极客训练营", "讲师");
			p[2]=new Student("梁文峰", '男', 25, 1.29, "柔弱的", "eoe极客训练营", "1205班");
			p[3]=new Teacher("王大菲", '女', 33, 1.79, "文静的", "eoe极客训练营", "班主任");
			for (int i = 0; i < p.length; i++) {
				p[i].say();
				p[i].doing();
			}
	}

}
