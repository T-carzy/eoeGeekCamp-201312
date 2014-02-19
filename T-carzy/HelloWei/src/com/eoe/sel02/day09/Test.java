package com.eoe.sel02.day09;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Test {
	public static void main(String[] args) {
		try {
			URL url=new URL("http://127.0.0.1:8080/Test_/Test01");
			HttpURLConnection conn=(HttpURLConnection) url.openConnection();
			InputStream in = conn.getInputStream();
			if(conn.getResponseCode()==200){
				System.out.println("ok");
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
