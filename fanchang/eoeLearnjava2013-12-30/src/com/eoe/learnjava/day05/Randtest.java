package com.eoe.learnjava.day05;

import java.util.Random;

public class Randtest {

	/**����random���һ������,���ڲ��������
	 * @param args
	 */
	public static void main(String[] args) {
		Random rand = new Random();
		for(int i=0;i<10;i++){
			System.out.println(rand.nextDouble());//����0-1��С��
			System.out.println(rand.nextInt(100));//����0-100�������
		}

	}

}
