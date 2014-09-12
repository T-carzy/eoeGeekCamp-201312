package se2_day03_01;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Test07 {
	public static void main(String[] args) {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		baos.write(55);
		baos.write(66);
		baos.write(77);
		byte[] data = baos.toByteArray();
		System.out.println(Arrays.toString(data));
	}
}
