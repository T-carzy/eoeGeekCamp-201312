package com.eoe.se1.day01;
import com.eoe.oop.day3.Person;
import com.eoe.oop.day3.Student;
import com.eoe.oop.day3.Teacher;


public class Test04 {
	public static void main(String[] args) {
		Person[] people=new Person[4];
		people[0]=new Student("高珊", '女', 23, 1.65, "开朗的", "eoe极客训练营", "1205班");
		people[1]=new Teacher("张飞", '男', 33, 1.76, "慈祥的", "eoe极客训练营", "1205班");
		people[2]=new Student("刘兰", '女', 23, 1.65, "开朗的", "eoe极客训练营", "1205班");
		people[3]=new Person("张飞", '男', 63, 1.76, "慈祥的") {
			String unit="中央戏曲学院";
			String worker="演员";
			@Override
			public void say() {
				super.say();
				System.out.println("俺在"+this.unit+"做"+this.worker);
			}
			@Override
			public void doing() {
				System.out.println(this.name+"演戏。。");
			}
		};
		for(Person p:people){
			p.say();
			p.doing();
			System.out.println();
		}
	}
}
