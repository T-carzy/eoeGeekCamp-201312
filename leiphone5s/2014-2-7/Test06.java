package se2.day03;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Test06 {
	public static void main(String[] args) {
		String src = "�ŷ�";
		System.out.println("Դ�ַ���"
		+ src);
		try {
			byte[] data = src.getBytes("utf-8");
			String dest = new String(data, "utf-8");
			System.out.println("utf-8������byte[]:" + Arrays.toString(data));
			System.out.println("��utf-8������ַ���:" + dest);
			System.out.println();
			data = src.getBytes("utf-8");
			System.out.println("utf-8������byte[]:" + Arrays.toString(data));
			dest = new String(data, "utf-8");
			System.out.println("��utf-8�������ַ���:" + dest);
			System.out.println();
			data = src.getBytes("utf-8");
			System.out.println("utf-8������byte[]:" + Arrays.toString(data));
			dest = new String(data, "utf-8");
			System.out.println("��utf-8�������ַ���:" + dest);
			System.out.println();
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
