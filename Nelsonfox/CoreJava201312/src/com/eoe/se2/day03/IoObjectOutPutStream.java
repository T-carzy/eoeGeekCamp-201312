package com.eoe.se2.day03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.eoe.se2.day03.entity.User;

public class IoObjectOutPutStream {
public static void main(String[] args) {
	 User user=new User(1001,"张飞","123456");
	 ObjectOutputStream oos=null;
	 try {
		oos=new ObjectOutputStream(new 
				 FileOutputStream("d:/se2/day03/user.dat"));
		 oos.writeObject(user);
		 System.out.println("user对象序列化完毕");
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
