package com.eoe.se2.day03;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IoByteArrayOutPutStream02 {
public static void main(String[] args) {
	int a=100;
	int b=127;
	int c=38;//创建字节数组输出流
	ByteArrayOutputStream baos=new ByteArrayOutputStream();
	//将三个数据写入流中
	baos.write(a);
	baos.write(b);
	baos.write(c);
	//输出流中的数据为一个字节数组
	byte[] data=baos.toByteArray();
	//显示数组内容
	System.out.println(Arrays.toString(data));
}
}
