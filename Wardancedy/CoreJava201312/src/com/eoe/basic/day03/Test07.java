package com.eoe.basic.day03;

public class Test07 {
	/**
	 * switchʾ����
	 * 	  switch���ġ��ᴩ������
	 */
	public static void main(String[] args) {
		int score=4;
		switch (score) {
		case 5:
			score++;
		case 4:
			score++;
		case 3:
			score++;
		case 2:
			score++;
		case 1:
			score++;
		case 0:
			score++;
		default:
			System.out.println(score);
		}
	}
}
