package com.eoe.sel02.day08;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;

/*
 * 从HFS服务端下载user.txt文件，以对象序列化的方式保存至本地磁盘。
 */
public class Test03 {
	public static void main(String[] args) {
		User[] users=new User[0];
		ObjectOutputStream oos=null;
		BufferedReader br=null;
		try {
			URL url=new URL("http://127.0.0.1:80/user.txt");
			URLConnection connection = url.openConnection();
			InputStream in=connection.getInputStream();
			oos=new ObjectOutputStream(new FileOutputStream("e:/java_test/se2_day08/user.dat"));
			br=new BufferedReader(new InputStreamReader(in,"gbk"));
			String line;
			while((line=br.readLine())!=null){
					User user=parse(line);
					users=Arrays.copyOf(users, users.length+1);
					users[users.length-1]=user;
			
			}
			oos.writeObject(users);
			System.out.println("下载完成");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(br!=null){
					br.close();
				}
				if(oos!=null){
					oos.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	private static User parse(String line){
		String[] data=line.split(":");
		User user=new User();
		user.setId(Integer.parseInt(data[0]));
		user.setName(data[1]);
		user.setPassword(data[2]);
		user.setPhone(data[3]);
		user.setEmail(data[4]);
		return user;
	}
}
