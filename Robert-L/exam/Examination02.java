package com.eoe.exam;

import java.util.Scanner;

public class Examination02 {
	/**
	 * ��������5���Ʒ�������ʾ���š���������򲻼���Ҫ�������κ��ж���䡣
	 * @param args
	 */
	public static void main(String[] args) {
	   Scanner scanner=new Scanner(System.in);
	   String [] a={"������","������","����","��","��"};
	   System.out.println("����һ������Ʒ�����");
	   int n=scanner.nextInt();
	   System.out.println(a[n-1]);
	}


}
