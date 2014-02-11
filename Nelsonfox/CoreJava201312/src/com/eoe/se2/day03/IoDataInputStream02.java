package com.eoe.se2.day03;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IoDataInputStream02 {
public static void main(String[] args) {
	File file=new File("d:/se2/day03","text01.txt");
	if(!file.exists()){
		System.out.println("文件不存在");
		return;
	}
	try {
		DataInputStream in=new DataInputStream(new FileInputStream(file));
		int data=in.readInt();
		String name=in.readUTF();
		
		System.out.println(data+"    "+name);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
}
}
