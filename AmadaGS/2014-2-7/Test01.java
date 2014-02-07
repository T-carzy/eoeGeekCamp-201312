package com.eoe.se2.day03;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01 {

	public static void main(String[] args) {
	String fileName="test01.dat";
	File dir=new File("d:/se2/day03");
	if(!dir.exists()){
		dir.mkdirs();
	}
	File file=new File(dir, fileName);
	FileOutputStream fos=null;
	DataOutputStream dos=null;
	try {
		if(!file.exists()){
			file.createNewFile();
		}
		fos=new FileOutputStream(file);
		dos=new DataOutputStream(fos);
		dos.writeInt(0x4e2d);
		dos.writeUTF("’≈∑…");
		dos.writeChars("∏ﬂ…∫");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (Exception e) {
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
