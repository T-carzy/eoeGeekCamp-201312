package com.eoe.se1.day05;

import java.util.Date;

public class Test06 {
	public static void main(String[] args) {
		Date date=new Date();
		long currentTime=date.getTime();
		int year=(int) (currentTime/1000/60/60/24/365);
		System.out.println(year+1970+"��");
		//long time=System.currentTimeMillis();
		//System.out.println(time);
		System.out.print(date.getYear()+1900+"��");
		System.out.print(date.getMonth()+1+"��");
		System.out.print(date.getDate()+"��");
		System.out.print(date.getHours()+"ʱ");
		System.out.print(date.getMinutes()+"��");
		System.out.println(date.getSeconds()+"��");
	}
}
