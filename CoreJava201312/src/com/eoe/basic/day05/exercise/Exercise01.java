package com.eoe.basic.day05.exercise;

public class Exercise01 {

	/**
	 * ����100��999֮������л���������������ָ���������ҶԳƣ�����101,121,232
	 */
	public static void main(String[] args) {
		for (int i = 1; i <=9; i++) {//i�����λ��
			for(int j=0;j<=9;j++){//j����ʮλ��
				for(int k=0;k<=9;k++){//k�����λ��
					if(i==k){
						System.out.println(""+i+j+k);
					}
				}
			}
		}
	}

}
