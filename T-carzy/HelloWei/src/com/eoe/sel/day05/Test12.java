package com.eoe.sel.day05;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test12 {
	public static void main(String[] args) {
		SimpleDateFormat formater=new SimpleDateFormat("yyyy/MM/dd:HH:mm:ss");
		Date date=new Date();
		String sdate=formater.format(date);
		System.out.println(sdate);
	}
}
