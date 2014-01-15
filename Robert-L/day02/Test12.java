package com.eoe.se1.day02;

import java.util.ArrayList;
import java.util.HashMap;

public class Test12 {
	static HashMap<String, Object> user;// 表示一个对象
	static ArrayList<HashMap<String, Object>> users;

	public static void main(String[] args) {
		initUsers();
		System.out.println("id\t姓名\t密码\t电话\t\t邮箱");
		for (HashMap<String, Object> u : users) {
			System.out.print(u.get("id") + "\t");
			System.out.print(u.get("name") + "\t");
			System.out.print(u.get("pwd") + "\t");
			System.out.print(u.get("phone") + "\t");
			System.out.print(u.get("email"));
			System.out.println();
		}
	}

	static void initUsers() {
		users = new ArrayList<HashMap<String, Object>>();
		user = new HashMap<String, Object>();
		user.put("id", 1001);
		user.put("name", "菲菲");
		user.put("pwd", "123");
		user.put("phone", "13087316271");
		user.put("email", "1@qq.com");
		users.add(user);
		user = new HashMap<String, Object>();
		user.put("id", 1002);
		user.put("name", "旺旺");
		user.put("pwd", "456");
		user.put("phone", "13087316272");
		user.put("email", "2@qq.com");
		users.add(user);
	}
}
