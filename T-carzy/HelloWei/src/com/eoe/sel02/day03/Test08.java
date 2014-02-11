package com.eoe.sel02.day03;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Test08 {
	public static void main(String[] args) {
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		baos.write(33);
		baos.write(44);
		baos.write(55);
		byte[] data=baos.toByteArray();
		ByteArrayInputStream bais=new ByteArrayInputStream(data);
		byte[] buffer=new byte[3];
		try {
			bais.read(buffer);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Arrays.toString(buffer));
	}
}
