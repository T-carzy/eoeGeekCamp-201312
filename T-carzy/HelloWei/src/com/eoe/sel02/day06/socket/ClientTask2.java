package com.eoe.sel02.day06.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientTask2 {
	public static void main(String[] args) {
		BufferedReader br=null;
		PrintWriter pw=null;
		try {
			Socket socket=new Socket("127.0.0.1", 9999);
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
				System.out.println("客户2：");
				String question=scanner.next();
				pw.println("客户2："+question);
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
