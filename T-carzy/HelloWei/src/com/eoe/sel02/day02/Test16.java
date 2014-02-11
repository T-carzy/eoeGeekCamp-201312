package com.eoe.sel02.day02;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Test16 {
	public static void main(String[] args) {
		String src="Az中";
		try {
			byte[] data=src.getBytes("utf-16be");
			System.out.println("UTF-16BE编码："+Arrays.toString(data));
			data=src.getBytes("gbk");
			System.out.println("BGK编码："+Arrays.toString(data));
			data=src.getBytes("UTF-8");
			System.out.println("UTF-8编码："+Arrays.toString(data));
			String dest=new String(data,"utf-8");
			System.out.println(dest);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
