package com.ityw.se1.day03;

import com.eoe.oop.day3.User;
import com.eoe.se1.day03.entity.ArrayList_;

public class TestArrayList_ {

	public static void main(String[] args) {
		ArrayList_<User> users=new ArrayList_<User>();
		users.add(new User(1001, "a", "123", "68899933", "a@qq.com"));
		users.add(new User(1001, "b", "123", "68899933", "a@qq.com"));
		users.add(new User(1001, "c", "123", "68899933", "a@qq.com"));
		users.add(new User(1001, "d", "123", "68899933", "a@qq.com"));
		users.add(new User(1001, "e", "123", "68899933", "a@qq.com"));
		for(int i=0;i<users.size();i++){
			System.out.println(users.get(i));
		}
		

	}

}
