package com.eoe.basic.day06.twoarray;

public class Test01 {
	/**
	 * ��ά�����ӡ�žű�
	 */
	public static void main(String[] args) {
		int[][]	 a=new int[9][9];
		//����1������i*j����ÿ����������ڶ�ά�����ÿ��Ԫ���С�
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j]=(i+1)*(j+1);
			}
		}
		//����2����ӡ��ά����
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print((i+1)+"*"+(j+1)+"=");
				if(a[i][j]<10){
					System.out.print(" ");
				}
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
