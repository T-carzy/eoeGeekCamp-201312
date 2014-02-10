package se2.day05.socket3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientTalk {
	public static void main(String[] args) {
		BufferedReader reader = null;
		PrintStream writer = null;
		try {
			Socket socket = new Socket("127.0.0.1", 9999);
			reader = new BufferedReader(new InputStreamReader(
					socket.getInputStream()));
			writer = new PrintStream(socket.getOutputStream());
			Scanner scanner = new Scanner(System.in);
			while (true) {
				System.out.println("客户：");
				String question = scanner.next();
				writer.println("客户：" + question);
				String answer = reader.readLine();
				System.out.println(answer);
				if (answer.indexOf("88") >= 0) {
					writer.println("88");
					break;
				}
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
