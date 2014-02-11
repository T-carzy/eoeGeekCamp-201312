package com.eoe.se1.day04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Code16 {
public static void main(String[] args) {
	String text="a b,c ,d";
	Pattern p=Pattern.compile(",");
	Matcher m=p.matcher(text);//按,进行与text匹配
	if(m.find()){
		System.out.println(m.group()+"\tstart:"+m.start()+"\tend:"+m.end());
		
	}else{
		System.out.println("not found!");
	}
}
}
