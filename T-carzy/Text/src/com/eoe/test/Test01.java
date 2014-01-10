package com.eoe.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
	
		ArrayList<String> arr=new ArrayList<>();
		arr.add("王多英");
		arr.add("李伟");
		arr.add("侯亮");
		arr.add("冯蕾");
		arr.add("韩伟");
		arr.add("梁伟峰");
		arr.add("高珊"); 
		arr.add("樊昶");
		arr.add("沈少阳");
		Scanner scanner=new Scanner(System.in);
		do{
			System.out.println("开始抽奖，请各位睁大双眼...");
			scanner.next();
			System.err.println("恭喜"+arr.remove((int)(Math.random()*arr.size()))+"中了五百万，请上台领奖");
		}while(true);
	}
}
