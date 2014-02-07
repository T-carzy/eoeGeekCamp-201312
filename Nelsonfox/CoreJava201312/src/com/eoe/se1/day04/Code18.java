package com.eoe.se1.day04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Code18 {
public static void main(String[] args) {
	String[] data={"0x55ff","0x78ad","0x32ah","0x7ff1"};
	String regex="0[xX][\\da-fA-F]{4}";
	Pattern p=Pattern.compile(regex);
	for(int i=0;i<data.length;i++){
		Matcher m=p.matcher(data[i]);
		if(m.find()){
			
			System.out.println(m.group());
		}
	}
}
}
