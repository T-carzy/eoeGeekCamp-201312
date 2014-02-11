package com.eoe.basic.day04;

public class Test02 {
	public static void main(String[] args) {
		char c='A';
		while(c<='Z'){
			System.out.println(c+":"+(int)c);
			c++;//½«×Ö·ûcµÄunicodeÂë+1
		}
	}
}
