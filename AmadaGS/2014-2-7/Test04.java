package com.eoe.se2.day03;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Test04 {

	public static void main(String[] args) {
		File dir=new File("d:/se2/day03");
		if(!dir.exists()){
			dir.mkdirs();
		}
		File file=new File(dir,"test04.dat");
		try {
			if(!file.exists()){
				file.createNewFile();
			}
			RandomAccessFile raf=new RandomAccessFile(file, "rw");
			raf.write(255);
		    raf.writeInt(10000);
		    raf.writeUTF("�ŷ�");
		    raf.writeChars("������");
		    raf.writeChar('g');
		    System.out.println("��ǰ�ļ�ָ���λ�ã�"+raf.getFilePointer());
		    raf.seek(0);
		    int i=raf.read();
		    System.out.println("�ļ��ĵ�һ�����ݣ�"+i);
		    i=raf.readInt();
		    System.out.println("�ļ��ĵڶ������ݣ�"+i);
		    String i1=raf.readUTF();
		    System.out.println("�ļ��ĵ��������ݣ�"+i1);
		    i1=raf.readChar()+""+raf.readChar()+raf.readChar();
		    System.out.println("�ļ��ĵ��ĸ����ݣ�"+i1);
		    char i2=raf.readChar();
		    System.out.println("�ļ��ĵ�������ݣ�"+i2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
