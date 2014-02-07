package com.eoe.se2.day03;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.eoe.se2.day03.entity.User;

public class Test13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		User user=new User(100, "¸ßÉº", "123");
		ObjectOutputStream oos=null;
		ByteArrayOutputStream bos=null;
		
		ByteArrayInputStream bis=null;
		ObjectInputStream ois=null;
		
		try {
			bos=new ByteArrayOutputStream();
			oos=new ObjectOutputStream(bos);
			oos.writeObject(user);
			bis =new ByteArrayInputStream(bos.toByteArray());
			ois=new ObjectInputStream(bis);
			User user2=(User) ois.readObject();
			System.out.println("user==user2:"+(user==user2));
			System.out.println(user2);
		} catch (ClassNotFoundException e) {
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
