package com.eoe.basic.day02;

import java.util.Scanner;

/**
 * ��ͬ���͵ı�����Ŷ�Ӧ���͵����ݣ�������ֵ���Ըı䡣
 * �ŷ� ��
 */
public class Test {//alt+/ f11:�������� ctrl+f11:�ǵ�������
	public static void main(String[] args) {
		int i=2;
		int j= 20;
		System.out.println("i="+i+"\tj="+j);
		i+=j;// i=20+2 j=20;
		j=i-j;// i=20+2 j=2
		i-=j; //i=20 j=2
		System.out.println("i="+i+"\tj="+j);
	}
}
