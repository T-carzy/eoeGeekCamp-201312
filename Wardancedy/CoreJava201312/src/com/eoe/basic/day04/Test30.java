package com.eoe.basic.day04;

import java.util.Scanner;

public class Test30 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String uname="zhangFei";
		String upwd="123456";
		Scanner scanner=new Scanner(System.in);
		System.out.println("�����û���:");
		String userName=scanner.next();
		if(!userName.equals(uname)){
			System.out.println("����ע��");
			return ;
		}
		System.out.println("����������");
		String pwd=scanner.next();
		if(!upwd.equals(pwd.trim())){
			System.out.println("�������");
			return ;
		}
		System.out.println("��½�ɹ�");
	}

}
