package com.eoe.se1.day02;

import java.util.ArrayList;

import com.eoe.pre.oop.day01.User;

public class Test06 {
	public static void main(String[] args) {
		ArrayList<User> users = new ArrayList<User>();
		initUsers(users);// 注册用户初始化
		printUsers(users);

	}

	private static void printUsers(ArrayList<User> users) {
		for (User user : users) {
			System.out.println(user);
		}
	}
	private static void initUsers(ArrayList<User> users) {
		users.add(new User(1001, "张飞", "123456789", "04763915091", "1@qq.com"));
		users.add(new User(1002, "孟非", "789456123", "04763915092", "2@qq.com"));
		users.add(new User(1003, "韩飞", "987654321", "04763915093", "3@qq.com"));
		users.add(new User(1004, "李飞", "123789456", "04763915094", "4@qq.com"));
		
	}

}
