package com.eoe.sel02.day11;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class Test08 {
	static final String BASE_URL="http://127.0.0.1/eclipse-jee-kepler-SR1-win32-x86_64.zip";
	static final String FILENAME="eclipse-jee-kepler-SR1-win32-x86_64.zip";
	public static void main(String[] args) {
		HttpClient client=new DefaultHttpClient();
		HttpGet get=new HttpGet(BASE_URL);
		FileOutputStream fos=null;
		try {
			HttpResponse response=client.execute(get);
			if(response.getStatusLine().getStatusCode()==200){
				fos=new FileOutputStream("e:/java_test/"+FILENAME);
				InputStream in=response.getEntity().getContent();
				byte[] buffer=new byte[10*1024];
				int len;
				System.out.println(FILENAME+"开始下载");
				while((len=in.read(buffer))!=-1){
					fos.write(buffer, 0, len);
				}
				System.out.println(FILENAME+"下载完成");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if(fos!=null){
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(client!=null){
				client.getConnectionManager().shutdown();
			}
		}
	}
}
