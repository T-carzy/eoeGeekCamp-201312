package com.eoe.se1.day01;

public class Test11 {
public static void main(String[] args) {
	try {
		divide();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

private static void divide() {
	// TODO Auto-generated method stub
	System.out.println(10/0);
}
}
