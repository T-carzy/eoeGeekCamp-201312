package com.eoe.httpclient;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class HttpClientGetDownLoad {
	static String url="http://localhost:8080/ServletGetandPost/";
	static String fileName="office2003.rar";
public static void main(String[] args) {
	HttpClient client=new DefaultHttpClient();
	HttpGet get=new HttpGet(url+fileName);
	FileOutputStream fos=null;
	try {
		HttpResponse response=client.execute(get);
		HttpEntity entity=response.getEntity();
		//获取服务端文件长度
		long lenth=entity.getContentLength();
		InputStream in=entity.getContent();
		int len;
		byte[] buf=new byte[1024];
		File file_path=new File("d:/学习/");
		if(!file_path.exists()){
			file_path.mkdirs();
		}
		 long l=0;
		File file=new File(file_path, fileName);
		fos=new FileOutputStream(file);
		System.out.println("开始下载  文件长度为"+lenth/1024/1024.0+"M");
		while((len=in.read(buf))!=-1){
			l=file.length();
			fos.write(buf, 0, len);
			if(l%1024==0){
				System.out.println((Math.round((l*1.0/lenth))*100)/100);
			}
		}
		System.out.println("下载成功");
	} catch (ClientProtocolException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
