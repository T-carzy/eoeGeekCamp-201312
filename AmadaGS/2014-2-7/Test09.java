package com.eoe.se2.day03;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Test09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ByteArrayOutputStream baos=null;
		DataOutputStream dos=null;
		DataInputStream dis=null;
		String name="ÕÅ·É";
		char sex='ÄÐ';
		int age=35;
		baos=new ByteArrayOutputStream();
		dos=new DataOutputStream(baos);
		try {
			dos.writeUTF(name);
			dos.writeChar(sex);
			dos.writeInt(age);
			byte[] data=baos.toByteArray();
			ByteArrayInputStream bis=null;
			bis=new ByteArrayInputStream(data);
			dis=new DataInputStream(bis);
			String name2=dis.readUTF();
			char sex2=dis.readChar();
			int age2=dis.readInt();
			System.out.println(name2+"\t"+sex2+"\t"+age2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
