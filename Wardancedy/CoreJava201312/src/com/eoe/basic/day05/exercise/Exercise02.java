package com.eoe.basic.day05.exercise;

public class Exercise02 {
	/**
	 * 
	 * ��˫��ѭ������100��200֮�������������
	 */
	public static void main(String[] args) {
		for(int i=101;i<200;i+=2){
			boolean isPrime=true;
			int k=(int) Math.sqrt(i);
			for(int j=2;j<=k&&isPrime;j++){
				isPrime=i%j!=0;
			}
			if(isPrime){
				System.out.println(i);
			}
		}
	}
}
