package com.eoe.sel02.day05;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerTest {
	public static void main(String[] args) {
		try {
			ServerSocket server=new ServerSocket(8888);
			System.out.println("等待客户端连接");
			Socket socket=server.accept();
			PrintWriter pw=new PrintWriter(socket.getOutputStream());
			pw.println("发送第一行文本\t发送第二行文本");
			pw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
