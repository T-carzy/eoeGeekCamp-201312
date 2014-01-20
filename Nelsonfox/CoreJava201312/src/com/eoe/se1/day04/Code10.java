package com.eoe.se1.day04;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

import com.eoe.pre.day03.entity.User;

public class Code10 {
public static void main(String[] args) {
	HashMap<Integer, User> users=new HashMap<Integer, User>();
	User user=new User(1001, "aa", "1235", "5244117", "am@qq.com");
	users.put(user.id, user);
	user=new User(1002, "ee", "1252", "552288", "wws@qq.com");
	users.put(user.id, user);
	user=new User(1003, "bb", "152545", "554412", "sxc@qq.com");
	users.put(user.id,user);
	//遍历HashMap集合的方式（2）
	//取出HashMap中的所有键值对，类型是Set<Entry <Integer,User>>
	Set<Entry<Integer, User>> entrys=users.entrySet();
	for(Entry<Integer, User> entry:entrys){
		System.out.println(entry.getKey()+":"+entry.getValue());
	}
}
}
