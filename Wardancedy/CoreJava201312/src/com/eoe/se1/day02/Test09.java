package com.eoe.se1.day02;

import java.util.ArrayList;
import java.util.HashMap;

public class Test09 {
	static HashMap<String, Object> user;//��ʾһ������
	static ArrayList<HashMap<String, Object>> users;
	public static void main(String[] args) {
		initUsers();
		System.out.println("id\t����\t����\t�绰\t\t����");
		for(HashMap<String, Object> u:users){
			System.out.print(u.get("id")+"\t");
			System.out.print(u.get("name")+"\t");
			System.out.print(u.get("pwd")+"\t");
			System.out.print(u.get("phone")+"\t");
			System.out.print(u.get("email"));
			System.out.println();
		}
	}
	static void initUsers() {
		users=new ArrayList<HashMap<String,Object>>();
		user=new HashMap<String, Object>();
		user.put("id",1001);
		user.put("name", "�ŷ�");
		user.put("pwd", "1234");
		user.put("phone", "68337799");
		user.put("email", "zf@qq.com");
		users.add(user);
		user=new HashMap<String, Object>();
		user.put("id",1002);
		user.put("name", "����");
		user.put("pwd", "1234");
		user.put("phone", "68337799");
		user.put("email", "wf@qq.com");
		users.add(user);
		//System.out.println(users);
	}
}
