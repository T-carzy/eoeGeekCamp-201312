package com.eoe.basic.day03;

public class Test05 {
	/**
	 * ����һ���ܱ���С���������λ�ķ���pround����main�����е��ø÷�����
	 * ����ָ��С���������λ��
	 */
	public static void main(String[] args) {
		System.out.println(pround(3.758, 2));
	}
	static double pround(double value,int index){
		double pow10=Math.pow(10, index);//����10^n
		double result=value*pow10;
		result=Math.round(result);
		result=result*1.0/pow10;
		return result;
	}
}
