package se2_day03_01;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import se2.day03.entity.User;

/*
 * 用对象的序列化和反序列化技术实现对象的深层复制。
 */
public class Test12 {
	public static void main(String[] args) {
		User user1 = new User(1002, "王菲", "123456");
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		// 创建字节数组输出流
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		// 创建对象输出流，并包装字节数组输出流
		try {
			oos = new ObjectOutputStream(baos);
			// 将对象user1序列化到字节数组输出流中
			oos.writeObject(user1);
			// 创建字节数组输入流，数据源是字节数组输出流转换为的字节数组
			ByteArrayInputStream bais = new ByteArrayInputStream(
					baos.toByteArray());
			ois = new ObjectInputStream(bais);
			User user2 = (User) ois.readObject();
			System.out.println(user2);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (ois != null) {
					ois.close();
				}
				if (oos != null) {
					oos.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}