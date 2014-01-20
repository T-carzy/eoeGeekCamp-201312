package com.eoe.se1.day04;

import java.util.HashMap;
import java.util.Set;

import com.eoe.pre.day03.entity.User;

public class Code08 {
public static void main(String[] args) {
	HashMap<Integer, User> users=new HashMap<Integer, User>();
	User user=new User(1001, "aaa", "120541","852963", "wc@qq.com");
	users.put(user.id,user);
	user=new User(1002, "b", "1234", "68337799", "lisi@qq.com");
	users.put(user.id, user);
	user=new User(1003, "c", "1234", "68337799", "wangwu@qq.com");
	users.put(user.id, user);
	//遍历HashMap集合的方式
	//取出所有键的集合
	Set<Integer> keys=users.keySet();
	//遍历建的集合，取出HashMap中的值
	for(Integer key:keys){
		User u=users.get(key);
		System.out.println(u);
	}
}
}
