package com.eoe.basic.day04.exercise;

import com.eoe.tools.MyTools;

public class Exercise04 {
/**
 * 6�����ж�һ�����Ƿ������Ĵ����װһ����ΪisPrime���������÷�������MyMath���У�
���ø÷����ҳ�100��200֮�������������
 */
	public static void main(String[] args) {
		for(int i=101;i<200;i+=2){
			//if(MyTools.isPrime(i)){
				System.out.println(i+":"+MyTools.isPrime(i));
			//}
		}
	}
	
}
