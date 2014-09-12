package se2_day04_01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Test03 {
	public static void main(String[] args) {
		File dir = new File("E:/java_test/se2_day04");
		if (!dir.exists()) {
			dir.mkdirs();
		}
		PrintWriter writer = null;
		try {
			File file = new File(dir, "test03.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			writer = new PrintWriter(file);
			writer.println("嗨，大家好！");
			System.out.println("复制完毕！");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (writer != null) {
				writer.close();
			}
		}

	}
}
