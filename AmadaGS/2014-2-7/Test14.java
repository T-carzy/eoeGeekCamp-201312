package com.eoe.se2.day03;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.eoe.se2.day03.entity.User;
import com.eoe.se2.day03.entity.Users;

public class Test14 {

	public static void main(String[] args) {
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		File dir=new File("d:/se2/day03");
		if(!dir.exists()){
			dir.mkdirs();
		}
		File file=new File(dir, "test13.dat");
		try {
			if(!file.exists()){
				file.createNewFile();
			}
			fos=new FileOutputStream(file);
			oos=new ObjectOutputStream(fos);
			ArrayList<User> users=new ArrayList<User>();
			users.add(new User(100, "张飞", "12345"));
			users.add(new User(101, "王菲", "123456"));
			users.add(new User(102, "刘旭阳", "123"));
			Users userList=new Users();
			userList.setUsers(users);
			oos.writeObject(userList);
			System.out.println("集合对象序列化完成!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(oos!=null){
				try {
					oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
			}
		}

	}

}
