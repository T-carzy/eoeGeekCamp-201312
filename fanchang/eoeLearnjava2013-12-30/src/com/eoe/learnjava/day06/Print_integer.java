package com.eoe.learnjava.day06;

public class Print_integer {

	/**
	 * ������ѭ����ӡ0-999
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0; i <= 9; i++) {         //���ѭ�������λ
			for (int j = 0; j <= 9; j++) {     //�в�ѭ������ʮλ
				for (int g = 0; g <= 9; g++) { //�ڲ�ѭ�������λ
					System.out.print(i*100+j*10+g+"  ");
				}
			    System.out.println();
			}
			System.out.println();
		}
	}

}
