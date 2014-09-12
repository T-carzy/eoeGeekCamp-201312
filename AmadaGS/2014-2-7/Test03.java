package com.eoe.se2.day03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test03 {

	
	public static void main(String[] args) {
		String fileName="comprise.zip";
		File dir=new File("D:/se1/src");
		File file=new File(dir, fileName);
		FileInputStream fis=null;
		BufferedInputStream  bis=null;
		BufferedOutputStream bos=null;
		try {
			fis=new FileInputStream(file);
			bis=new BufferedInputStream(fis);
			bos=new BufferedOutputStream(
					new FileOutputStream("D:/se1/dest/comprise.zip"));
			byte[] data=new byte[1024*10];
			int len;
		while((len=bis.read(data))!=-1){
			bos.write(data,0,len);
		}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(bos!=null){
					bos.close();
				}
				if(bis!=null){
					bis.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
