package com.eoe.basic.day02;

public class Test09 {
	/**
	 * ��ӡ��unicode���0��127�������ַ�
	 */
	public static void main(String[] args) {
		for(int i=0;i<128;i++){
			System.out.println((char)i+":"+i);
		}
//		System.out.println((char)0+":"+0);//��ӡunicode��Ϊ0���ַ�
//		System.out.println((char)1+":"+1);//��ӡunicode��Ϊ1���ַ�
//		//...
//		System.out.println((char)127+":"+127);//��ӡunicode��Ϊ127���ַ�
	}

}
