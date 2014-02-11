package com.eoe.se1.day02;

import java.util.ArrayList;

import com.eoe.oop.day01.User;

public class Test02 {
	public static void main(String[] args) {
		ArrayList<User> users=new ArrayList<User>();
		initUsers(users);//ע���û���ʼ��
		printUsers(users);//��ӡ����ע���û�
		User u0=users.get(0);
		User u2=users.get(2);
		if(u0.equals(u2)){
			System.out.println(users.get(0).name+"��"+users.get(2).name+"��ͬһ��ע���û�");
		}
		users.set(0, new User(1001, "�ŷ�", "1234", "68337799", "zf@qq.com"));
	}
	
	private static void printUsers(ArrayList<User> users) {
		for(User user:users){
			System.out.println(user);
		}
	}

	private static void initUsers(ArrayList<User> users) {
		users.add(new User(1001, "�ŷ�", "1234", "68337799", "zf@qq.com"));
		users.add(new User(1002, "����", "1234", "68337799", "wf@qq.com"));
		users.add(new User(1001, "���", "1234", "68337799", "lf@qq.com"));
		users.add(new User(1004, "����", "1234", "68337799", "liuf@qq.com"));
		users.add(new User(1005, "����", "1234", "68337799", "kaf@qq.com"));
	}
}
