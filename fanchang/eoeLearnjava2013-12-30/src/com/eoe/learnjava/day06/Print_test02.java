package com.eoe.learnjava.day06;

import java.util.Scanner;

public class Print_test02 {

	/**��ӡһ��ͼ��,n�ɼ�������
	 *    *
	 *    **
	 *    ***
	 *    ****
	 *    *****
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������n:");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
