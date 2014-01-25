package com.eoe.test;

import java.util.Arrays;
import java.util.Scanner;

import com.eoe.test.Tools.Number2;

public class TestTool {

	public static void main(String[] args) {

//		String[] a = { "11", "22" };
//		double[] b = { 11.11, 22.22 };
////		System.out.println(Arrays.toString(a));
////		Tools.swap(a, 1, 0);
////		System.out.println(Arrays.toString(a));
////		Number2 num=new Number2(11,22);
////		System.out.println(num);
////		Tools.swap(num);
////		System.out.println(num);
//		System.out.println(Arrays.toString(a));
//		Tools.swap(a, 0, 1);
//		System.out.println(Arrays.toString(a));
		Scanner scanner=new Scanner(System.in);
		System.out.println("n=");
		int n=scanner.nextInt();
		int result=Tools.add(n); 
		System.out.println(result);
		double count=Tools.fact(n);
		System.out.println(count);
	}
}
