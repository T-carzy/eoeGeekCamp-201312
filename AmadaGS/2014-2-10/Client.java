package com.eoe.se2.day05.socket4;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Socket socket=null;
		PrintStream writer=null;
		for (int i = 0; i < 100; i++) {
		try {
				Socket socket=new Socket("127.0.0.1", 10101);
				writer=new PrintStream(
					   socket.getOutputStream());
				writer.println("connect(i)="+i);
				writer.flush();
				System.out.println("i="+i);
				Thread.sleep(10);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(writer!=null){
				writer.close();
			}
//			try {
////				if(socket!=null){
////					socket.close();
////				}
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
	}
}

