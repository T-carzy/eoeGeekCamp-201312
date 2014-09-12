package se2.day05.socket3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerTalk {
	public static void main(String[] args) {
		BufferedReader reader = null;
		PrintWriter writer = null;
		try {
			ServerSocket server = new ServerSocket(9999);
			System.out.println("等待客户端连接、、、");
			Socket socket = server.accept();
			reader = new BufferedReader(new InputStreamReader(
					socket.getInputStream()));
			writer = new PrintWriter(socket.getOutputStream());
			Scanner scanner = new Scanner(System.in);
			// 开始聊天
			while (true) {
				// 获取客户端发送的聊天文本
				String question = reader.readLine();
				// 显示在控制台
				System.out.println(question);
				if (question.indexOf("88") >= 0) {
					writer.println("88");
					break;
				}
				System.out.println("客服：");
				// 键盘输入服务端的聊天信息
				String answer = scanner.next();
				writer.println("客服：" + answer);

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
