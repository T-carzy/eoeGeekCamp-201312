package com.eoe.sel02.day11;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

public class Test04 {
	private static final String STR_URL="http://localhost:8080/Serverday10/Test";
	public static void main(String[] args) {
		ArrayList<BasicNameValuePair> params=new ArrayList<BasicNameValuePair>();
		params.add(new BasicNameValuePair("id", "1111"));
		params.add(new BasicNameValuePair("name", "乌鸦"));
		params.add(new BasicNameValuePair("password","54250"));
		params.add(new BasicNameValuePair("phone","11223344"));
		params.add(new BasicNameValuePair("email","wy@qq.com"));
		HttpClient client=new DefaultHttpClient();
		HttpUriRequest request=new HttpPost(STR_URL);
		try {
			UrlEncodedFormEntity reqEntity=new UrlEncodedFormEntity(params,HTTP.UTF_8);
			((HttpPost)request).setEntity(reqEntity);
			HttpResponse response=client.execute(request);
			if(response.getStatusLine().getStatusCode()==200){
				HttpEntity entity=response.getEntity();
				String message=EntityUtils.toString(entity,"UTF-8");
				System.out.println(message);
			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
