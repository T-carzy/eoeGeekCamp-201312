package com.eoe.learnjava.day05;
import java.util.Scanner;


public class Factorial {

	/**
	 * ����n!,n�ɼ�������
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������n=");
		int n = scanner.nextInt();
		long result = 1;
		for(int i=1;i<=n;i++){
			result*=i;
		}
		System.out.println(result);
	}

}
