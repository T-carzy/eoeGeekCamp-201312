package com.eoe.se1.day05;

import java.util.Scanner;

/*
 * 
 * �����������ڣ���֤���ڵĺϷ��ԡ�
 */
public class Test05 {
	public static void main(String[] args) {
		String regex="\\d{4}((-|/|.)\\d{1,2}){2}";
		Scanner scanner=new Scanner(System.in);
		System.out.println("��������:");
		String sdate;
		boolean ok;
		do{
			sdate=scanner.next();
			ok=sdate.matches(regex);
			if(!ok){
				System.out.println("�����ʽ����");
			}
		}while(!ok);
		sdate=sdate.replaceAll("-|/|\\.", " ");
		System.out.println(sdate);
		String[] data=sdate.split(" ");
		int year=Integer.parseInt(data[0]);
		if(year<1990||year>2020){
			System.out.println("�������ݷ�Χ����");
			return ;
		}
		int month=Integer.parseInt(data[1]);
		if(month<1 || month>12){
			System.out.println("������·ݴ���");
			return ;
		}
		int day=Integer.parseInt(data[2]);
		if(day<1 || day>31){
			System.out.println("��������Ӵ���");
			return ;
		}
	}
}
