package com.eoe.se1.day05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test12 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("��������:");
		String sdate=scanner.next();
		SimpleDateFormat formater=new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date=formater.parse(sdate);
			System.out.println(date.getYear()+1900+"��");
		} catch (ParseException e) {
			System.out.println(e.toString());
		}
		
	}
}
