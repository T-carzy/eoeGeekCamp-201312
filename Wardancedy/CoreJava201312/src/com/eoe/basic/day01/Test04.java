package com.eoe.basic.day01;

public class Test04 {
	/**
	 * ��֪��������Ļ����洢��λ���ֽ�(byte)��һ���ֽ���8λ��
	8λ2���Ƶ����ֵ=(11111111)2=2��0�η�+2��1�η�+2��2�η�+2��3�η�+
	2��4�η�+2��5�η�+2��6�η�+2��7�η�
	��д�����ļ�����J06.java�����㲢��ʾ8λ2�����������ֵ������
	(11111111)2ת��Ϊ10��������
	 */
	public static void main(String[] args) {
		System.out.print("(11111111)2=");
		System.out.println(Math.pow(2, 7)+
						   Math.pow(2,6)+
						   Math.pow(2, 5)+
						   Math.pow(2, 4)+
						   Math.pow(2, 3)+
						   Math.pow(2,2)+
						   Math.pow(2, 1)+
						   Math.pow(2, 0));
		//�����㷨
		System.out.println(Math.pow(2, 8)-1);
	}
}
