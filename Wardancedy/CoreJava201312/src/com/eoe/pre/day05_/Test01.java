package com.eoe.pre.day05_;

import java.util.Scanner;

public class Test01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("n=");
		int n=scanner.nextInt();
		//��ӡ5���Ǻ�
		for(int j=1;j<=n;j++){
			//��ӡһ���Ǻ�
			for(int i=1;i<=n;i++){
				System.out.print("*");
			}
			System.out.println();
		}
		
//		for(int i=1;i<=5;i++){
//			System.out.print("*");
//		}
//		System.out.println();
//		for(int i=1;i<=5;i++){
//			System.out.print("*");
//		}
//		System.out.println();
//		for(int i=1;i<=5;i++){
//			System.out.print("*");
//		}
//		System.out.println();
//		for(int i=1;i<=5;i++){
//			System.out.print("*");
//		}
//		System.out.println();
//		for(int i=1;i<=5;i++){
//			System.out.print("*");
//		}
//		System.out.println();
		
	}

}
