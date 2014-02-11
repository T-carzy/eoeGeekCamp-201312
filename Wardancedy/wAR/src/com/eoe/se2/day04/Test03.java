package com.eoe.se2.day04;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Test03 {
public static void main(String[] args) {
	File dir=new File("D:/wardance1");
	if(!dir.exists()){
		dir.mkdirs();
	}
	PrintWriter writer=null;
	File file =new File(dir,"test03.txt");
	try {
		if(!file.exists()){
			file.createNewFile();
		}
		writer=new PrintWriter(file);
		writer.println("嗨，大家好");
		System.out.println("****");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally{
		if(writer!=null){
			writer.close();
		}
	}
}
}
