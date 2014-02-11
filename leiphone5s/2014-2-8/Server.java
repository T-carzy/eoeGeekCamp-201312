package se2.day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BufferedReader reader = null;
		PrintWriter writer = null;
		ServerSocket server = null;
		try {
			server = new ServerSocket(10001);
			System.out.println("�ȴ��ͻ�����...");
			Socket socket = server.accept();
			reader = new BufferedReader(new InputStreamReader(
					socket.getInputStream()));
			writer = new PrintWriter(socket.getOutputStream());
			String answer = "";
			while (true) {
				String question = reader.readLine();
				System.out.println("���:" + question);
				System.out.println("��:");
				answer = scanner.next();
				if ("88".equals(answer) && question.indexOf("88") >= 0) {
					writer.println("88");
					writer.flush();
					break;
				}
				writer.println("����" + answer);
				writer.flush();
			}
			System.out.println("���ζԻ�����");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (server != null) {
					server.close();
				}
				if (reader != null) {
					reader.close();
				}
				if (writer != null) {
					writer.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
