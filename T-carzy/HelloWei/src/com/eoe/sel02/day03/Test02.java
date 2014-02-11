package com.eoe.sel02.day03;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test02 {
public static void main(String[] args) {
	File dir=new File("e:/java_test/se2_day03");
	File file=new File(dir,"test01.txt");
	if(!file.exists()){
		System.out.println("文件不存在");
		return ;
	}
	try {
		DataInputStream in=new DataInputStream(new FileInputStream(file));
		int data=in.readInt();
		String name=in.readUTF();
		System.out.println(data+"\t"+name);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
