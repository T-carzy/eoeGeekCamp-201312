package com.eoe.se1.day05;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test07 {
	/**
	 * ��Calendarת��ΪDate����
	 * ��System.currentTimeMillis��ȡ��ʱ�䴴��
	 * Calendar����
	 */
	public static void main(String[] args) {
		Calendar calendar=new GregorianCalendar();
		calendar=Calendar.getInstance();
		System.out.print(calendar.get(Calendar.YEAR)+"��");
		System.out.print(calendar.get(Calendar.MONTH)+1+"��");
		System.out.print(calendar.get(Calendar.DAY_OF_MONTH)+"��");
		System.out.print(calendar.get(Calendar.HOUR)+"ʱ");
		System.out.print(calendar.get(Calendar.MINUTE)+"��");
		System.out.print(calendar.get(Calendar.SECOND)+"��");
		
	}
}
