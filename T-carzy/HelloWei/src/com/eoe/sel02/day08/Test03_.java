package com.eoe.sel02.day08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test03_ {
	public static void main(String[] args) {
		User[] users;
		ObjectInputStream ois=null;
		try {
			ois=new ObjectInputStream(new FileInputStream("e:/java_test/se2_day08/user.dat"));
			users=(User[]) ois.readObject();
			for (User user : users) {
				System.out.println(user);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				if(ois!=null){
					ois.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
