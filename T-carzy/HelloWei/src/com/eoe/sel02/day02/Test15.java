package com.eoe.sel02.day02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test15 {
	public static void main(String[] args) {
			FileInputStream fis=null;
			
			try {
				fis=new FileInputStream("E:/java_test/se2_day02/Test01.java");
				int n = fis.read();
				System.out.println(n);
				n=fis.read();
				System.out.println(n+"\t"+Integer.toHexString(n));
				n=fis.read();
				n=fis.read()|n<<8;
				System.out.println(n+"\t"+Integer.toHexString(n)+"\t"+(char)n);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
}
}
