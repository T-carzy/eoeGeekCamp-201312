package com.eoe.sel.day05;

import java.util.Calendar;
import java.util.Date;

public class Test10 {
	public static void main(String[] args) {
			Date date=new Date();
			Calendar calendar=Calendar.getInstance();
			calendar.setTime(date);
			System.out.print(calendar.get(Calendar.DAY_OF_MONTH)+":");
			System.out.print(calendar.get(Calendar.HOUR)+":");
			System.out.print(calendar.get(Calendar.MINUTE)+":");
			System.out.print(calendar.get(Calendar.SECOND));
}
}
