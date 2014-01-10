package com.eoe.httpclient;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

public class HttpClientGetDemo03 {
	private static String encoding = "utf-8";

	public static void main(String[] args) {
		System.out.println("请输入号码");
		String number = new Scanner(System.in).next();
		String str_url = "http://www.showji.com/search.htm?m=" + number;
		HttpClient client = new DefaultHttpClient();
		HttpGet get = null;
		get = new HttpGet(str_url);
		try {
			HttpResponse response = client.execute(get);
			HttpEntity entity = response.getEntity();
//			String msg =  EntityUtils.toString(entity,encoding);
			InputStream in=entity.getContent();
			byte[] buf=new byte[256];
			int len;
			while((len=in.read(buf))!=-1){
			String m=new String(buf, 0, len);
			System.out.print(m);
			}
//			while((len=in.read(buf))!=-1){
//				String m=new String(buf, 0, len);
//				System.out.println(m);
//			}
//			System.out.println(msg);

		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
