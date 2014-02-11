package com.eoe.sel02.day06.Download.T;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.eoe.sel02.day06.Download.FileInfo;

public class DownloadServer {
	static final String SRC_PATH="e:/tools/";
	public static void main(String[] args) {
		ExecutorService pool = Executors.newCachedThreadPool();
		try {
			ServerSocket server=new ServerSocket(9999);
			System.out.println("等待客户连接...");
			while(true){
				Socket socket = server.accept();
				pool.execute(new DownloadTask(socket));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	static class DownloadTask implements Runnable{
		Socket socket;
		
		public DownloadTask(Socket socket) {
			super();
			this.socket = socket;
		}

		@Override
		public void run() {
			ObjectInputStream ois=null;
			RandomAccessFile raf=null;
			try {
				ois=new ObjectInputStream(socket.getInputStream());
				FileInfo info=(FileInfo) ois.readObject();
				raf=new RandomAccessFile(SRC_PATH+info.getFileName(),"r");
				OutputStream out=socket.getOutputStream();
				int len;
				byte[] buffer=new byte[1024];
				raf.seek(info.getPosition());
				while((len=raf.read(buffer))!=-1){
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
					if(ois!=null){
						ois.close();
					}
					if(raf!=null){
						raf.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}
}
