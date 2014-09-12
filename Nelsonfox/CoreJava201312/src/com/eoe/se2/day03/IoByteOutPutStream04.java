package com.eoe.se2.day03;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class IoByteOutPutStream04 {
public static void main(String[] args) {
	String name="张飞";
	char sex='男';
	int age=33;
	DataInputStream dis=null;
	DataOutputStream dos=null;
	ByteArrayOutputStream daos=new ByteArrayOutputStream();
	dos=new DataOutputStream(daos);//包装ByteArrayOutPutStream类
	try {
		dos.writeUTF(name);//写入数据
		dos.writeChar(sex);
		dos.writeInt(age);
		byte[] data=daos.toByteArray();//转换成数组
		ByteArrayInputStream bais=new ByteArrayInputStream(data);//转换成输入流
		dis=new DataInputStream(bais);//包装ByteArrayInPutStream类
		String name2=dis.readUTF();//读取数据
		char sex2=dis.readChar();
		int age2=dis.readInt();
		System.out.println(name2+"\t"+sex2+"\t"+age2);//打印数据
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
