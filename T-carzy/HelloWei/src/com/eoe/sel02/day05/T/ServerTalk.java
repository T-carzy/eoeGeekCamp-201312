package com.eoe.sel02.day05.T;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerTalk {
	static int i=1;
	public static void main(String[] args) {
		try {
			ServerSocket server=new ServerSocket(7777);
			System.out.println("等待客户端连接");
			while(true){
				Socket socket=server.accept();
				new Server("客服"+i,socket).start();
				i++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	static class Server extends Thread{
		String name;
		Socket socket;
		public Server(String name, Socket socket) {
			this.name = name;
			this.socket = socket;
		}
		@Override
		public void run() {
			BufferedReader br=null;
			PrintWriter pw=null;
			try {
				br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
				pw=new PrintWriter(socket.getOutputStream());
				pw.println("亲，来点啥");
				pw.flush();
				Scanner scanner=new Scanner(System.in);
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
					if(pw!=null){
						pw.close();
					}
				}
			}
		}
		
	}
}
