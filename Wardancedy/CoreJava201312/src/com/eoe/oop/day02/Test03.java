package com.eoe.oop.day02;

public class Test03{
	/**
	 * Object�ೣ�÷���ʾ��
	 * equals()
	 * toString()
	 */
	public static void main(String[] args) {
		Object o1=new Object();
		Object o2=new Object();
		//�ж���������ĵ�ַ�Ƿ����
		if(o1.equals(o2)){
			System.out.println("ͬһ������");
		}else{
			System.out.println("����ͬһ������");
		}
		//��ӡo1ʵ�ʵ��õ���o1.toString()
		System.out.println("o1��ֵ"+o1);
		//��ӡo2ʵ�ʵ��õ���o2.toString()
		System.out.println("o2��ֵ"+o2);
		o1=o2;//��ַ��ֵ
		//�ж��������ñ����Ƿ����
		if(o1.equals(o2)){
			System.out.println("ͬһ������");
		}else{
			System.out.println("����ͬһ������");
		}
		//��ӡ�������ñ����ĵ�ַ
		System.out.println("o1��ֵ"+o1.toString());
		System.out.println("o2��ֵ"+o2.toString());
	}

}
