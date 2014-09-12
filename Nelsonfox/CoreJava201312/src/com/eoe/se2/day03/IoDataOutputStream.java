package com.eoe.se2.day03;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoDataOutputStream {
public static void main(String[] args) {
	File dir=new File("d:/se2/day03");
	if(!dir.exists()){
		dir.mkdirs();
	}
	File file=new File(dir,"text01.txt");
	FileOutputStream fos=null;
	DataOutputStream dos=null;
	try {
		if(!file.exists()){
			file.createNewFile();
		}
		fos=new FileOutputStream(file);
		dos=new DataOutputStream(fos);
		dos.writeInt(255);
		dos.writeUTF("张飞");
		dos.writeChars("王菲");
		System.out.println("输出完毕");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally{
		if(dos!=null){
			try {
				dos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
}
