package com.eoe.se2.day05.socket5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientTallk3 {

	public static void main(String[] args) {
		BufferedReader reader=null;
		PrintWriter writer=null;
		Socket socket=null;
		try {
			socket=new Socket("127.0.0.1", 9999);
			reader=new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			writer= new PrintWriter(socket.getOutputStream());
			Scanner scanner=new Scanner(System.in);
			String question="";
			while(true){
				String answer=reader.readLine();
				System.out.println(answer);
				if(answer.indexOf("88")>=0&&"88".equals(question)){
					writer.println("88");
					writer.flush();
				}else{
					question=scanner.next();
					writer.println("ио╣ш3:"+question);
					writer.flush();
				}
				System.out.println();
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
