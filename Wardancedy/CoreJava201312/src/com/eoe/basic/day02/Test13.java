package com.eoe.basic.day02;

public class Test13 {
	/** ʾ����long����ת��Ϊdouble���͵ľ��ȶ�ʧ����*/
	public static void main(String[] args) {
		long l=0x20000000000001L;
		double d=l;
		/*�����Ǹ����Ķ�������ʽ���ܹ�54λ
		  100000,00000000,00000000,00000000,00000000,00000000,00000001 long
		  10000,00000000,00000000,00000000,00000000,00000000,000100000 double
		 *  �����double�����н���ʧ���1λ���ݡ�
		 */
		System.out.println("long:  "+Long.toBinaryString(l)+"  "+l);
		System.out.println("double:"+Long.toBinaryString((long)d)+"  "+d);
	}
}





