package com.eoe.se1.day04;

import java.util.HashMap;
import java.util.Set;

import com.eoe.oop.day01.User;

public class Test06 {
	public static void main(String[] args) {
		HashMap<Integer, User> users=new HashMap<Integer, User>();
		User user=new User(1001, "aa", "1234", "68337799", "zs@qq.com");
		users.put(user.id, user);
		user=new User(1002, "b", "1234", "68337799", "lisi@qq.com");
		users.put(user.id, user);
		user=new User(1003, "c", "1234", "68337799", "wangwu@qq.com");
		users.put(user.id, user);
		//����HashMap���ϵķ�ʽ(1)
		//ȡ�����м��ļ���
		Set<Integer> keys=users.keySet();
		//�������ļ��ϣ�ȡ��HashMap�е�ֵ
		for(Integer key:keys){
			User u=users.get(key);
			System.out.println(u);
		}
	}
}
