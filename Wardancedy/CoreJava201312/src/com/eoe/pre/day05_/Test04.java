package com.eoe.pre.day05_;

public class Test04 {

	/**
	 * ������ѭ������100��999���ڵ�����ˮ�ɻ�����
	 */
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 10; k++) {
					int value=i * 100 + j*10 + k;
					if(i*i*i+j*j*j+k*k*k==value){ 
						System.out.println(value);
					}
				}
			}
		}
	}

}
