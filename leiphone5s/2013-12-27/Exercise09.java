package com.fengleiit.pjo;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		String uname="����";
		String password="123456";
		Scanner scanner=new Scanner(System.in);
		System.out.println("�������û���:");
		String userName=scanner.next();
		if(!uname.equals(userName)){
			System.out.println("����ע���û�:");
			return;
		}
		System.out.println("����������:");
		String pwd=scanner.next();
		if(!pwd.equals(pwd.trim())){
			System.out.println("�������!");
			return;
		}
		System.out.println("�ɹ���½��");
 
	}
}
