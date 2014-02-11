package com.eoe.sel02.day04;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import com.eoe.pre.oop.day01.Out;

public class Test01 {
	public static void main(String[] args) {
		PrintStream ps=new PrintStream(System.out);
		ps.println('中'+"\t"+111);
		ps.close();
		try {
			File dir=new File("e:/java_test/se2_day04");
			if(!dir.exists()){
				dir.mkdirs();
			}
			File file=new File(dir,"test01.txt");
			if(!file.exists()){
				file.createNewFile();
			}
			ps=new PrintStream(file,"GBK");
			ps.println('中');
			ps.println(100);
			Map<String,Object> person=new HashMap<String,Object>();
			person.put("name", "wlgq");
			person.put("sex", 'n');
			person.put("age", 22);
			ps.println(person);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if(ps!=null){
				ps.close();
			}
		}
		
	}
}
