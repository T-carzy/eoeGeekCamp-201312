package com.eoe.se2.day04;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

import com.eoe.se1.day02.User;

public class Test02 {
	public static void main(String[] args) {
		ArrayList<User> users = initUsers();
		File dir = new File("D:/wardance1");
		if (!dir.exists()) {
			dir.mkdirs();
		}
		File file = new File(dir, "test02.txt");
		PrintStream out = null;
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			out=new PrintStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (User user : users) {
			out.println(user);
		}
		System.out.println("完成");
	}
	private static ArrayList<User> initUsers() {
		ArrayList<User> users=new ArrayList<User>();
		User user=new User(1001, "张飞", "1234", null, null);
		users.add(user);
		user=new User(1002, "王飞", "1234", null, null);
		users.add(user);
		user=new User(1003, "李飞", "1234", null, null);
		users.add(user);
		return users;
	}
}
