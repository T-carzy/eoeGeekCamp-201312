package com.eoe.se2.day03;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Dos01 {
public static void main(String[] args) {
	String fileName="test01.dat";
	File dir=new File("d:/se2/day03");
	if(!dir.exists()){
		dir.mkdirs();
	}
	File file=new File(dir,fileName);
	FileOutputStream fos=null;
	DataOutputStream dos=null;
	try {
		if(!file.exists()){
			file.createNewFile();
			
		}
		fos=new FileOutputStream(file);
		dos=new DataOutputStream(fos);
		dos.writeInt(0x4e2d);//将汉字‘中’的unicode写入输出流
		dos.writeDouble(Integer.MAX_VALUE+1.0);//将整形最大值+1以double类型写入输出流
		dos.writeUTF("张飞");//以UTF-8编码格式写入输出流
		dos.writeChars("王菲");
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
