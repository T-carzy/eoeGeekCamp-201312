package com.eoe.sel.day02;

import java.util.ArrayList;

import com.eoe.pre.oop.day01.User;

public class _User {


	public static void main(String[] args) {
			ArrayList<User> users=new ArrayList<User>();
			initUsers(users);
			printUsers(users);
			User u0=users.get(0);
			User u2=users.get(2);
			if(u0.equals(u2)){
				System.out.println("他们是同一个注册用户");
			}
			users.set(0, new User(110, "张飞", "0123455", "123456", "zf@qq.com"));
			
	}

	private static void printUsers(ArrayList<User> users) {
		for (User user : users) {
			System.out.println(user);
		}
	}

	private static void initUsers(ArrayList<User> users) {
		users.add(new User(110, "张飞", "0123455", "123456", "zf@qq.com"));
		users.add(new User(111, "马超", "0123466", "123456", "mc@qq.com"));
		users.add(new User(112, "赵云", "0123477", "123456", "zy@qq.com"));
		users.add(new User(113, "关羽", "0123488", "123456", "gy@qq.com"));
		users.add(new User(114, "黄忠", "0123499", "123456", "hz@qq.com"));

	}

}
