package com.eoe.se2.day03;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.eoe.se2.day03.entity.User;

public class Test11 {

	/**
	 * @param将对象序列化并保存至d:/se2/day03/test11.dat文件中
	 */
	public static void main(String[] args) {
		ObjectOutputStream oos=null;
		FileOutputStream fos=null;
		File dir=new File("d:/se2/day03");
		if(!dir.exists()){
			dir.mkdirs();
		}
		File file=new File(dir,"test11.dat");
		try {
			if(!file.exists()){
				file.createNewFile();
			}
			User user=new User(1001, "张飞", "12345");
			fos=new FileOutputStream(file);
			oos=new ObjectOutputStream(fos);
			oos.writeObject(user);
			System.out.println("write user success!");
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
