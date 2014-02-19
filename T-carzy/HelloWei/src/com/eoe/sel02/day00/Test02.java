package com.eoe.sel02.day00;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Test02 {
	static final String ADDRESS="http://127.0.0.1:80/user.txt";
	static final String DEST_PATH="e:/java_test/se2_day00";
	static final String DEST_FILENAME="user.txt";
	public static void main(String[] args) {
		BufferedReader br=null;
		InputStream in=null;
		PrintWriter pw=null;
		URL url;
		try {
			url = new URL(ADDRESS);
			URLConnection connection = url.openConnection();
			in=connection.getInputStream();
			br=new BufferedReader(new InputStreamReader(in,"gbk"));
			File dir=new File(DEST_PATH);
			if(!dir.exists()){
				dir.mkdirs();
			}
			File file=new File(DEST_PATH,DEST_FILENAME);
			if(!file.exists()){
				file.createNewFile();
			}
			pw=new PrintWriter(new FileOutputStream(file));
			String line;
			while((line=br.readLine())!=null){
				pw.println(line);
				pw.flush();
			}
			System.out.println("下载完毕");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if(pw!=null){
				pw.close();
			}
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
