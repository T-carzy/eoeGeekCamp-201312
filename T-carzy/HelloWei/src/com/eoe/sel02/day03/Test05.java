package com.eoe.sel02.day03;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Test05 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	try {
		RandomAccessFile raf=new RandomAccessFile("E:/java_test/se2_day03/test04", "r");
		System.out.println("1-读取第一个数据");
		System.out.println("2-读取第二个数据");
		System.out.println("3-读取第三个数据");
		System.out.println("4-读取第四个数据");
		int select=scanner.nextInt();
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
			System.out.println(raf.readChar()+""+raf.readChar()+raf.readChar()+raf.readChar());
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
