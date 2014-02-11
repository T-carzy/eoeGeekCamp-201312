package com.eoe.se2.day01;

import java.util.Calendar;

public class Code06 {
public static void main(String[] args) {
	long time=System.currentTimeMillis();
	time+=1000*60*60*24;
	Calendar calendar=Calendar.getInstance();
	calendar.setTimeInMillis(time);
	System.out.println(calendar.get(Calendar.DAY_OF_MONTH)+":");
	System.out.println(calendar.get(Calendar.HOUR)+":");
	System.out.println(calendar.get(Calendar.MINUTE)+":");
	System.out.println(calendar.get(Calendar.SECOND)+":");
}
}
