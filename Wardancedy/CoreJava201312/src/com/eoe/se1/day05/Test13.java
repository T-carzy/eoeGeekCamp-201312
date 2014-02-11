package com.eoe.se1.day05;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Test13 {
	public static void main(String[] args) {
		DecimalFormat formater=new DecimalFormat("000,000.00");
		double d=300100.15;
		System.out.println(d);
		String text=formater.format(d);
		System.out.println(text);
		text="1,000,150.35";
		try {
			d=formater.parse(text).doubleValue();
			System.out.println(d-50);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
