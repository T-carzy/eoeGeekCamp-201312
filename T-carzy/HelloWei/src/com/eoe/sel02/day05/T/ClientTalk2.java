package com.eoe.sel02.day05.T;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientTalk2 {
	public static void main(String[] args) {
		BufferedReader br=null;
		PrintWriter pw=null;
		Socket socket=null;
		try {
			socket=new Socket("127.0.0.1",7777);
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw=new PrintWriter(socket.getOutputStream());
			Scanner scanner=new Scanner(System.in);
			while(true){
				String answer=br.readLine();
				System.out.println(answer);
				if(answer.indexOf("88")>=0){
					pw.println("88");
					pw.flush();
					break;
				}
				System.out.println("顾客2：");
				String question=scanner.next();
				pw.println("顾客2："+question);
				pw.flush();
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				if(br!=null){
					br.close();
				}
				if(pw!=null){
					pw.close();
				}
				if(socket!=null){
					socket.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
