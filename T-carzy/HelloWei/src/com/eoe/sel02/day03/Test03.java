package com.eoe.sel02.day03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test03 {
public static void main(String[] args) {
	BufferedInputStream bis=null;
	BufferedOutputStream bos=null;
	try {
		FileInputStream fis=new FileInputStream("E:/tools/ChromeSetup.exe");
		bis=new BufferedInputStream(fis);
		FileOutputStream fos=new FileOutputStream("E:/java_test/se2_day03/ChromeSetup.exe");
		byte[] buffer=new byte[1024*10];
		bos=new BufferedOutputStream(fos);
		int len;
		while((len=fis.read(buffer))!=-1){
			fos.write(buffer, 0, len);
		}
		System.out.println("文件复制完毕");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally{
		try {
			if(bis!=null){
				bis.close();
			}
			if(bos!=null){
				bos.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
}
