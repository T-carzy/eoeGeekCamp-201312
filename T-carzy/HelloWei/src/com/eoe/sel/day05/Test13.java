package com.eoe.sel.day05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test13 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入日期");
		String sdate=scanner.next();
		SimpleDateFormat formater=new SimpleDateFormat("yyyy-MM-dd");
	
		try {
			Date date = formater.parse(sdate);
			System.out.println(date.getYear()+1900+"年");

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
