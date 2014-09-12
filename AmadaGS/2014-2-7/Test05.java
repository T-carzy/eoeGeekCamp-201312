package com.eoe.se2.day03;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		File file=new File("d:/se2/day03/test04.dat");
		RandomAccessFile raf=null;
		try {
			raf=new RandomAccessFile(file,"r");
			System.out.println("读取文件中的数据，选择1~5");
			int select=new Scanner(System.in).nextInt();
			switch (select) {
			case 1:
				raf.seek(0);
				System.out.println(raf.read());
				break;
			case 2:
				raf.seek(1);
				System.out.println(raf.readInt());
				break;
			case 3:
				raf.seek(5);
				System.out.println(raf.readUTF());
				break;
			case 4:
				raf.seek(13);
				System.out.println(""+raf.readChar()+raf.readChar()+raf.readChar());
				break;
			case 5:
			    raf.seek(19);
			    System.out.println(raf.readChar());
			    break;
			default:
				break;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(raf!=null){
				try {
					raf.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
