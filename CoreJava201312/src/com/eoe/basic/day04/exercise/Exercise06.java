package com.eoe.basic.day04.exercise;

import java.util.Scanner;

public class Exercise06 {
	/*
	 * *8����֪��쳲�����������ָ��ǰ�������ֱ���0��1,
	 * �ӵ���������ʼ��ÿ��������ǰ����
    ��֮�ͣ�������ʾ��
	  	0,1,1,2,3,5,8,13,21,34,55,...
    ��ʽ��f(n)=f(n-2)+f(n-1)
    ��̣���������n,��ӡ��f(1)��f(n)
   �ļ�����Exercise07.java 
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("n=");
		int n=scanner.nextInt();
		int a=0;
		int b=1;
		int c;
		int i=1;
		System.out.print(a+" "+b+" ");
		while(i<=n){
			c=a+b;//c����ǰ������֮��
			System.out.print(c+" ");
			a=b;
			b=c;
			i++;
		}
	}
}
