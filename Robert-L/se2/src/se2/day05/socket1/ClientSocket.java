package se2.day05.socket1;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSocket {
	public static void main(String[] args) {
		Socket socket = null;
		PrintStream printStream = null;
		try {
			socket = new Socket("127.0.0.1", 9999);
			OutputStream out = socket.getOutputStream();
			printStream = new PrintStream(out);
			printStream.println("嗨，俺来了！");
			System.out.println("客户端");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (socket != null) {
				try {
					socket.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (printStream != null) {
				printStream.close();
			}
		}

	}
}
