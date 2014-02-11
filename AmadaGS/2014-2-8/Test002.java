package com.eoe.se2.day04;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

import com.eoe.se2.day04.Test02.User;

public class Test002 {

	public static void main(String[] args) {
		ArrayList<User> users=initUser();
		File dir=new File("d:/se2/day04");
		if(!dir.exists()){
			dir.mkdirs();
		}
		File file=new File(dir,"test04.txt");
		PrintStream out=null;
		try {
			if(!file.exists()){
				file.createNewFile();
			}
			out=new PrintStream(file);
			for (User user : users) {
				out.println(user);
			}
			System.out.println("”µ“þ±£´æÍê®…");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(out!=null){
				out.close();
			}
		}
	}

	 static ArrayList<User> initUser() {
		ArrayList<User> users=new ArrayList<User>();
		User user=new User(1001, "ÕÅ·É", 'ÄÐ', 32);
		users.add(user);
		 user=new User(1002, "Íø·É", 'ÄÐ', 22);
		users.add(user);
		 user=new User(1003, "Àî·É", 'ÄÐ', 42);
		users.add(user);
		return users;
	}

}
