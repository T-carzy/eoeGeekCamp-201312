package com.eoe.basic.day02;
public class Baozhuanglei {

	/**
	 * ��װ���ʹ��
	 * @param args
	 */
	public static void main(String[] args) {
			System.out.println(Byte.MAX_VALUE );
			System.out.println(Byte.MIN_VALUE);
			System.out.println(Integer.toBinaryString(151));  //ʮ����ת���ɶ�����
			System.out.println(Integer.toHexString(151));      //ʮ����ת����ʮ������	
			System.out.println(Integer.toOctalString(8));       //ʮ����ת���ɰ˽���
			int i=Integer.parseInt("128");                                
			System.out.println(i);
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			System.out.println(a+b);
	}

}
