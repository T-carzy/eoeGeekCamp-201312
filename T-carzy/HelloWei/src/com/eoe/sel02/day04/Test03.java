package com.eoe.sel02.day04;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Test03 {
	public static void main(String[] args) {
		File dir=new File("e:/java_test/se2_day04");
		if(!dir.exists()){
			dir.mkdirs();
		}
		PrintWriter pw=null;
		try {
			File file=new File(dir,"test03.txt");
			if(!file.exists()){
				file.createNewFile();
			}
			pw=new PrintWriter(file,"GBK");
			pw.println("大家好");
			System.out.println("输出完毕");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if(pw!=null){
				pw.close();
			}
		}
	}
}
