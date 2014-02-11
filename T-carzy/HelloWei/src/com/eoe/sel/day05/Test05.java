package com.eoe.sel.day05;

import java.util.Scanner;

/*
 * 
 * 键盘输入日期，验证日期的合法性。
 */
public class Test05 {
	public static void main(String[] args) {
			String regex="\\d{4}((-|.|/)\\d{1,2}){2}";
			Scanner scanner =new Scanner(System.in);
			System.out.println("输入合法日期");
			String sdate;
			boolean ok;
			do{
				sdate=scanner.next();
				ok=sdate.matches(regex);
				if(!ok){
					System.out.println("输入格式错误");
					
				}
				
			}while(!ok);
			sdate=sdate.replaceAll("-|/|\\.", " ");
			System.out.println(sdate);
			String [] data=sdate.split(" ");
			int year=Integer.parseInt(data[0]);
			if(year<1990||year>2100){
				System.out.println("年份输入有误");
				return ;
			}
			int month=Integer.parseInt(data[1]);
			if(month<1||month>12){
				System.out.println("年份输入有误");
				return ;
			}
			int day=Integer.parseInt(data[2]);
			if(day<1||day>31){
				System.out.println("天数输入有误");
				return ;
			}
	}
}
