package se2_day03_01;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

/*
 * ByteArrayInputStram示例1
 */
public class Test06 {
	public static void main(String[] args) {
		byte[] data = { 55, 66, 77 };
		System.out.println(Arrays.toString(data));
		ByteArrayInputStream bais = new ByteArrayInputStream(data);
		byte[] buffer = new byte[3];
		try {
			int len = bais.read(buffer);
			System.out.println(Arrays.toString(buffer));
			System.out.println(len);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
