package com.eoe.se2.day04;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class Test01 {

	public static void main(String[] args) {
		PrintStream out=new PrintStream(System.out);
		out.print(""+'ÖÐ'+'\t'+100);
		System.out.println();
		//out.close();
		File dir=new File("d:/se1/day04");
		if(!dir.exists()){
			dir.mkdirs();
		}
		File file=new File(dir,"test02.txt");
		try{
			if(!file.exists()){
				file.createNewFile();
			}
		out=new PrintStream(file);
		out.println('ÖÐ');
		out.println(100);
		Map<String,Object> person=new HashMap<String, Object>();
		person.put("name", "ÕÅ·É");
		person.put("sex",'ÄÐ');
		person.put("age", 35);
		out.println(person);
		System.out.println("%%%%%%");
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(out!=null){
				out.close();
			}
		}
	}
}
