package com.eoe.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpCookie;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URLEncoder;
import java.net.URL;
public class DoGet {
static final String ENCODING="UTF-8";
static final String URL="http://localhost:8080/MyServlet";
public static void main(String[] args) {
	StringBuilder strUrl=new StringBuilder(URL);
	try {
		strUrl.append("?name=").append(URLEncoder.encode("张飞",ENCODING));
		strUrl.append("age=").append(35);
		URL url=new URL(strUrl.toString());
		HttpURLConnection connection=(HttpURLConnection) url.openConnection();
		connection.setConnectTimeout(2000);
		connection.setRequestMethod("GET");
		if(connection.getResponseCode()!=200){
			System.out.println("connection fail");
		}
		InputStream in=connection.getInputStream();
		byte[] data=new byte[1024];
		in.read(data);
		String response=new String(data,ENCODING);
		System.out.println("服务端相应的数据："+response);
	} catch (UnsupportedEncodingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
}
}
