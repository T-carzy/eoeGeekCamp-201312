package com.eoe.basic.day02;

public class Test01 {
	/*
	 * ����(sqrt(20)+sqrt(10)/(sqrt(20)-sqrt(10))=
	 * Ҫ����ʾ�������С�����1λ������С������2λ�������롣
	 */
	public static void main(String[] args) {
		//��20��ƽ���������ڱ���sqrt20
		double sqrt20=Math.sqrt(20);
		//��10��ƽ���������ڱ���sqrt10
		double sqrt10=Math.sqrt(10);
		//��sqrt20��sqrt10���м���
		double result=(sqrt20+sqrt10)/(sqrt20-sqrt10);
		System.out.println(result);
		System.out.println(Math.round(result*10)/10d) ;		
	}
}
