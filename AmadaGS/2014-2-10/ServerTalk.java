package com.eoe.se2.day05.socket5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerTalk {

	public static void main(String[] args) throws IOException {
		ServerSocket server=new ServerSocket(9999);
		int i=1;
		System.out.println("等待客戶訪問：");
		while(true){
			Socket socket=server.accept();
			new Server("客服"+i, socket).start();
			i++;
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
			BufferedReader reader=null;
			PrintWriter writer=null;
				try {
					reader=new BufferedReader(
							new InputStreamReader(socket.getInputStream()));
					writer=new PrintWriter(socket.getOutputStream());
					writer.println("店家：亲，要点儿啥？");
					writer.flush();
					Scanner scanner=new Scanner(System.in);
					String answer="";
					while(true){
						String question=reader.readLine();
						System.out.println(question);
						if(question.indexOf("88")>=0&&"88".equals(answer)){
							writer.println("88");
							writer.flush();
						}
							answer=scanner.next();
							writer.println(this.name+":"+answer);
							writer.flush();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					try {
						if(socket!=null){
							socket.close();
						}
						if(writer!=null){
							writer.close();
						}
						if(reader!=null){
							reader.close();
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
		}
	}
}
