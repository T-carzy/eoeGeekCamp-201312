package com.eoe.learnjava.day06;

public class Cycle_test {

	/**100-999��ˮ�ɻ�����
	 * ������ѭ����
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {         //���ѭ�������λ
			for (int j = 0; j <= 9; j++) {     //�в�ѭ������ʮλ
				for (int g = 0; g <= 9; g++) { //�ڲ�ѭ�������λ
					int s=i*100+j*10+g;
					if (g*g*g+i*i*i+j*j*j==s) {						
						System.out.println(s);
					}
				}
			}
		}
	}

}
