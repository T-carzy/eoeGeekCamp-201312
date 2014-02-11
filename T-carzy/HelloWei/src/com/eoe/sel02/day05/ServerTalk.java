package com.eoe.sel02.day05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerTalk {
	public static void main(String[] args) {
		BufferedReader br=null;
		PrintStream ps=null;
		try {
			ServerSocket server=new ServerSocket(9999);
			System.out.println("等待客户端连接");
			Socket socket=server.accept();
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			ps=new PrintStream(socket.getOutputStream());
			Scanner scanner=new Scanner(System.in);
			while(true){
				String question=br.readLine();
				System.out.println(question);
				if(question.indexOf("88")>=0){
					ps.println("88");
					break;
				}
				System.out.println("客服：");
				String answer=scanner.next();
				ps.println("客服："+answer);
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
			if(ps!=null){
				ps.close();
			}
		}
	}
}
