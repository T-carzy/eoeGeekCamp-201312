package com.eoe.se2.day01;

import java.sql.Date;

public class Code04 {
public static void main(String[] args) {
	java.util.Date date=new java.util.Date();
	long currentTime=date.getTime();
	int year=(int) (currentTime/1000/60/60/24/365);
	System.out.println(year+1970+"年");
	System.out.println(date.getYear()+1900+"年");
	System.out.println(date.getMonth()+1+"月");
	System.out.println(date.getDate()+"日");
	System.out.println(date.getHours()+"时");
	System.out.println(date.getMinutes()+"分");
	System.out.println(date.getSeconds()+"秒");
}
}
