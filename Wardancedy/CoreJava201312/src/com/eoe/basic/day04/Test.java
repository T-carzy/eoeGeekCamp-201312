package com.eoe.basic.day04;

import java.util.Random;
import java.util.Scanner;

public class Test {

	/**
	 *���õ�����������������String���͵ı���ֵ
	 */
	public static void main(String[] args) {
		String a="abcd";
		String b="123";
		System.out.println("a="+a+"\tb="+b);
		a+=b;//a="abc123"  b="123"
		b=a.substring(0,a.length()-b.length());
		//a="abc123" b="abc"
		a=a.substring(b.length());
		System.out.println("a="+a+"\tb="+b);
	}
}

