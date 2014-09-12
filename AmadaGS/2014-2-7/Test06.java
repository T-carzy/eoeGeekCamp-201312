package com.eoe.se2.day03;

import java.io.ByteArrayInputStream;

public class Test06 {

	public static void main(String[] args) {
		byte[] data={23,78,100};
		ByteArrayInputStream bais=new ByteArrayInputStream(data);
		int a=bais.read();
		int b=bais.read();
		int c=bais.read();
		System.out.println(a+"\t"+b+"\t"+c);

	}

}
