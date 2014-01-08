package com.eoe.basic.day02;

import java.util.Scanner;

/**
 * 不同类型的变量存放对应类型的数据，变量的值可以改变。
 * 张飞 男
 */
public class Test {//alt+/ f11:调试运行 ctrl+f11:非调试运行
	public static void main(String[] args) {
		int i=2;
		int j= 20;
		System.out.println("i="+i+"\tj="+j);
		i+=j;// i=20+2 j=20;
		j=i-j;// i=20+2 j=2
		i-=j; //i=20 j=2
		System.out.println("i="+i+"\tj="+j);
	}
}
