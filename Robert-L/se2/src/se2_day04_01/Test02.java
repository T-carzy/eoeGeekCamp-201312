package se2_day04_01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

public class Test02 {
	public static void main(String[] args) {
		ArrayList<User> users = initUsers();
		File dir = new File("E:/java_test/se2_day04");
		if (!dir.exists()) {
			dir.mkdirs();
		}
		File file = new File(dir, "test02.txt");
		PrintStream out = null;
		try {
			if (!file.exists()) {
				file.createNewFile();
			}
			out = new PrintStream(file);
			for (User user : users) {
				out.println(user);
			}
			System.out.println("数据保存完毕！");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (out != null) {
				out.close();
			}
		}
	}

	static ArrayList<User> initUsers() {
		ArrayList<User> users = new ArrayList<User>();
		User user = new User(1001, "张飞", "1234");
		users.add(user);
		user = new User(1002, "王飞", "1234");
		users.add(user);
		user = new User(1003, "李飞", "1234");
		users.add(user);
		return users;
	}

}
