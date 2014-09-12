package com.eoe.oop.day02;

import java.util.Arrays;

public class Code08 {

	public Code08() {
		// TODO Auto-generated constructor stub
	}

	/**本例测试Student类的使用
	 * @param args
	 */
	public static void main(String[] args) {
		Student student=new Student("小红", '女', 24, 1.70, "温柔的", "eoe极客学院", "1205班");
		student.say();//自我介绍
student.feeling("我找到好工作哦了", "恩恩！！");
//交换两个变量值
int[] a={5,10};
System.out.println(Arrays.toString(a));
student.swap(a, 0, 1);
System.out.println(Arrays.toString(a));
	}

}
