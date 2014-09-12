package com.eoe.pre.oop.day03;

import com.eoe.pre.oop.day03.entity.Person02;
import com.eoe.pre.oop.day03.entity.Student;
import com.eoe.pre.oop.day03.entity.Teacher;

public class Test16 {
	public static void main(String[] args) {
		Person02[] people = new Person02[4];
		people[0] = new Student("张飞", '男', 23, 1.8, "开朗的", "eoe极客学院",
				"android1205班");
		people[1] = new Teacher("李四", '男', 55, 1.7, "稳重的", "eoe极客学院", "任职讲师");
		people[2] = new Student("王五", '女', 24, 1.6, "活泼的", "eoe极客学院",
				"android1205班");

		// 用匿名内部类 的形式将建对象并保存在集合中
		people[3] = new Person02("刘亦菲", '女', 25, 1.7, "温柔的") {
			String unit = "中央戏剧学院";
			String worker = "演员";

			@Override
			public void say() {
				// TODO Auto-generated method stub
				super.say();
				System.out.println("俺在 " + unit + "做" + worker);
			}

			// 实现父类的抽象方法
			public void doing() {
				System.out.println(this.name + "在演戏、、、");
			}
		};
		// 调用集合中个对象说话、做事
		for (Person02 p : people) {
			p.say();
			p.doing();
			System.out.println("*********************");
		}
	}
}
