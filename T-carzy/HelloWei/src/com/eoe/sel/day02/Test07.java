package com.eoe.sel.day02;

import java.util.ArrayList;
import java.util.HashMap;

public class Test07 {
		static HashMap<String, Object> user;
		static ArrayList<HashMap<String, Object>>users;
	public static void main(String[] args) {
			initUsers();
			System.out.println();
			for (HashMap<String, Object> u : users) {
				System.out.print(u.get("id")+"\t");
				System.out.print(u.get("name")+"\t");
				System.out.print(u.get("pwd")+"\t");
				System.out.print(u.get("phone")+"\t");
				System.out.print(u.get("email"));
				System.out.println();
			}
	}
	private static void initUsers() {
			users=new ArrayList<HashMap<String, Object>>();
			user=new HashMap<String,Object>();
			user.put("id", 110);
			user.put("name", "张飞");
			user.put("pwd", "123456");
			user.put("phone", "123456789");
			user.put("email", "zf@qq.com");
			users.add(user);
			user=new HashMap<String,Object>();
			user.put("id", 111);
			user.put("name", "王菲");
			user.put("pwd", "123456");
			user.put("phone", "123456789");
			user.put("email", "wf@qq.com");
			users.add(user);
			
	}

}
