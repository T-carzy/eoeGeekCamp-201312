package com.eoe.se1.day04;

import java.util.HashMap;
import java.util.Set;

public class Code09 {
public static void main(String[] args) {
	String text="father and mother,we are family,";
	text+="grand father and grand mother we are family";
	HashMap<Character, Integer> counts=new HashMap<Character, Integer>();
	//循环，统计每个字符出现的次数
	for(int i=0;i<text.length();i++){
		char c=text.charAt(i);
		Integer count=counts.get(c);//通过key（字符）找到count
		count=count==null?1:count+1;//如果count为空给你加一，否则，在原基础加一
		counts.put(c, count);
	}
	System.out.println("字符\t\t出现次数\t\t百分比");
	Set<Character> keys=counts.keySet();//通过键值遍历
	for(Character key:keys){
		int value=counts.get(key);
		double percent=1.0*value*100/text.length();
		percent=Math.round(percent*100)/100.0;
		System.out.println(key+"\t\t"+counts.get(key)+"\t\t"+percent+"%");
	}
}
}
