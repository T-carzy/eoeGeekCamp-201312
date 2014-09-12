package com.eoe.se1.day05;

import java.util.Date;

public class Test06 {
	public static void main(String[] args) {
		Date date=new Date();
		long currentTime=date.getTime();
		int year=(int) (currentTime/1000/60/60/24/365);
		System.out.println(year+1970+"年");
		//long time=System.currentTimeMillis();
		//System.out.println(time);
		System.out.print(date.getYear()+1900+"年");
		System.out.print(date.getMonth()+1+"月");
		System.out.print(date.getDate()+"日");
		System.out.print(date.getHours()+"时");
		System.out.print(date.getMinutes()+"分");
		System.out.println(date.getSeconds()+"秒");
	}
}
