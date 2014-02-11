package com.eoe.se2.day03;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01 {
public static void main(String[] args) {
	File dir=new File("D:/wardance1/java03");
	if(!dir.exists()){
		dir.mkdirs();
	}
	File file=new File(dir,"wangduoying");
	DataOutputStream out=null;
	try {
		out=new DataOutputStream(
				new FileOutputStream(file));
		out.writeInt(255);
		out.writeUTF("张飞");
		System.out.println("输出完毕");
	
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally{
		if(out!=null){
			try {
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
}
