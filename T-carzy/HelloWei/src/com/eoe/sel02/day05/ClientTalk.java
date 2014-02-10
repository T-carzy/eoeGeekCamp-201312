package com.eoe.sel02.day05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientTalk {
	public static void main(String[] args) {
		BufferedReader br=null;
		PrintStream ps=null;
		try {
			Socket socket=new Socket("127.0.0.1", 9999);
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			ps=new PrintStream(socket.getOutputStream());
			Scanner scanner=new Scanner(System.in);
			while(true){
				System.out.println("客户:");
				String question=scanner.next();
				ps.println("客户："+question);
				String answer=br.readLine();
				System.out.println(answer);
				if(answer.indexOf("88")>=0){
					ps.println("88");
					break;
				}
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
