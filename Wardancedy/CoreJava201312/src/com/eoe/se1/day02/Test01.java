package com.eoe.se1.day02;

import java.util.ArrayList;

public class Test01 {
	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		names.add("张飞");
		names.add("王菲");
		names.add("刘亦菲");
		names.add(0, "咖啡");
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		System.out.println();
		for(String name:names){
			System.out.println(name);
		}
		System.out.println(names);
		/*
		 * 1.在本题的基础上对以上集合进行删除某个元素、修改某个元素的操作
		   2.清除集合所有元素，清除前判断集合非空。
		   3.键盘输入一个人名，判断是否是集合中的某人。
		 * 
		 */
		
	}
}
