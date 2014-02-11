package com.eoe.sel02.day02;
/*
 * 读取d:\demo\java.txt文件内容并显示在控制台
 */
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class Test17 {
	public static void main(String[] args) {
		String path="E:/java_test/se2_day02/Test01.java";
		FileInputStream fis=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		try {
			fis=new FileInputStream(path);
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
			if(br!=null){
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
