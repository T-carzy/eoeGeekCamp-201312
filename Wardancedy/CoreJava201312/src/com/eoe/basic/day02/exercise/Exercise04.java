package com.eoe.basic.day02.exercise;

public class Exercise04 {

	/**
	 * 编写程序，实现两个字符类型变量值互换
	 */
	public static void main(String[] args) {
		char ca='a';
		char cb='b';
		System.out.println("ca="+ca+"\tcb="+cb);
		ca+=cb;
		cb=(char) (ca-cb);
		ca-=cb;
		System.out.println("ca="+ca+"\tcb="+cb);
	}

}
