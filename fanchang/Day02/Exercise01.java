package com.eoe.basic.day02;

import java.util.Scanner;

public class Exercise01 {

	/** ��д���򣬼���2^n��Ҫ��
	 *	(1)n�ɼ������롣
	 *	(2)����ʹ��Math.pow()
	 * @param args
	 */
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("2��n�η��ǣ�������n����");
			int n=scanner .nextInt();
			System.out.println(+1<<n);     //λ����
	}

}
