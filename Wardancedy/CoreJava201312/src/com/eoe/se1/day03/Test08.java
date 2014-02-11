package com.eoe.se1.day03;

import java.util.ArrayList;

import com.eoe.oop.day01.User;
import com.eoe.se1.day03.entity.ArrayList_;

public class Test08 {
	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		names.add("a");
		names.add("bb");
		names.add("ccc");
		printList(names);
		
		ArrayList<User> users=new ArrayList<User>();
		users.add(new User(1001, "a", "123", "68337799", "a@qq.com"));
		users.add(new User(1002, "bb", "123", "68337799", "a@qq.com"));
		users.add(new User(1003, "ccc", "123", "68337799", "a@qq.com"));
		printList(users);
	}
	public static void printList(ArrayList<?> list){
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
}
