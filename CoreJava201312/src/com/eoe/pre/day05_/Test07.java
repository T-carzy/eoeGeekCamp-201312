package com.eoe.pre.day05_;

import java.util.Scanner;

public class Test07 {

	/**
	 *已知以下学生的姓名，键盘输入姓名，查找学生姓名。
                  张飞,王菲，刘亦菲，咖啡，吗啡

	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String[] names={"张飞","王菲","刘亦菲","咖啡","吗啡"};
		System.out.println("输入姓名:");
		String name=scanner.next();
		for (int i = 0; i < names.length; i++) {
			if(name.equals(names[i])){
				System.out.println(i);
				break;
			}
		}
	}

}
