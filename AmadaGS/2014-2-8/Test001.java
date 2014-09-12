package com.eoe.se2.day04;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class Test001 {

	public static void main(String[] args) {
		PrintStream out=new PrintStream(System.out);
		out.print('��'+"\t"+100);
		out.close();
		File dir=new File("d:/se2/day04");
		if(!dir.exists()){
			dir.mkdirs();
		}
		File file=new File(dir,"test04.txt");
		try {
			if(!file.exists()){
				file.createNewFile();
			}
			out=new PrintStream(file);
			out.println("ɺ");
			Map<String,Object> person=new HashMap<String,Object>();
			person.put("name", "��ɺ");
			person.put("sex", 'Ů');
			person.put("age", 23);
			out.println(person);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(out!=null){
				out.close();
			}
		}
	}
}
