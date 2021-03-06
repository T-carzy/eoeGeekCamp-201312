package com.eoe.sel02.day06.Download;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class DownloadClient {
	private static final String DEST_PATH="e:/java_test/";
	private static final String FILENAME="eclipse-jee-kepler-SR1-win32-x86_64.zip/";
	public static void main(String[] args) {
		ObjectOutputStream oos=null;
		FileOutputStream fos=null;
		Socket socket=null;
		try {
			socket=new Socket("127.0.0.1", 9999);
			oos=new ObjectOutputStream(socket.getOutputStream());
			FileInfo info=new FileInfo(FILENAME, 0);
			oos.writeObject(info);
			fos=new FileOutputStream(DEST_PATH+FILENAME);
			byte [] buffer=new byte[1024];
			int len;
			InputStream in=socket.getInputStream();
			System.out.println(FILENAME+"开始下载");
			while((len=in.read(buffer))!=-1){
				fos.write(buffer, 0, len);
			}
			System.out.println(FILENAME+"下载结束");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				if(socket!=null){
					socket.close();
				}
				if(fos!=null){
					fos.close();
				}
				if(oos!=null){
					oos.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
