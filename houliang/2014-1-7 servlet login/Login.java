package com.eoe.login;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.Buffer;

public class Login implements Serializable{
	private static final long serialVersionUID = 1L;
	private static String ENCODING = "UTF-8";
	private static String url = "http://localhost:8080/ServletGetandPost/ServletLoginDemo";
	
	public static void main(String[] args) {
		StringBuilder strurl=new StringBuilder(url);
		HttpURLConnection connection=null;
		
		try {
			strurl.append("?name=").append(URLEncoder.encode("张飞",ENCODING));
			strurl.append("&password=").append(1234);
			URL url=new URL(strurl.toString());
			connection=(HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setReadTimeout(3000);
			InputStream in=connection.getInputStream();
			ObjectInputStream ois=new ObjectInputStream(in);
			User user=(User) ois.readObject();
			System.out.println(user);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(connection!=null){
				connection.disconnect();
			}
		}
	}
}
