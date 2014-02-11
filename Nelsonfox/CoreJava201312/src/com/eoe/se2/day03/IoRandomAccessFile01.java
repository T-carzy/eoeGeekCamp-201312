package com.eoe.se2.day03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class IoRandomAccessFile01{
public static void main(String[] args) {
	RandomAccessFile raf=null;
	try {
		raf=new RandomAccessFile("d:/se2/day03/text01.txt", "rw");
		raf.write(255);
		raf.writeInt(1000);
		raf.writeUTF("张飞");
		raf.writeChars("刘亦菲");
		raf.seek((0));
		System.out.println(raf.read());
		System.out.println(raf.readInt());
		System.out.println(raf.readUTF());
		System.out.println(raf.readChar()+""+raf.readChar()+raf.readChar());
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally{
		if(raf!=null){
			try {
				raf.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
}	
	
	

