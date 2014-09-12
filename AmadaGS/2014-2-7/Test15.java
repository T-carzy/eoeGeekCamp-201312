package com.eoe.se2.day03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.eoe.se2.day03.entity.User;

public class Test15 {

	public static void main(String[] args) {
		User user=new User(100, "高珊", "1");
		ArrayList<User> users=new ArrayList<User>();
		users.add(user);
		user=new User(001, "刘旭阳", "2");
		users.add(user);
		user=new User(002,"周一龙","3");
		users.add(user);
		ObjectOutputStream oos=null;
		try {
			oos=new ObjectOutputStream(
					new FileOutputStream(
				"d:/se2/day03/test13.dat"));
			for(User user2:users){
				oos.writeObject(user2);
			}
			System.out.println("一组对象序列化完毕");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(oos!=null){
					oos.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
