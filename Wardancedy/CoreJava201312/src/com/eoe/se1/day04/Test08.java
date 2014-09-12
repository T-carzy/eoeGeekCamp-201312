package com.eoe.se1.day04;

import java.util.HashMap;
import java.util.Set;

public class Test08 {
	public static void main(String[] args) {
		String text="father and mother,we are family,";
		text+="grand father and grand mother we are family";
		HashMap<Character, Integer> counts=new HashMap<Character, Integer>();
		//循环，统计每个字符出现的次数
		for(int i=0;i<text.length();i++){
			char c=text.charAt(i);
			Integer count=counts.get(c);
			count=count==null?1:count+1;
			counts.put(c, count);
//			if(count==null){
//				counts.put(c, 1);
//			}else{
//				counts.put(c, count+1);
//			}
		}
		System.out.println("字符\t\t出现次数\t\t百分比");
		Set<Character> keys=counts.keySet();
		for(Character key:keys){
			int value=counts.get(key);
			double percent=1.0*value*100/text.length();
			System.out.println(key+"\t\t"+counts.get(key)+"\t\t"+percent+"%");
		}
	}
}
