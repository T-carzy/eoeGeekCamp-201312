package com.eoe.sel02.day02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class Test19 {
	public static void main(String[] args) {
		FileInputStream fis=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		String fileName="E:/java_test/se2_day02/Test11.java";
		try {
			fis=new FileInputStream(fileName);
			isr=new InputStreamReader(fis,"utf-8");
			br=new BufferedReader(isr);
			String line;
			while((line=br.readLine())!=null){
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				if(br!=null){
					br.close();
				}
				if(isr!=null){
					isr.close();
				}
				if(fis!=null){
					fis.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
