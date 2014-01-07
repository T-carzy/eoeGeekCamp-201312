package com.eoe.entity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * 本来用来读取user.txt 以hashmap<String , User> 保存一组用户数据 此方法被Servlet调用
 * 
 * @author Administrator
 * 
 */
public class InitUsers {
	public static HashMap<String, User> initUsers(InputStream in) {
		BufferedReader reader = null;
		HashMap<String, User> users = new HashMap<String, User>();
		reader = new BufferedReader(new InputStreamReader(in));
		String line = "";
		try {
			while ((line = reader.readLine()) != null) {
				User user = parseUser(line);
				users.put(user.getName(), user);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return users;

	}

	private static User parseUser(String line) {
		User user = new User();
		String[] data = line.split(":");
		user.setId(Integer.parseInt(data[0]));
		user.setName(data[1]);
		user.setPassword(data[2]);
		user.setPhone(data[3]);
		user.setEmail(data[4]);

		return user;
	}
}
