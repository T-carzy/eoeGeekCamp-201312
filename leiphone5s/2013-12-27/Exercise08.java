package com.fengleiit.pjo;

import java.util.Scanner;

public class Exercise08 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("�����������ַ���: ");
		String text=input.next();		
		String text1=input.next();
		if(text.equals(text1)){//�ַ������ݽ��бȽ�
			System.out.println("������ͬ");
	}else{
		System.out.println("���߲���ͬ");
	}
}
}
