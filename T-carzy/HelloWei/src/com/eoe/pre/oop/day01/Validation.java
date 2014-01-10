package com.eoe.pre.oop.day01;
import java.util.Arrays;
public class Validation {

	public static void main(String[] args) {
			String sUser="110;周星驰;123456;9988776655;zhangfei@sina.com";
			String[] data=sUser.split(";");
			System.out.println(Arrays.toString(data));
			User u=new User();
			u.id=Integer.parseInt(data[0]);
			u.name=data[1];
			u.password=data[2];
			u.phone=data[3];
			u.email=data[4];
			System.out.println("用户编号:"+u.id+" 用户姓名:"+u.name+" 用户密码:"+u.password+" 用户电话:"+u.phone+" 用户邮箱:"+u.email);
	}

}
