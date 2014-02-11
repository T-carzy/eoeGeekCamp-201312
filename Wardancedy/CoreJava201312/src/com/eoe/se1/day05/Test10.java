package com.eoe.se1.day05;

import java.util.Calendar;
import java.util.Date;

public class Test10 {
	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
		Date date=calendar.getTime();
		System.out.print(date.getDate()+":");
		System.out.print(calendar.get(Calendar.HOUR)+":");
		System.out.print(calendar.get(Calendar.MINUTE)+":");
		System.out.print(calendar.get(Calendar.SECOND));
		
		
	}
}
