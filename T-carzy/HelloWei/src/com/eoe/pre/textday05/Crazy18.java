package com.eoe.pre.textday05;
import java.util.Scanner;
public class Crazy18 {
	/**
	 * 已知以下学生的姓名，键盘输入姓名，查找学生姓名。
		张飞,王菲，刘亦菲。咖啡，吗啡
	 */
	public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("输入姓名：");
			String [] name={"张飞","王菲","刘亦菲","咖啡","吗啡"};
			String getName=scanner.next();
			for(int i=0;i<name.length;i++){
				if(name[i].equals(getName)){
					System.out.println(name+"的学号是"+i);
				}
			}
	}

}
