package com.eoe.learnjava.day05;

import java.util.Scanner;

public class Equal {

	/**
	 * ������������int���͵�������ӡ���������Ƿ����
	 * Ҫ����true��false��ʾ�������Ƿ����
	 * @param args
	 */
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("������������");
//		int a = scanner.nextInt();
//		int b = scanner.nextInt();
//		boolean result = true ;
//		if (a - b == 0){
//			System.out.println(result);
//		}else{
//			System.out.println(!result);
//		}
        /*��λ������*/
		Scanner scanner=new Scanner(System.in);
		System.out.println("a b=");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		System.out.println("a����b:"+((a^b)==0));
	}

}
