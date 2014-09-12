package com.eoe.se2.day03;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.eoe.se2.day03.entity.User;

public class Test12 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		User user;
		ObjectInputStream ois=null;
		FileInputStream fis=null;
		File dir=new File("d:/se2/day03"); 
		if(!dir.exists()){
			System.out.println("文件夹不存在");
			return;
		}
		File file=new File(dir, "test11.dat");
		if(!file.exists()){
			System.out.println("test11.dat不存在");
			return;
		}
		
		try {
			fis=new FileInputStream(file);
			ois=new ObjectInputStream(fis);
			user=(User) ois.readObject();
			System.out.println(user);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
				if(ois!=null){
					ois.close();
				}
		}
	}
}
