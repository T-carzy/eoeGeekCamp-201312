package com.eoe.se1.day01;

import com.eoe.day03.entity.Person;
import com.eoe.day03.entity.Student;
import com.eoe.day03.entity.Teacher;

public class Test08 {
	public static void main(String[] args) {
		Person[] people = new Person[4];
		people[0] = new Student("张小飞", '男', 23, 1.79, "豪放的", "eoe极客训练营",
				"eoe1205班");
		people[1] = new Teacher("张大飞", '男', 33, 1.89, "狂野的", "eoe极客训练营", "讲师");
		people[2] = new Student("王小菲", '女', 23, 1.69, "温柔的", "eoe极客训练营",
				"eoe1205班");
		// 抽象类的一个子类的对象
		people[3] = new Person("刘亦菲", '女', 28, 1.7, "文静的") {
			String unit = "中央戏曲学院";
			String worker = "电影演员";

			@Override
			public void doing() {
				System.out.println(this.name + "正在演戏");
			}

			@Override
			public void say() {
				super.say();
				System.out.println("俺在" + unit + "当" + worker);
			}
		};
		for (Person p : people) {
			p.say();
			p.doing();
			System.out.println("****************");
		}
	}
}
