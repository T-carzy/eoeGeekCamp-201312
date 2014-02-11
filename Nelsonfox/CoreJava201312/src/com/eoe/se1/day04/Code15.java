package com.eoe.se1.day04;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Code15 {
public static void main(String[] args) {
	Calendar calendar=new GregorianCalendar();
	calendar=Calendar.getInstance();
	System.out.print(calendar.get(Calendar.YEAR)+"年");
	System.out.print(calendar.get(Calendar.MONTH)+1+"月");
	System.out.print(calendar.get(Calendar.DAY_OF_MONTH)+"日");
	System.out.print(calendar.get(Calendar.HOUR)+"时");
	System.out.print(calendar.get(Calendar.MINUTE)+"分");
	System.out.print(calendar.get(Calendar.SECOND)+"秒");
}
}
