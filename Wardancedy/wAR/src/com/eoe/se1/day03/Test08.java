package com.eoe.se1.day03;

import java.util.ArrayList;

import com.eoe.se1.day02.User;

public class Test08 {
public static void main(String[] args) {
	ArrayList<String> names=new ArrayList<String>();
	names.add("a");
	names.add("bb");
	names.add("ccc");
	printList(names);
	
	ArrayList<User> users= new ArrayList<User>();
	users.add(new User(100,"a","aa","123","a@qq.com"));
	users.add(new User(100,"bb","bb","456","a@qq.com"));
	users.add(new User(100,"ccc","ccc","789","a@qq.com"));
	printList(users);
}
public static void printList(ArrayList<?> list) {
	for (int i = 0; i < list.size(); i++) {
		System.out.println(list.get(i));
		
	}
	// TODO Auto-generated constructor stub
}
}
