package com.eoe.se2.day03;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Test08 {

	
	public static void main(String[] args) {
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		baos.write(69);
		baos.write(20);
		baos.write(57);
		byte[] data=baos.toByteArray();
		System.out.println(Arrays.toString(data));
		
	}

}
