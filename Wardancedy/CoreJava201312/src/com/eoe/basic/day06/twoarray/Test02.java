package com.eoe.basic.day06.twoarray;

public class Test02 {
	/**
	 * ��ά�����ӡ���ظ��ľžű�
	 */
	public static void main(String[] args) {
		int[][] a = new int[9][9];
		// ����žű�������������ڶ�ά�����ÿ��Ԫ���С�
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (i + 1) * (j + 1);
			}
		}
		// ��ӡ�žű�(1)
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a[i].length; j++) {
				System.out.print((i + 1) + "*" + (j + 1) + "=");
				if (a[i][j] < 10) {
					System.out.print(" ");
				}
				System.out.print(a[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println();
		//��ӡ�žű�(2)
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((i + 1) + "*" + (j + 1) + "=");
				if (a[i][j] < 10) {
					System.out.print(" ");
				}
				System.out.print(a[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
