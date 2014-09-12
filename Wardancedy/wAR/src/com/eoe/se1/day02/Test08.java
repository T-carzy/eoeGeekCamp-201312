package com.eoe.se1.day02;

import java.util.HashMap;

import com.eoe.se1.day02.User;

public class Test08 {
public static void main(String[] args) {
	HashMap<Integer, User> users=new HashMap<Integer, User>();
	User user=new User(1001, "a", "123", "68337755", "a@qq.com");
	users.put(user.id, user);
	user=new User(1002, "b", "123", "68337755", "a@qq.com");
	users.put(user.id, user);
	user=new User(1003, "c", "123", "68337755", "a@qq.com");
	users.put(user.id, user);
	System.out.println(users);
	for(int i=1001;i<1004;i++){
		System.out.println(users.get(i));
	}
}
}
