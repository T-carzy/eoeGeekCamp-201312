package com.eoe.basic.day02;

public class Conversion {

	/**
	 * �������͵��Զ�ת��
	 * @param args
	 */
	public static void main(String[] args) {
			int i=-2;
			long l=i;
			System.out.println("int���͵�-2��"+Integer.toBinaryString(i));
			System.out.println("long���͵�-2��"+Long.toBinaryString(l));
			//int�����Զ�ת����long���ͣ�����32λ�Զ���0��1
			
			int a= 0x1000001;
			System.out.println("int:"+Integer.toBinaryString(a)+"   "+a);
			float b=a;
			System.out.println("flota"+Integer.toBinaryString((int)b)+"  "+b);
            //int����תflota���;��ȶ�ʧ��int��32λ��float��23λ
			
			int c=129 ;                      //1000 0001
			byte d=(byte) c;
			System.out.println(Integer.toBinaryString(c)+"  "+c);
			System.out.println(Integer.toBinaryString(d)+"  "+d);
			//intת��Ϊbyte�ͣ�����������λ��ɷ���λ
			
			int e=257 ;                      //1 0000 0001
			byte f=(byte) e;             //��λ������
			System.out.println(Integer.toBinaryString(e)+"  "+e);
			System.out.println(Integer.toBinaryString(f)+"  "+f);
			
			int x= Byte.MAX_VALUE+1;  //-128-127      1000 0000
			byte y=(byte)x;                  
			System.out.println(Integer.toBinaryString(x)+"  "+x);
			System.out.println(Integer.toBinaryString(y)+"  "+y);
			
	}

}
