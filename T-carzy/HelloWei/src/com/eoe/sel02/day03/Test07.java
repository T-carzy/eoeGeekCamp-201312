package com.eoe.sel02.day03;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Test07 {
	public static void main(String[] args) {
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		baos.write(77);
		baos.write(88);
		baos.write(99);
		byte[] data=baos.toByteArray();
		System.out.println(Arrays.toString(data));

	}
}
