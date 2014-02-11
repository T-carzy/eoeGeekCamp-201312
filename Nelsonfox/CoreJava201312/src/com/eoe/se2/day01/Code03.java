package com.eoe.se2.day01;

import java.util.Scanner;

public class Code03 {
public static void main(String[] args) {
	String regex="\\d{4}((-|/|.)\\d{1,2}){2}";
	Scanner scanner=new Scanner(System.in);
	System.out.println("输入日期");
	String sdate;
	boolean ok;
	do{
		sdate=scanner.next();
		ok=sdate.matches(regex);
		if(!ok){
			System.out.println("输入格式错误");
		}
	}while(!ok);
	sdate=sdate.replaceAll("-|/|\\.", " ");
	System.out.println(sdate);
	String[] data=sdate.split(" ");
	int year=Integer.parseInt(data[0]);
	if(year<1990||year>2020){
		System.out.println("输入的年份范围错误");
		return;
	}
	int month=Integer.parseInt(data[1]);
	if(month<1||month>12){
		System.out.println("输入的月份错误");
	}
	int day=Integer.parseInt(data[2]);
	if(day<1||day>31){
		System.out.println("输入的日子错误");
		return;
	}
}
}
