package com.eoe.se2.day02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File08 {
public static void main(String[] args) {
	String path="D:/se2/day01";
    File dir=new File(path);
    if(!dir.exists()){
    	System.out.println("路径错误");
    	return;
    }
    File file=new File(dir,"d:/se2/day01/Android_Day04.zip");
    if(!file.exists()){
    	System.out.println("文件不存在");
    	return;
    }
    File destDir=new File("D:/");
    if(!destDir.exists()){
    	destDir.mkdirs();
    }
File destFile=new File(destDir,"D:");
FileInputStream fis=null;
FileOutputStream fos=null;
try {
	fis=new FileInputStream(file);
	fos=new FileOutputStream(destFile);
	int len;
	byte[] buffer=new byte[512];
	long startTime=System.currentTimeMillis();
	while((len=fis.read(buffer))!=-1){
		fos.write(buffer,0,len);
	}
	long endTime=System.currentTimeMillis();
	System.out.println("文件复制完毕，花费时间："+(endTime-startTime)+"毫秒");
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}finally{
	if(fis!=null){
		try {
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	if(fos!=null){
		try {
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

}
}
