package com.eoe.oop.se1.day02;

import java.util.HashMap;

import com.ityw.day09_01.entity.User;



public class Test08 {
public static void main(String[] args) {
	HashMap<Integer, User> users=new HashMap<Integer,User>();
	User user=new User(1001,"�ŷ�", "1234", '��',"����", "����");
	users.put(user.id, user);
	user=new User(1002,"de��", "1234", '��',"����", "����");
	users.put(user.id, user);
	user=new User(1003,"wa��", "1234", '��',"����", "����");
	users.put(user.id, user);
	user=new User(1004,"li��", "1234", '��',"����", "����");
	users.put(user.id, user);
	for(int i=1001;i<1005;i++){
		System.out.println(users.get(i));
	}
	System.out.println();
}
}
