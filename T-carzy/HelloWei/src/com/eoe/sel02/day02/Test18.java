package com.eoe.sel02.day02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class Test18 {
	public static void main(String[] args) {
		String srcFile="E:/java_test/se2_day02/Test19.java";
		String destFile="E:/java_test/se2_day02/Test11.java";
		FileInputStream fis=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		FileOutputStream fos=null;
		OutputStreamWriter osw=null;
		try {
			fis=new FileInputStream(srcFile);
			isr=new InputStreamReader(fis,"gbk");
			br=new BufferedReader(isr);
			fos=new FileOutputStream(destFile);
			osw=new OutputStreamWriter(fos, "utf-8");
			String line=null;
			while((line=br.readLine())!=null){
				osw.write(line+"\n");
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
				if(osw!=null){
					osw.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
