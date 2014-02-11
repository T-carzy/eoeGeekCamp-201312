package com.eoe.se2.day01;

import java.util.Calendar;
import java.util.Date;

public class Code07 {
public static void main(String[] args) {
	Date date=new Date();
	Calendar calendar=Calendar.getInstance();
	calendar.setTime(date);
	System.out.println(calendar.get(Calendar.DAY_OF_MONTH)+":");
	System.out.println(calendar.get(Calendar.HOUR)+":");
	System.out.println(calendar.get(Calendar.MINUTE)+":");
	System.out.println(calendar.get(Calendar.SECOND)+":");
}
}
