package com.eoe.se2.day05.socket4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	/**
	 * @param �������Ϊ3��������IO����ʱ���������4���ͻ�������
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		BufferedReader reader=null;
		PrintWriter writer=null;
		ServerSocket server=null;
		try {
			server=new ServerSocket(10101, 3);
			while(true){
				System.out.println("�ȴ��ͻ����ʡ�����");
				Socket socket=server.accept();
				reader=new BufferedReader(
						new InputStreamReader(
						socket.getInputStream()));
				writer=new PrintWriter(socket.getOutputStream());
				String question=reader.readLine();
				System.out.println(question);
				//�ȴ��I�Pݔ��
				new Scanner(System.in).next();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(writer!=null){
					writer.close();
				}
				if(reader!=null){
					reader.close();
				}
				if(server!=null){
					server.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
