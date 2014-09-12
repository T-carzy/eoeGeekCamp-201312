package com.eoe.se2.day01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Code08 {
public static void main(String[] args) {
	SimpleDateFormat formater=new SimpleDateFormat("yyyy/MM/dd:HH:mm:ss");
	Date date=new Date();
	String sdate=formater.format(date);//匹配
	System.out.println(sdate);
}
}
