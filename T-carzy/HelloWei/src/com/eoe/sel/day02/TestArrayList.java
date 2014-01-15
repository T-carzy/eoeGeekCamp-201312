package com.eoe.sel.day02;

import java.util.ArrayList;
import java.util.Scanner;

public class TestArrayList {


	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		ArrayList <String> names=new ArrayList();
		names.add("张飞");
		names.add("马超");
		names.add("刘备");
		names.add("关羽");
		names.add(1, "赵云");
		names.remove(0);
		names.set(3, "黄忠");
		
		System.out.println(names);
		System.out.println("*******************");
		for (String s : names) {
			System.out.println(s);
			
		}
		System.out.println("------------------------");
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
			
		}
		//黄忠
		System.out.println("------------------------");
		System.err.println("输入一个三国时期的人物，猜中有奖");
		String ss=scanner.next();
		if(names.contains(ss)){
			System.out.println("猜对了");
			
		}
		System.out.println("------------------------");
		if(!names.isEmpty()){
			System.out.println(names.toString());
			names.clear();
			
		}
		System.out.println("全部清空");
		System.out.println("------------------------");
	
		
	}

}
