package com.eoe.basic.day01;
import java.util.Scanner;


public class Test07 {

	/**
	 * ͨ������̨��������������
	 * �����м��������������ֵ
	 */
	public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("a=");
			int a=scanner.nextInt();
			System.out.println("b=");
			int b=scanner.nextInt();
			int c;
			c=a;
			a=b;
			b=c;
			System.out.println("a="+a+"\nb="+b);
	}

}
