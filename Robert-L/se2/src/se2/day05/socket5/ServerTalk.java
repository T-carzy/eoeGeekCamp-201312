package se2.day05.socket5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/*
 * 多线程实现服务端和客户端1对多的聊天功能。
 */
public class ServerTalk {
	static int i = 1;

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(9999);
			System.out.println("等待客户端连接、、、");
			while (true) {
				Socket socket = server.accept();
				new Server("客服" + i, socket).start();
				i++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 自定义线程类，完成与一个客户端的聊天
	static class Server extends Thread {
		String name;
		Socket socket;

		public Server(String name, Socket socket) {
			super();
			this.name = name;
			this.socket = socket;
		}

		@Override
		public void run() {
			BufferedReader reader = null;
			PrintWriter writer = null;
			try {
				reader = new BufferedReader(new InputStreamReader(
						socket.getInputStream()));
				writer = new PrintWriter(socket.getOutputStream());
				writer.println("亲 ，来点啥？");
				writer.flush();
				Scanner scanner = new Scanner(System.in);
				while (true) {
					// 接收客户端发送的聊天信息
					String question = reader.readLine();
					System.out.println(question);
					if (question.indexOf("88") >= 0) {
						writer.println("88");
						writer.flush();
						i--;
						break;
					}
					System.out.println(name + ":");
					String answer = scanner.next();
					writer.println(name + ":" + answer);
					writer.flush();

				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					if (reader != null) {
						reader.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (writer != null) {
					writer.close();
				}
			}

		}

	}
}
