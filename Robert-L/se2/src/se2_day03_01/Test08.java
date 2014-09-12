package se2_day03_01;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Test08 {
	public static void main(String[] args) {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		baos.write(55);
		baos.write(66);
		baos.write(77);
		// 将字节输出流中的数据转换为字节数组
		byte[] data = baos.toByteArray();
		ByteArrayInputStream bais = new ByteArrayInputStream(data);
		byte[] buffer = new byte[3];
		try {
			bais.read(buffer);
			System.out.println(Arrays.toString(buffer));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
