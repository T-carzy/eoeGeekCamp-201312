package com.eoe.sel02.day00;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Test01 {
	static final String ADDRESS="http://127.0.0.1:80/user.txt";
	public static void main(String[] args) {
		InputStream in=null;
		BufferedReader br=null;
		try {
			URL url=new URL(ADDRESS);
			URLConnection connection = url.openConnection();
			in=connection.getInputStream();
			br=new BufferedReader(new InputStreamReader(in,"gbk"));
			String line;
			while((line=br.readLine())!=null){
				System.out.println(line);
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		finally{
			if(br!=null){
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
