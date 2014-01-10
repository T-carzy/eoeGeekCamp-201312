package com.eoe.pre.oop.day02;
import java.util.Arrays;

import com.eoe.pre.oop.day01.Student;

public class Test02 {
	/**
	 * 本例测试Student类的使用
	 */
	public static void main(String[] args) {
		Student student=new Student("李伟",'男',22,1.8,"开朗的","eoe极客学院","android1205班");
		student.say();
		student.feeling("我找到好工作了", "呵呵、、、");
		//交换两个变量值
		int[] a={2,10};
		System.out.println(Arrays.toString(a));
		student.swap(a, 0, 1);
		System.out.println(Arrays.toString(a));
		
	}
}

