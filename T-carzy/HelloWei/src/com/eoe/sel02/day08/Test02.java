package com.eoe.sel02.day08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Test02 {
	public static void main(String[] args) {
		PrintWriter pw=null;
		BufferedReader br=null;
		try {
			URL url=new URL("http://127.0.0.1:80/user.txt");
			URLConnection connection = url.openConnection();
			InputStream in=connection.getInputStream();
			br=new BufferedReader(new InputStreamReader(in,"gbk"));
			pw=new PrintWriter("e:/java_test/se2_day08/user.txt");
			String line;
			while((line=br.readLine())!=null){
				System.out.println(line);
				pw.println(line);
				pw.flush();
			}
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
				if(pw!=null){
					pw.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
