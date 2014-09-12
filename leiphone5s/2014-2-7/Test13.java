package se2.day03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import se2.day03.entity.User;

public class Test13 {
	public static void main(String[] args) {
		User user = new User(1001, "�ŷ�", "����");
		ArrayList<User> users = new ArrayList<User>();
		users.add(user);
		user = new User(1002, "����", "123456");
		users.add(user);
		user = new User(1003, "�����", "1234569");
		users.add(user);
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream(
					"d:/se2/day03/test08.txt"));
			for (User user2 : users) {
				oos.writeObject(user2);
			}
			System.out.println("һ��������л����");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (oos != null) {
					oos.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
