package com.eoe.se1.day03;

import com.eoe.pre.oop.day01.User;

public class Test04 {
	public static void main(String[] args) {
		ArrayList_<User> users = new ArrayList_<User>();
		users.add(new User(1001, "a", "123", "68899931", "1@qq.com"));
		users.add(new User(1002, "b", "456", "68899932", "2@qq.com"));
		users.add(new User(1003, "cc", "789", "68899933", "3@qq.com"));
		users.add(new User(1004, "ddd", "369", "68899934", "4@qq.com"));
		for (int i = 0; i < users.size(); i++) {
			System.out.println(users.get(i));
		}
	}
}
