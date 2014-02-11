package com.eoe.se1.day03;

import com.eoe.oop.day01.User;
import com.eoe.se1.day03.entity.ArrayList_;

public class Test04 {
	public static void main(String[] args) {
		ArrayList_<User>  users=new ArrayList_<User>();
		users.add(new User(1001, "a", "123", "68899933", "a@qq.com"));
		users.add(new User(1002, "b", "123", "68899933", "a@qq.com"));
		users.add(new User(1003, "cc", "123", "68899933", "a@qq.com"));
		users.add(new User(1004, "ddd", "123", "68899933", "a@qq.com"));
		for(int i=0;i<users.size();i++){
			System.out.println(users.get(i));
		}
	}
}
