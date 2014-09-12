package com.eoe.se2.day03;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

//字节数组输出流处理不同类型的数据,向ByteArrayOutPutStream直接输入
//只能是byte型，可用DataOutPutStream包装ByteArrayOutPutStream类，这样
//通过DataOutPutStream的方法就能像ByteArrayOutPutStream对象中输入不同类型的数据
public class IoByteArrayOutPutStream03 {
public static void main(String[] args) {
	ByteArrayOutputStream baos=null;
	ByteArrayInputStream bis=null;
	DataOutputStream dos=null;
	DataInputStream dis=null;
	//设置三个数据
	String name="张飞";
	char sex='男';
	int age=36;
	//创建字节数组输出流
	baos=new ByteArrayOutputStream();
	//创建数据输出流，包装字节数组输出流
	dos=new DataOutputStream(baos);
	//将不同类型的三个数据写入字节数组输出流
	try {
		dos.writeUTF(name);
		dos.writeChar(sex);
		dos.writeInt(age);
		//将输出流的数据输出为字节数组
		byte[] data=baos.toByteArray();
		//将字节数组装换为字节数组输入流
		bis=new ByteArrayInputStream(data);
		//创建数据输入流，包装字节数组输入流
		dis=new DataInputStream(bis);
		//从输入流中读取三个数据
		String name2=dis.readUTF();
		char sex2=dis.readChar();
		int age2=dis.readInt();
		//打印读取的三个数据
		System.out.println(name2+"\t"+sex2+"\t"+age2);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
