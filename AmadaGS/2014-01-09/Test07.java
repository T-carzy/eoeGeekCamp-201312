package com.eoe.Oop;

import java.util.Arrays;

public class Test07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String strUser="1001:�ŷ�:123456:68557766:zhangfei@sina.com";
		String[] data=strUser.split(":");
		System.out.println(Arrays.toString(data));
		User user=new User();
		user.id=Integer.parseInt(data[0]);
		user.name=data[1];
		user.pwd=data[2];
		user.phone=data[3];
		user.email=data[4];
		System.out.println("�û���ţ�"+user.id);
		System.out.println("�û�����:"+data[1]);
		System.out.println("�û�����:"+data[2]);
		System.out.println("�û��绰:"+data[3]);
		System.out.println("�û�����:"+data[4]);
	}

}
