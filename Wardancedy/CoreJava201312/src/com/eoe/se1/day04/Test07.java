package com.eoe.se1.day04;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import com.eoe.oop.day01.User;

public class Test07 {
	public static void main(String[] args) {
		HashMap<Integer, User> users=new HashMap<Integer, User>();
		User user=new User(1001, "aa", "1234", "68337799", "zs@qq.com");
		users.put(user.id, user);
		user=new User(1002, "b", "1234", "68337799", "lisi@qq.com");
		users.put(user.id, user);
		user=new User(1003, "c", "1234", "68337799", "wangwu@qq.com");
		users.put(user.id, user);
		//遍历HashMap集合的方式(2)
		//取出HashMap中所有键-值对，类型是Set<Entry<Integer, User>>
		Set<Entry<Integer, User>> entrys=users.entrySet();
		for(Entry<Integer, User> entry:entrys){
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}
}
