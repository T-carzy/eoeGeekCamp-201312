package com.eoe.sel.day05;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;

public class Test06 {
	public static void main(String[] args) {
		Calendar calendar=new GregorianCalendar();
			calendar=Calendar.getInstance();
			Date date=calendar.getTime();
			System.out.println(date.getDate());
			System.out.println(date.getHours());
	}
}
