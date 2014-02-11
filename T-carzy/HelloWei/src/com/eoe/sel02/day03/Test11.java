package com.eoe.sel02.day03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;



public class Test11 {
	public static void main(String[] args) {
		ArrayList<User> users=new ArrayList<User>();
		ObjectInputStream ois=null;
		try {
			ois=new ObjectInputStream(new FileInputStream("e:/java_test/day03.dat"));
			User user;
			while((user=(User) ois.readObject())!=null){
				users.add(user);
			}
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if(ois!=null){
				try {
					ois.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
