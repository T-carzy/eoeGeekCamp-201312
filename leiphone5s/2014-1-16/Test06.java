package com.eoe.se1.day03;

import com.ityw.day09_01.entity.User;

public class Test06 {
	public static void main(String[] args) {
		ArrayList_<User> users = new ArrayList_<User>();
		users.add(new User(12, "�ŷ�", "1246", '��', "����", "����"));
		users.add(new User(15, "����", "1246", 'Ů', "����", "����"));
		users.add(new User(18, "���", "1246", '��', "����", "����"));
		users.add(new User(17, "�Է�", "1246", 'Ů', "����", "����"));
		users.add(new User(16, "Ǯ��", "1246", '��', "����", "����"));
		for(int i=0;i<users.size();i++){
			System.out.println(users.get(i));
		}
	}
	
}
