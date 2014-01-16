package com.eoe.se1.day02;

import java.util.HashMap;

import com.eoe.pre.oop.day01.User;

public class Test11 {
	public static void main(String[] args) {
		HashMap<Integer, User> users = new HashMap<Integer, User>();
		User user = new User(1001, "菲菲", "123", "13087316271", "1@qq.com");
		users.put(user.id, user);
		user = new User(1002, "多多", "456", "13087316272", "2@qq.com");
		users.put(user.id, user);
		user = new User(1003, "旺旺", "789", "13087316273", "3@qq.com");
		users.put(user.id, user);
		System.out.println(users);
		for (int i = 1001; i < 1003; i++) {
			System.out.println(users.get(i));
		}
	}
}
