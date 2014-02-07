package com.eoe.se2.day01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Code09 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("输入日期");
	String sdate=scanner.next();
	SimpleDateFormat formater=new SimpleDateFormat("yyyy-MM-dd");
	try {
		Date date=formater.parse(sdate);
		System.out.println(date.getYear()+1900+"年");
	} catch (ParseException e) {
System.out.println(e.toString());
	}

	
}
}
