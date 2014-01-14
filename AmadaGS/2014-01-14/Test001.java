package com.eoe.se1.day01;

public class Test001 {

	public static void main(String[] args) {
	System.out.println("a="+compute());
	}

	 static int compute() {
		int a=5;
		try {
			int b=a/2;
		} catch (Exception e) {
			return a+=5;
		}finally{
			return a+=5;
		}
		//return a=5;
 }
}
