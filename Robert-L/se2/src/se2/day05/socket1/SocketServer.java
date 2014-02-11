package se2.day05.socket1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
	public static void main(String[] args) {
		BufferedReader reader = null;
		try {
			ServerSocket server = new ServerSocket(9999);
			System.out.println("等待客户端连接...");
			Socket socket = server.accept();
			InputStream in = socket.getInputStream();
			reader = new BufferedReader(new InputStreamReader(in));
			String msg = reader.readLine();
			System.out.println(msg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
