package com.eoe.sel02.day11;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import com.ityw.entity.User;

public class Test03 {
	static final String BASE_URL="http://localhost:8080/Serday11/Test01";
	public static void main(String[] args) {
		HttpClient client=new DefaultHttpClient();
		StringBuilder sb=new StringBuilder(BASE_URL);
		sb.append("?name=").append("呵呵")
		.append("&id=").append("1110")
		.append("&password=").append("123456")
		.append("&phone=").append("56565656")
		.append("&email=").append("hehe@qq.com");
		HttpGet get=new HttpGet(sb.toString());
		ObjectInputStream ois=null;
		try {
			HttpResponse response=client.execute(get);
			HttpEntity entity=response.getEntity();
			InputStream in=entity.getContent();
			ois=new ObjectInputStream(in);
			User user=(User) ois.readObject();
			System.out.println(user);
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
