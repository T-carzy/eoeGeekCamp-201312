package com.eoe.basic.day02.exercise;

public class Exercise04 {

	/**
	 * ��д����ʵ�������ַ����ͱ���ֵ����
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
