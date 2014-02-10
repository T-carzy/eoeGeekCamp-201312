package com.eoe.sel02.day03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;




public class Test10 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		createUsers();
	}                               

	 static void createUsers() throws FileNotFoundException, IOException {
		 ArrayList<User> users=new ArrayList<User>();
		 users.add(new User(110,"大飞","111111", "13111111111", "df@.com"));
		 users.add(new User(111,"二飞","222222", "12111111111", "ef@.com"));
		 users.add(new User(112,"三飞","222222", "11111111111", "sf@.com"));
		 ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("e:/java_test/day03.dat"));
		 for (User user : users) {
			oos.writeObject(user);
		}
		 oos.close();

	}

}
