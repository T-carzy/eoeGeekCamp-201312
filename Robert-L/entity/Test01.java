package com.eoe.pre.oop.day03.entity;

public abstract class Test01 {
public static void main(String[] args) {
	Person02[] people=new Person02[4];
	people[0]=new Student("李伟", '男', 23, 1.79, "开朗的", "eoe极客学院", "android1205班");
	people[1]=new Teacher();
	people[2]=new Student();
	people[3]=new Teacher();
	for (int i = 0; i < people.length; i++) {
		people[i].say();
		people[i].doing();
	}
}
}
