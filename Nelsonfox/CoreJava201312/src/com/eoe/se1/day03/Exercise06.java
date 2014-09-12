package com.eoe.se1.day03;

import java.util.ArrayList;

import com.eoe.pre.day03.entity.User;

public class Exercise06 {

	public Exercise06() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	ArrayList<User> users=new ArrayList<User>();
//	initUser(users);
	printUsers(users);
	User u0=users.get(0);
	User u2=users.get(2);
    if(u0.equals(u2)){
    	System.out.println(users.get(0).name+"与"+users.get(2)+"是同一个注册用户");
    	
    }
//	users.set(0, new User(1001, "张飞", "1234", "68337799", "zf@qq.com"));
	}
private static void printUsers(ArrayList<User> users) {
for(User user:users){
	System.out.println(user);
}

}
//private static void initUser(ArrayList<User> users) {
//users.add(new User(1001, "张飞", "1234", "683375","zf@qq.com"));
//users.add(new User(1002, "王菲", "1234","68337755" , "wf@qq.com"));
//users.add(new User(1003, "李飞", "1234", "682255", "lf@qq.com"));
//users.add(new User(1003, "韩飞", "1234", "682255", "hf@qq.com"));
//users.add(new User(1003, "邓飞", "1234", "682355", "df@qq.com"));
//}
}
