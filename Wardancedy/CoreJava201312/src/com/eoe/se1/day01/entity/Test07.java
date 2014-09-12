package com.eoe.se1.day01.entity;

import java.util.HashMap;

import com.eoe.oop.day01.User;

public class Test07 {
	public static void main(String[] args) {
		HashMap<Integer, User> users=new HashMap<Integer, User>();
		User user=new User(1001, "aa", "123", "68337789", "aa@qq.com");
		users.put(user.id, user);
		user=new User(1002, "bb", "123", "68337789", "aa@qq.com");
		users.put(user.id, user);
		user=new User(1003, "cc", "123", "68337789", "aa@qq.com");
		users.put(user.id, user);
		
		User user2=users.get(1003);
		System.out.println(user2);
	}
}
