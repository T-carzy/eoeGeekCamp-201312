package com.eoe.se2.day04;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Test003 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PrintWriter writer=new PrintWriter(System.out);
		writer.println('��');
		writer.println("���~");
		writer.flush();
		File dir=new File("d:/se2/day04");
		if(!dir.exists()){
			dir.mkdirs();
		}
		//PrintWriter writer=null; 
		File file=new File(dir,"test003.txt");
		try {
			if(!file.exists()){
				file.createNewFile();
			}
			writer =new PrintWriter(file);
			writer.println("�ˣ���Һ�~");
			System.out.println("*********");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(writer!=null){
				writer.close();
			}
		}
	}

}
