package com.eoe.se1.day03.entity.Node2_;

import java.util.ArrayList;

import com.eoe.pre.day03.entity.User;

public class Code08 {
	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		names.add("a");
		names.add("b");
		names.add("c");
		printList(names);
		ArrayList<User> users=new ArrayList<User>();
		users.add(new User(1001, "小红", "1134855", "12306", "qq@.com"));
		users.add(new User(1001, "小黄", "11583455", "15606", "qq@.com"));
		users.add(new User(1001, "小蓝鸟", "123258855", "165306", "qq@.com"));
		printList(users);
	}
public static void printList(ArrayList<?> list){
	for(int i=0;i<list.size();i++){
		System.out.println(list.get(i));
	}
}
}
