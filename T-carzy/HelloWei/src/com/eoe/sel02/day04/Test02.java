package com.eoe.sel02.day04;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

import com.eoe.sel02.day03.User;

public class Test02 {
	public static void main(String[] args) {
		ArrayList<User> users=initUsers();
		File dir=new File("e:/java_test/se2_day04");
		if(!dir.exists()){
			dir.mkdirs();
		}
		File file=new File(dir,"test02.txt");
		PrintStream ps=null;
		try {
			if(!file.exists()){
				file.createNewFile();
			}
			ps=new PrintStream(file);
			for (User user : users) {
				ps.println(user);
			}
			System.out.println("数据保存完毕");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if(ps!=null){
				ps.close();
			}
		}
	}

	private static ArrayList<User> initUsers() {
		ArrayList<User> users=new ArrayList<User>();
		User user=new User(101,"zhangfei","1111", "4545454", "2544");
		users.add(user);
		user=new User(102,"hhangfei","1111","4545454", "2544");
		users.add(user);
		user=new User(103,"whangfei","1111","4545454", "2544");
		users.add(user);
		return users;
	}
}
