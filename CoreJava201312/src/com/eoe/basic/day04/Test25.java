package com.eoe.basic.day04;

import java.util.Scanner;

public class Test25 {

	/**
	 * �ж������������������ݡ�
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("n=");
		int n=scanner.nextInt();
		boolean isPrime=true;//isPrime�����Ƿ���������true����
		/* 23
		 * 2 3 4 5 6 7 8 9 10 11 12
		 */
		int k=(int) Math.sqrt(n);//ctrl+1
		for(int i=2;i<=k&&isPrime;i++){
			isPrime=n%i!=0;
//			if(n%i!=0){
//				isPrime=n%i!=0;
//			}else{
//				isPrime=n%i!=0;
//			}
		}
		System.out.println(n+"������:"+isPrime);
	}

}
