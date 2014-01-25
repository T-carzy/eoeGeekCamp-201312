package com.eoe.sel.day05;

import java.util.Calendar;

public class Test09 {
	public static void main(String[] args) {
			long time=System.currentTimeMillis();
			time+=1000*60*10;
			Calendar calendar=Calendar.getInstance();
			calendar.setTimeInMillis(time);
			System.out.print(calendar.get(Calendar.DAY_OF_MONTH)+":");
			System.out.print(calendar.get(Calendar.HOUR)+":");
			System.out.print(calendar.get(Calendar.MINUTE)+":");
			System.out.print(calendar.get(Calendar.SECOND));
}
}
