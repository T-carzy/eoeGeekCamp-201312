package com.eoe.oop.day01;

import java.util.Arrays;

public class Test10 {
	public static void main(String[] args) {
		String strUser="1001:�ŷ�:123456:68557766:zhangfei@sina.com";
		String[] data=strUser.split(":");
		System.out.println(Arrays.toString(data));
		User user=new User();
		user.id=Integer.parseInt(data[0]);
		user.name=data[1];
		user.password=data[2];
		user.phone=data[3];
		user.email=data[4];
		System.out.println("�û����:"+user.id+" �û�����:"+user.name+" �û�����:"+user.password+" �û��绰:"+user.phone+" �û�����:"+user.email);
	}
}
