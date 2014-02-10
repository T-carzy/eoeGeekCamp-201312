package se2.day05.socket4;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ServerSocket server = null;
		Socket socket = null;
		while (true) {
			try {
				server = new ServerSocket(9999, 4);
				System.out.println("等待客户端连接、、、");
				socket = server.accept();
				scanner.next();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					if (socket != null) {
						socket.close();
					}
					if (server != null) {
						server.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

	}
}
