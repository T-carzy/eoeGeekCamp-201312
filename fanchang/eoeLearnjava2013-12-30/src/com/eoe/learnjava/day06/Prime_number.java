package com.eoe.learnjava.day06;

import java.util.Scanner;

public class Prime_number {

	/**��������һ������,�жϸ����Ƿ�������
	 * �����ֳ�����.ָ��һ������1����Ȼ���У�
	 * ����1�ʹ����������⣬�޷���������Ȼ����������
	 * @param args
	 */
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("������һ������:");
//		int n = scanner.nextInt();
//		for(int i=2;i<n;i++){
//			if(n%i!=0){
//				System.out.println(n+"������");
//				break;
//			}else{
//				System.out.println(n+"��������");
//				break;
//			
//			}
//		}
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ������:");
		int n = scanner.nextInt();
		int k = (int) Math.sqrt(n);
		boolean isPrime=true;
		for(int i=2;i<=k;i++){
			if(n%i==0){
				isPrime=false;
				break;
			}
		}
		if(isPrime==true){
			System.out.println(n+"������");
		}else{
			System.out.println(n+"��������");
		}
	}

}
