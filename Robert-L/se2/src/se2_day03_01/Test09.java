package se2_day03_01;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Test09 {
	public static void main(String[] args) {
		String name = "张飞";
		char sex = '男';
		int age = 23;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		ByteArrayOutputStream daos = new ByteArrayOutputStream();
		dos = new DataOutputStream(daos);
		try {
			dos.writeUTF(name);
			dos.writeChar(sex);
			dos.writeInt(age);
			byte[] data = daos.toByteArray();
			ByteArrayInputStream bais = new ByteArrayInputStream(data);
			dis = new DataInputStream(bais);
			String name2 = dis.readUTF();
			char sex2 = dis.readChar();
			int age2 = dis.readInt();
			System.out.println(name2 + "\t" + sex2 + "\t" + age2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (dis != null) {
					dis.close();
				}
				if (dos != null) {
					dos.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
