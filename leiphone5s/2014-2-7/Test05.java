package se2.day03;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			RandomAccessFile raf = new RandomAccessFile(
					"d:/se2/day03/test01.txt", "rw");
			System.out.println("1-��ȡ��һ������");
			System.out.println("2-��ȡ�ڶ�������");
			System.out.println("3-��ȡ����������");
			System.out.println("4-��ȡ���ĸ�����");
			int select = scanner.nextInt();
			switch (select) {
			case 1:
				raf.seek(0);
				System.out.println(raf.read());
				break;
			case 2:
				raf.seek(1);
				System.out.println(raf.readInt());
				break;
			case 3:
				raf.seek(5);
				System.out.println(raf.readUTF());
				break;
			case 4:
				raf.seek(13);
				System.out.println(raf.readChar() + "" + raf.readChar()
						+ raf.readChar());
				break;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
