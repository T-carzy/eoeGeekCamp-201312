package com.eoe.se2.day03;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class IoArrayOutPutStream02 {
	//ByteArrayOutPutStream向ByteArrayInputStream传递数据
public static void main(String[] args) throws IOException {
	int a=100;
	int b=33;
	int c=77;
	//创建字节数组输出流
	ByteArrayOutputStream baos=new ByteArrayOutputStream();
	//向输出流写入三个数据
	baos.write(a);
	baos.write(b);
	baos.write(c);
	//将输出流的数据输出至data
	byte[] data=baos.toByteArray();
	//创建字节输入流，获取data的数据
	ByteArrayInputStream bais=new ByteArrayInputStream(data);
	byte[] data2=new byte[3];
	//从输入流中获取数据并打印
	int len=bais.read(data2);
	System.out.println(Arrays.toString(data2));
}
}
