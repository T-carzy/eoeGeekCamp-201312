package com.eoe.basic.day02.exercise;

import java.util.Scanner;

public class Exercise07 {
/**
 * ��������һ��������Ҫ��ֻ������λ����Ȼ�󽫸��������ӡ��
	���磺����5327,��ʾ7235
 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("a=");
		int a=scanner.nextInt();
		int g=a%10;
		int s=a/10%10;
		int b=a/100%10;
		int q=a/1000;
		System.out.println(""+g+s+b+q);
	}
}
