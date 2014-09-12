package com.eoe.oop.day02;

import java.util.Arrays;

import com.eoe.oop.day02.entity.Student;

public class Test01 {
	/**
	 * 本例测试Student类的使用
	 */
	public static void main(String[] args) {
		Student student=new Student("张小飞", '男', 23, 1.89, "暴躁的", "北京达内测试学院", "TCSD1212班");
		student.say();//自我介绍
		student.feeling("按找到好工作啦!", "(*^__^*)");
		//交换两个变量值
		int[] a={5,10};
		System.out.println(Arrays.toString(a));
		student.swap(a, 0, 1);
		System.out.println(Arrays.toString(a));
	}
}
