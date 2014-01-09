package com.eoe.httpclient;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import org.apache.http.HttpEntity;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import com.eoe.entity.vo.User;

public class HttpClientGetDemo01 {
	private static String str_url = "http://localhost:8080/ServletGetandPost/ServletLoginDemo";
	private static String ENCODING = "UTF-8";

	public static void main(String[] args) {
		//创建httpclient对象
		HttpClient client = new DefaultHttpClient();
		StringBuilder url=new StringBuilder(str_url);
		ObjectInputStream ois=null;
		try {
			url.append("?name=").append(URLEncoder.encode("张飞",ENCODING));
			url.append("&password=1234");
			//创建get请求方式的对象
			HttpGet get=new HttpGet(url.toString());
			//连接服务端响应的内容封装在response 中
			HttpResponse response=client.execute(get);
			//获得响应实体。实体类型为httpentity
			HttpEntity entity=response.getEntity();
			//或得实体中封装的输入流
			InputStream in=entity.getContent();
			ois=new ObjectInputStream(in);
			User user=(User) ois.readObject();
			System.out.println(user);
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
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if(ois!=null){
				try {
					ois.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
