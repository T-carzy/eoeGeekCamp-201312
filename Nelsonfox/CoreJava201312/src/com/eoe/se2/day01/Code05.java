package com.eoe.se2.day01;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Code05 {
public static void main(String[] args) {
	Calendar calendar=new GregorianCalendar();
	calendar=Calendar.getInstance();
	System.out.println(calendar.get(Calendar.YEAR)+"年");
	System.out.println(calendar.get(Calendar.MONTH)+"月");
	System.out.println(calendar.get(Calendar.DAY_OF_MONTH)+"日");
	System.out.println(calendar.get(Calendar.HOUR)+"时");
	System.out.println(calendar.get(Calendar.MINUTE)+"分");
	System.out.println(calendar.get(Calendar.SECOND)+"秒=");
}
}
