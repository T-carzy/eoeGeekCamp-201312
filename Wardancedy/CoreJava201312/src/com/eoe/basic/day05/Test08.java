package com.eoe.basic.day05;

import java.util.Scanner;

public class Test08 {
	/**
	 * 已知以下学生的姓名，键盘输入姓名，查找学生姓名。
		张飞,王菲，刘亦菲。咖啡，吗啡
	 */
	public static void main(String[] args) {
		String[] names={
			"张飞","王菲","刘亦菲","咖啡","吗啡"
		};
		Scanner scanner=new Scanner(System.in);
		System.out.println("name=");
		String name=scanner.next();
		for(int i=0;i<names.length;i++){
			if(names[i].equals(name)){
				System.out.println(name+"的学号："+i);
			}
		}
	}
}
