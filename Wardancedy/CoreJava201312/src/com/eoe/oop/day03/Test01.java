package com.eoe.oop.day03;

import com.eoe.oop.day03.entity.Person;
import com.eoe.oop.day03.entity.Student;
import com.eoe.oop.day03.entity.Teacher;

public class Test01 {
	public static void main(String[] args) {
		Person[] people=new Person[4];
		people[0]=new Student("李伟疯", '男', 22, 1.89, "活泼的", "eoe极客训练营", "1205班");
		people[1]=new Teacher("张大飞", '男', 33, 1.79, "豪放的", "eoe极客训练营", "讲师");
		people[2]=new Student("粱文疯", '男', 25, 1.29, "狂妄的", "eoe极客训练营", "1205班");
		people[3]=new Teacher("王大菲", '女', 33, 1.79, "文静的", "eoe极客训练营", "班主任");
		for (int i = 0; i < people.length; i++) {
			people[i].say();
			people[i].doing();
		}
	}
	/*
	 * 抽象方法不能是
	 * 构造方法 static
	 * 静态方法不能声明为抽象方法
	 * 私有的方法不能声明为抽象方法
	 * final声明的方法不能声明为抽象方法
	 */
}
