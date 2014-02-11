package com.eoe.sel02.day06.Download0;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.eoe.sel02.day06.Download.FileInfo;

public class DownloadServer {
	private static final String SRC_PATH = "e:/tools/";

	public static void main(String[] args) {
		ExecutorService pool = Executors.newCachedThreadPool();
		try {
			ServerSocket server=new ServerSocket(9999);
			System.out.println("等待客户端连接。。。");
			while(true){
				Socket socket=server.accept();
				pool.execute(new DownloadTask(socket));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	static class DownloadTask implements Runnable {
		Socket socket;

		public DownloadTask(Socket socket) {
			super();
			this.socket = socket;
		}

		@Override
		public void run() {
			FileInputStream fis = null;
			ObjectInputStream ois = null;
			try {
				OutputStream out = socket.getOutputStream();
				ois = new ObjectInputStream(socket.getInputStream());
				FileInfo info = (FileInfo) ois.readObject();
				fis=new FileInputStream(SRC_PATH+info.getFileName());
				byte[] buffer=new byte[1024];
				int len;
				System.out.println(info.getFileName()+"开始下载");
				while((len=fis.read(buffer))!=-1){
					out.write(buffer, 0, len);
				}
				System.out.println(info.getFileName()+"下载完成");
			} catch (IOException | ClassNotFoundException e) {
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
}
