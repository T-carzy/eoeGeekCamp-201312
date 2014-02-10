package com.eoe.se2.day05.socket4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	/**
	 * @param 最大请求为3，当出现IO阻塞时，最多连接4个客户端请求
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		BufferedReader reader=null;
		PrintWriter writer=null;
		ServerSocket server=null;
		try {
			server=new ServerSocket(10101, 3);
			while(true){
				System.out.println("等待客户访问。。。");
				Socket socket=server.accept();
				reader=new BufferedReader(
						new InputStreamReader(
						socket.getInputStream()));
				writer=new PrintWriter(socket.getOutputStream());
				String question=reader.readLine();
				System.out.println(question);
				//等待鍵盤輸入
				new Scanner(System.in).next();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(writer!=null){
					writer.close();
				}
				if(reader!=null){
					reader.close();
				}
				if(server!=null){
					server.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
