package com.eoe.se1.day01;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		System.out.println("1-�ڴ�����쳣");
		System.out.println("2-�����±�Խ���쳣");
		System.out.println("3-��ָ���쳣");
		System.out.println("4-ת���쳣");
		System.out.println("5-��������쳣");
		System.out.println("6-ǿ������ת���쳣");
		Scanner scanner=new Scanner(System.in);
		int select=scanner.nextInt();
		switch (select) {
		case 1://�ڴ�����쳣JRE
			double[] a=new double[1000000000];
			break;
		case 2:
			int[] b=new int[3];
			System.out.println(b[4]);
			break;
		case 3://��ָ���쳣
			int[] c=null;
			System.out.println(c[0]);
			break;
		case 4://ת���쳣
			String name="aa";
			int d=Integer.parseInt(name);
			break;
		case 5:
			System.out.println(5/0);
			break;
		case 6:
			String s="aa";
			Object o=s;
			Integer i=(Integer) o;
			break;
		}
	}
}
