package com.eoe.basicLearn.day02;

public class Test06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b1=5;
		//byte b2=b1+3;//������������͵����ݲ��ܴ����С���͵ı�����
		byte b2=5+3;
		double a1=2.6;
		double a2=a1-0.6;
		System.out.println(b2);
		System.out.println(a2);
		double d = 2.6;
		double e = d - 2;
		System.out.println(e);
		for(int i=0;i<128;i++){
			System.out.println((char)i+":"+i);
		}
	   System.out.println((char)0+":"+0);//��ӡunicode��Ϊ0���ַ�
	   System.out.println((char)1+":"+1);//��ӡunicode��Ϊ1���ַ�
       System.out.println((char)127+":"+127);//��ӡunicode��Ϊ127���ַ�
	   int score=65;
       boolean pass;
       pass=score>=60;
       System.out.println("����ͨ��:"+pass);
	}

}
