package com.eoe.pre.day01;

public class Test03 {

	/** ����������������ڴ洢���ݵĵ�Ԫ�ı�ʾ��
	 * @param args
	 */
	public static void main(String[] args) {
		//20��ƽ����+10��ƽ�������ٳ���(20��ƽ����-10��ƽ����)		
		System.out.println("(sqrt(20)+sqrt(10))/(sqrt(20)-sqrt(10))="+(Math.sqrt(20)+Math.sqrt(10))/(Math.sqrt(20)-Math.sqrt(10)));
		double sqrt10=Math.sqrt(10);
		double sqrt20=Math.sqrt(20);
		double result=(sqrt20+sqrt10)/(sqrt20-sqrt10);
		System.out.println("(sqrt(20)+sqrt(10))/(sqrt(20)-sqrt(10))="+result);
		
	}

}
