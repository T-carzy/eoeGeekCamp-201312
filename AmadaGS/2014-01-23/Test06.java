package com.eoe.se2.day02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test06 {
	public static void main(String[] args) {
		String path="E:/java_test/se2_day02";
		File dir=new File(path);
		if(!dir.exists()){
			System.out.println("·������");
			return ;
		}
		File file=new File(dir, "Test01.java");
		if(!file.exists()){
			System.out.println("�ļ�������");
			return ;
		}
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(file);
			int data;
			while((data=fis.read())!=-1){
				System.out.print((char)data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(fis!=null){
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
