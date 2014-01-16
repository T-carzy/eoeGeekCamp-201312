package com.eoe.sel.day02;

import java.util.HashMap;

import com.eoe.pre.oop.day01.User;

public class Test06 {

	public static void main(String[] args) {
			HashMap<Integer, User>users=new HashMap<Integer,User>();
			User user =new User(123, "张飞", "112233", "123456", "zf@qq.com");
			users.put(user.id, user);
			user=new User(124, "赵云", "223344", "123432", "zy@qq.com");
			users.put(user.id, user);
			user=new User(125, "马超", "556677", "987654", "mc@qq.com");
			users.put(user.id, user);
			System.out.println(users);
			for (int i = 123; i <=125; i++) {
				System.out.println(users.get(i));
			}
	}

}
