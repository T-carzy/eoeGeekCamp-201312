package com.eoe.sel02.day02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 对int类型的数据进行序列化并保存至文件中。
 */
public class Test14 {
	public static void main(String[] args) {
		FileOutputStream fos=null;
		try {
			fos=new FileOutputStream("E:/java_test/se2_day02/Test01.java");
			int n=65;
			fos.write(n);
			n=0x7f;//01111 1111 127
			fos.write(n);
			char c='中';
			n=(int)c;
			System.out.println(n+"\t0x"+Integer.toHexString(n));
			fos.write(n>>8);
			fos.write(n);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(fos!=null){
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}
