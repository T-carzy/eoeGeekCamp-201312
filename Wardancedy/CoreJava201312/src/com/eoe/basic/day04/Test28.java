package com.eoe.basic.day04;

import java.util.Scanner;

public class Test28 {

	/**
	 * ��ʾ��-26����ӡ�ַ�ͼ��(2)
              ����1~9���ַ���������12345,��ӡ�����ַ�ͼ�Σ�
 		12345
 		 234
 		  3

	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("�����ַ���:");
		String space="";
		String text=scanner.next();
		for(int i=0;i<text.length()/2+1;i++){
			System.out.println(space+text.substring(i,text.length()-i));
			space+=" ";
		}
	}

}
