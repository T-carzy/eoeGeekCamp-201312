package se2.day04;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class Test02 {
	public static void main(String[] args) {
		PrintStream output = new PrintStream(System.out);
		output.println("��");
		File dir = new File("d:/se2/day03");
		if (!dir.exists()) {
			dir.exists();
		}
		File file = new File(dir, "test01.txt");
		try {
			if (!file.exists()) {
				file.createNewFile();
			}
			output = new PrintStream(file);
			Map<String, Object> in = new HashMap<String, Object>();
			in.put("�ŷ�", 28);
			in.put("����", 30);
			in.put("���", 29);
			output.print(in);
			System.out.println("���ݲ����ɹ���");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (output != null) {
				output.close();
			}
		}
	}
}
