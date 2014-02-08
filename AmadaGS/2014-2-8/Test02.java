package com.eoe.se2.day04;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

import com.eoe.se1.day02.entity.User;

public class Test02 {

	static ArrayList<User> users=new ArrayList<User>();
	public static void main(String[] args) {
		initUsers();
		File dir=new File("d:/se1/day04");
		File file=new File(dir,"test03.dat");
		PrintStream out=null;
		try {
			out=new PrintStream(file);
			for (User user : users) {
				out.println(user);
			}
			System.out.println("write success!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(out!=null){
				out.close();
			}
		}
	}
	 static void initUsers() {
		users.add(new User(100, "èàÔw", 'ƒ–', 32));
		users.add(new User(102, "Õı∑∆", '≈Æ', 43));
		users.add(new User(1003, "Ñ¢“‡∑∆", '≈Æ', 30));
	}
	 static class User{
		 private int id;
		 private String name;
		 private char sex;
		 private int age;
		public User(int id, String name, char sex, int age) {
			super();
			this.id = id;
			this.name = name;
			this.sex = sex;
			this.age = age;
		}
		@Override
		public String toString() {
			return "User [id=" + id + ", name=" + name + ", sex=" + sex
					+ ", age=" + age + "]";
		}
	 } 
  }

