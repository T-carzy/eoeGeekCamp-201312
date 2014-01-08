package com.eoe.oop.day01;

import java.util.Arrays;

public class Test10 {
	public static void main(String[] args) {
		String strUser="1001:张飞:123456:68557766:zhangfei@sina.com";
		String[] data=strUser.split(":");
		System.out.println(Arrays.toString(data));
		User user=new User();
		user.id=Integer.parseInt(data[0]);
		user.name=data[1];
		user.password=data[2];
		user.phone=data[3];
		user.email=data[4];
		System.out.println("用户编号:"+user.id+" 用户姓名:"+user.name+" 用户密码:"+user.password+" 用户电话:"+user.phone+" 用户邮箱:"+user.email);
	}
}
