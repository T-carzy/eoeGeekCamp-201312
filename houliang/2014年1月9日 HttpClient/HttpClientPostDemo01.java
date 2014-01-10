package com.eoe.httpclient;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import com.eoe.entity.vo.User;

public class HttpClientPostDemo01 {
	private static String STR_URL="http://localhost:8080/ServletGetandPost/ServletLoginDemo";
	private static String ENCODING="UTF-8";
	public static void main(String[] args) {
		//创建对象client
		HttpClient client=new DefaultHttpClient();
		//创建post请求方式
		HttpPost post=new HttpPost(STR_URL);
		//以键值对的方式封装要请求的数据
		NameValuePair param=(NameValuePair) new BasicNameValuePair("name", "张飞");
		//创建请求数据键值对的集合
		ArrayList<NameValuePair> params=new ArrayList<NameValuePair>();
		params.add(param);
		param=new BasicNameValuePair("password", "1234");
		params.add(param);
		ObjectInputStream ois=null;
		HttpEntity entity=null;
		try {
			//封装表单实体
			UrlEncodedFormEntity rqEntity=new UrlEncodedFormEntity(params,HTTP.UTF_8);
			//讲请实体对象封装到Post
			post.setEntity(rqEntity);
			//向服务器发送请求
			HttpResponse response=client.execute(post);
			//获取响应状态码
			int code=response.getStatusLine().getStatusCode();
			if(code==HttpStatus.SC_OK){
				//获取服务端响应实体
				entity=response.getEntity();
				//实体中获取输入流
				InputStream in=entity.getContent();
				ois=new ObjectInputStream(in);
				User user=(User) ois.readObject();
				System.out.println(user);
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
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
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
