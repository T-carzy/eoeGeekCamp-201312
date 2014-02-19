package com.eoe.sel02.day11;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

public class Tset11 {
	static final String BASE_URL="http://localhost:8080/Serdat11/Test";
	static final String FILENAME="eclipse-jee-kepler-SR1-win32-x86_64.zip";
	static final String SRC_PATH="e:/tools/";
	public static void main(String[] args) {
		HttpClient client=new DefaultHttpClient();
		HttpPost post=new HttpPost(BASE_URL);
		ArrayList<BasicNameValuePair> params=new ArrayList<BasicNameValuePair>();
		params.add(new BasicNameValuePair("fileName",FILENAME));
		InputStream in=null;
		try {
			post.setEntity(new UrlEncodedFormEntity(params,"utf-8"));
			HttpResponse response=client.execute(post);
			if(response.getStatusLine().getStatusCode()!=200){
				System.out.println("连接服务器失败");
				return ;
			}
			post.abort();
			in=new FileInputStream(SRC_PATH+FILENAME);
			InputStreamEntity ise=new InputStreamEntity(in,in.available());
			post.setEntity(ise);
			client.execute(post);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(in!=null){
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(client!=null){
					client.getConnectionManager().shutdown();
				}
			}
		}
		
	}
}
