package se2_day03_01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import se2.day03.entity.User;

/*
 * 将User类的对象序列化并保存至磁盘。
 */
public class Test10 {
	public static void main(String[] args) {
		User user = new User(1001, "张飞", "123456");
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream(
					"E:/java_test/se2_day03/user.txt"));
			oos.writeObject(user);
			System.out.println("user对象序列化完毕！");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
}
