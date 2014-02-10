package com.eoe.sel02.day06.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerTalk {
	static int i=1;
	public static void main(String[] args) {
		ExecutorService pools = Executors.newCachedThreadPool();
		try {
			ServerSocket server=new ServerSocket(9999);
			System.out.println(" 等待客户端连接...");
			while(true){
				Socket socket = server.accept();
				pools.execute(new Server(socket, "客服"+i));
				i++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	static class Server implements Runnable{
		Socket socket;
		String name;
		public Server(Socket socket, String name) {
			super();
			this.socket = socket;
			this.name = name;
		}
		@Override
		public void run() {
			BufferedReader br=null;
			PrintWriter pw=null;
			try {
				br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
				pw=new PrintWriter(socket.getOutputStream());
				Scanner scanner=new Scanner(System.in);
				pw.println("亲，要点啥");
				pw.flush();
				while(true){
					String question=br.readLine();
					System.out.println(question);
					if(question.indexOf("88")>=0){
						pw.println("88");
						pw.flush();
						i--;
						break;
					}
					System.out.println(name+":");
					String answer=scanner.next();
					pw.println(name+":"+answer);
					pw.flush();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				if(br!=null){
					try {
						br.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if(pw!=null){
					pw.close();
				}
			}
		}
	}
}
