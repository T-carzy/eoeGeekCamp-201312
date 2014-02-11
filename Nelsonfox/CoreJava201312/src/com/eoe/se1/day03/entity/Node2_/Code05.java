package com.eoe.se1.day03.entity.Node2_;

import com.eoe.pre.day03.entity.User;

public class Code05 {

	public Code05() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList_<User> users=new ArrayList_<User>();
        users.add(new User(1001, "a", "653", "699785", "er@qq.com"));
        users.add(new User(1002, "b", "523", "699785", "er@qq.com"));
        users.add(new User(1003, "c", "143", "699785", "er@qq.com"));
        users.add(new User(1004, "d", "423", "699785", "er@qq.com"));
        for(int i=0;i<users.size();i++){
        	System.out.println(users.get(i));
        }
	}

}
