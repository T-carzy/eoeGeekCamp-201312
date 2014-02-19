package com.eoe.sel02.day10;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import com.ityw.entity.User;

public class Test02 {
	static final String BASE_URL = "http://localhost:8080/Serverday10/Test";

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("name=").append("刘亦菲").append("&password=").append("1234");
		HttpURLConnection con = null;
		ObjectInputStream ois = null;
		try {
			byte[] data = sb.toString().getBytes("utf-8");
			URL url = new URL(BASE_URL);
			con = (HttpURLConnection) url.openConnection();
			con.setConnectTimeout(5000);
			con.setReadTimeout(5000);
			con.setRequestMethod("POST");
			con.setDoOutput(true);
			con.setRequestProperty("Content-Length", data.length + "");
			OutputStream out = con.getOutputStream();
			out.write(data);
			if (con.getResponseCode() == 200) {
				ois = new ObjectInputStream(con.getInputStream());
				User user = (User) ois.readObject();
				System.out.println(user);
			} else {
				System.out.println("连接失败");
			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (con != null) {
				con.disconnect();
			}
		}
	}
}
