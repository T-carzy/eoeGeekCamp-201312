package com.eoe.oop.se1.day02;

import java.util.ArrayList;
import java.util.HashMap;

public class Test09 {
	static HashMap<String, Object> user;// ��ʾһ������
	static ArrayList<HashMap<String, Object>> users;
	final static String NAME="name";
	final static String PWD="pwd";
	final static String PHONE="phone";
	final static String EMAIL="email";
	public static void main(String[] args) {
		initUsers();
		System.out.println("id\t����\t����\t�绰\t\t����");
		for(HashMap<String, Object> u:users){
			System.out.print(u.get("id")+"\t");
			System.out.print(u.get(NAME)+"\t");
			System.out.print(u.get(PWD)+"\t");
			System.out.print(u.get(PHONE)+"\t");
			System.out.print(u.get(EMAIL)+"\t");
			System.out.println();
		}
	}

	private static void initUsers() {
		users = new ArrayList<HashMap<String, Object>>();
		user = new HashMap<String, Object>();
		user.put("id", 1001);
		user.put(NAME, "�ŷ�");
		user.put(PWD, "1234");
		user.put(PHONE, "68337799");
		user.put(EMAIL, "zf@qq.com");
		users.add(user);
		user = new HashMap<String, Object>();
		user.put("id", 1002);
		user.put(NAME, "����");
		user.put(PWD, "1234");
		user.put(PHONE, "68337799");
		user.put(EMAIL, "wf@qq.com");
		users.add(user);
	}
}
