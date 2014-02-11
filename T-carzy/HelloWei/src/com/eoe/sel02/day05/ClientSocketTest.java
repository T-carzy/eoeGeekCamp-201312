package com.eoe.sel02.day05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSocketTest {
	public static void main(String[] args) {
		BufferedReader br=null;
		Socket socket=null;
		try {
			socket=new Socket("127.0.0.1", 8888);
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			System.out.println(br.readLine());
			System.out.println(br.readLine());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				if(socket!=null){
					socket.close();
				}
				if(br!=null){
					br.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
