package com.eoe.basic.day05;

import java.util.Scanner;

public class Test01_2 {
	/**
	 * ��ӡ����n��n�е��ַ�ͼ�Σ�n�ɼ�������
	 *     *****
	 *     *****
	 *     *****
	 *     *****
	 *     *****
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("n=");
		int n=scanner.nextInt();
		for(int i=1;i<=n;i++){
			//����ѭ����ӡһ��*
			for(int j=1;j<=n;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
