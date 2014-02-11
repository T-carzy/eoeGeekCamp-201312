package com.eoe.se1.day02;

import java.util.ArrayList;

import com.eoe.oop.day01.User;

public class Test02 {
	public static void main(String[] args) {
		ArrayList<User> users=new ArrayList<User>();
		initUsers(users);//注册用户初始化
		printUsers(users);//打印所有注册用户
		User u0=users.get(0);
		User u2=users.get(2);
		if(u0.equals(u2)){
			System.out.println(users.get(0).name+"与"+users.get(2).name+"是同一个注册用户");
		}
		users.set(0, new User(1001, "张飞", "1234", "68337799", "zf@qq.com"));
	}
	
	private static void printUsers(ArrayList<User> users) {
		for(User user:users){
			System.out.println(user);
		}
	}

	private static void initUsers(ArrayList<User> users) {
		users.add(new User(1001, "张飞", "1234", "68337799", "zf@qq.com"));
		users.add(new User(1002, "王飞", "1234", "68337799", "wf@qq.com"));
		users.add(new User(1001, "李飞", "1234", "68337799", "lf@qq.com"));
		users.add(new User(1004, "刘飞", "1234", "68337799", "liuf@qq.com"));
		users.add(new User(1005, "咖啡", "1234", "68337799", "kaf@qq.com"));
	}
}
