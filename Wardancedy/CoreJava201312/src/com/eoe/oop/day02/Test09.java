package com.eoe.oop.day02;

public class Test09 {
	public static void main(String[] args) {
		//�����ά����
		int[][] a2={
			{ 1, 2, 3, 4,5},
			{16,17,18,19,6},
			{15,24,25,20,7},
			{14,23,22,21,8},
			{13,12,11,10,9}
		};
		//foreachѭ��������ά����
		for(int[] a1:a2){//a1��һά����
			for(int a:a1){ //a��һά�����Ԫ��
				if(a<10){//һλ��ǰ��ӡһ���ո�Ŀ��������λ������
					System.out.print(" ");
				}
				System.out.print(a+" ");//��ӡ����Ԫ��
			}
			System.out.println();//����
		}
	}
}
