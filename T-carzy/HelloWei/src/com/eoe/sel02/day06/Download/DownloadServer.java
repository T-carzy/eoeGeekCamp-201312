package com.eoe.sel02.day06.Download;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 下载的服务端
 * @author yw
 *
 */
public class DownloadServer {
	private static final String SRC_PATH="e:/tools/";
	public static void main(String[] args) {
		ObjectInputStream ois=null;
		FileInputStream fis=null;
		Socket socket=null;
		try {
			System.out.println("等待客户端连接...");
			ServerSocket server=new ServerSocket(9999);
			socket = server.accept();
			ois=new ObjectInputStream(socket.getInputStream());
			FileInfo info=(FileInfo) ois.readObject();
			fis=new FileInputStream(SRC_PATH+info.getFileName());
			OutputStream out=socket.getOutputStream();
			byte[] buffer=new byte[1024];
			int len;
			while((len=fis.read(buffer))!=-1){
				out.write(buffer, 0, len);
			}
		} catch (ClassNotFoundException e) {
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
				if(fis!=null){
					fis.close();
				}
				if(ois!=null){
					ois.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
}
