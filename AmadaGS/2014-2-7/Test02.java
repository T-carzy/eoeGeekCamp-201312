package com.eoe.se2.day03;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test02 {

	
	public static void main(String[] args) {
		File file=new File("d:/se2/day03","test01.dat");
		if(!file.exists()){
			System.out.println("文件不存在");
			return;
		}
		FileInputStream fis=null;
		DataInputStream dis=null;
		try {
			fis=new FileInputStream(file);
			dis=new DataInputStream(fis);
			int zhong=dis.readInt();
			String utf=dis.readUTF();
			char utf16be1=dis.readChar();
			char utf16be2=dis.readChar();
			System.out.println(zhong+"\t"+utf+"\t"+utf16be1+utf16be2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			if(dis!=null){
				try {
					dis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
