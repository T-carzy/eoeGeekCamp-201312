package com.eoe.basic.day05;

public class Test05 {
	/**
	 * ������ѭ����ӡ100��999
	 */
	public static void main(String[] args) {
		for(int i=0;i<=9;i++){ //���ѭ�������λ��
			for(int j=0;j<=9;j++){ //�м��ѭ������ʮλ��
				for(int k=0;k<=9;k++){ //���ڲ�ѭ�������λ��
					System.out.print(i*100+j*10+k+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
