package com.eoe.basic.day06.twoarray;

public class Test05 {
	public static void main(String[] args) {
		//������ά�������
		int[][] a=new int[3][];
		//����һά���������a[0]����
		a[0]=new int[]{5,3,2,6};
		//����һά���������a[1]����
		a[1]=new int[]{10,20};
		//����һά���������a[2]����
		a[2]=new int[]{100,200,300};
		//��ӡ��������Ԫ��ֵ
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(a[i][j]<10){
					System.out.print("  ");
				}else if(a[i][j]<100){
					System.out.print(" ");
				}
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
