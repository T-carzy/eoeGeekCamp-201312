package com.eoe.sel02.day12;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

import com.ityw.entity.User;




public class Test03 {
	static final String DEST_PATH="e:/java_test/se2_day12/";
	static final String FILENAME="users3.xml";
	public static void main(String[] args) {
		ArrayList<User> users=initUsers();
		PrintWriter pw=null;
		try {
			XmlPullParserFactory factory=XmlPullParserFactory.newInstance();
			XmlSerializer serializer=factory.newSerializer();
			pw=new PrintWriter(DEST_PATH+FILENAME);
			serializer.setOutput(pw);
			serializer.startDocument("utf-8", null);
			serializer.text("\n");
			serializer.startTag(null, "users");
			for (User user : users) {
				serializer.text("\n  ");
				serializer.startTag(null, "user");
				serializer.attribute(null, "id", user.getId()+"");
				serializer.text("\n  ");
				serializer.startTag(null, "name");
				serializer.text(user.getName());
				serializer.endTag(null, "name");
				serializer.text("\n  ");
				serializer.startTag(null, "password");
				serializer.text(user.getPassword());
				serializer.endTag(null, "password");
				serializer.text("\n  ");
				serializer.startTag(null, "phone");
				serializer.text(user.getPhone());
				serializer.endTag(null, "phone");
				serializer.text("\n  ");
				serializer.startTag(null, "email");
				serializer.text(user.getEmail());
				serializer.endTag(null, "email");
				serializer.text("\n");
				serializer.endTag(null, "user");
			}
			serializer.endTag(null, "users");
			serializer.endDocument();
			System.out.println(FILENAME+"生成完毕");
		} catch (XmlPullParserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(pw!=null){
				pw.close();
			}
		}
		
	}
	private static ArrayList<User> initUsers() {
		ArrayList<User> list=new ArrayList<User>();
		User user=new User(1111, "王二", "123456", "11111111", "we@qq.com");
		list.add(user);
		user=new User(2222, "梁二", "123456", "22222222", "le@qq.com");
		list.add(user);
		user=new User(3333, "张二", "123456", "33333333", "ze@qq.com");
		list.add(user);
		user=new User(4444, "李二", "123456", "44444444", "le@qq.com");
		list.add(user);
		user=new User(5555, "赵二", "123456", "55555555", "ze@qq.com");
		list.add(user);
		user=new User(6666, "黄二", "123456", "66666666", "he@qq.com");
		list.add(user);
		return list;
	}
}
