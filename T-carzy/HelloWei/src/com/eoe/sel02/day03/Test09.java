package com.eoe.sel02.day03;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Test09 {
	public static void main(String[] args) {
		String name="张飞";
		char sex='女';
		int age=11;
		DataInputStream dis=null;
		DataOutputStream dos=null;
		ByteArrayOutputStream daos=new ByteArrayOutputStream();
		dos=new DataOutputStream(daos);
		try {
			dos.writeUTF(name);
			dos.writeChar(sex);
			dos.writeInt(age);
			byte[] data=daos.toByteArray();
			ByteArrayInputStream bais=new ByteArrayInputStream(data);
			dis=new DataInputStream(bais);
			String namee=dis.readUTF();
			char sexx=dis.readChar();
			int agee=dis.readInt();
			System.out.println(namee+"\t"+sexx+"\t"+agee);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				if(dis!=null){
					dis.close();
				}
				if(dos!=null){
					dos.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
