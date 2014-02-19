package com.eoe.sel02.day10;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Test01 {
	private static final String DEST_PAH="http://localhost:8080/Serday09/Test01";
	public static void main(String[] args) {
		HttpURLConnection con=null;
		try {
			URL url=new URL(DEST_PAH);
			con=(HttpURLConnection) url.openConnection();
			con.setConnectTimeout(5000);
			con.setReadTimeout(3000);
			con.setRequestMethod("POST");
			con.setDoInput(true);
			InputStream inputStream = con.getInputStream();
			System.out.println(con.getResponseMessage());
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(con!=null){
			
					con.disconnect();
				
			}
		}
	}
}
