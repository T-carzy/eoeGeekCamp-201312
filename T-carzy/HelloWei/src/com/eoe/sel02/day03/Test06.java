package com.eoe.sel02.day03;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Test06 {
	public static void main(String[] args) {
		byte[] data={11,22,33};
		System.out.println(Arrays.toString(data));
		ByteArrayInputStream bais=new ByteArrayInputStream(data);
		byte[] buffer=new byte[3];
		try {
			int len=bais.read(buffer);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Arrays.toString(buffer));
	}
}
