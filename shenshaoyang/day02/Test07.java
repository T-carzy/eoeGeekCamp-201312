package com.eoe.basicLearn.day02;

public class Test07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=-2;
		long l=i;
		System.out.println("int���͵�-2:"+Integer.toBinaryString(i));
		System.out.println("long���͵�-2:"+Long.toBinaryString(l));
		int a=0x1000001;
		System.out.println(Integer.toBinaryString(i));
		float b=a;
		System.out.println(Integer.toBinaryString((int)b));//int����ת��Ϊfloat���Ͷ�ʧ����
		int c=129;
		byte d=(byte)c;
		System.out.println(Integer.toBinaryString(c));
		System.out.println(Integer.toBinaryString(d));//intת��Ϊbyte���ͳ��ֵ�����λ�����λ������
		int e=257;
		byte f=(byte)e;
		System.out.println("int:"+Integer.toBinaryString(e)+"  "+e);
		System.out.println("byte:"+Integer.toBinaryString(f)+"  "+f);
	}

}
