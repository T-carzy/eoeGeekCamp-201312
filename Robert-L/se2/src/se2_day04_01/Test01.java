package se2_day04_01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class Test01 {
	public static void main(String[] args) {
		PrintStream out = new PrintStream(System.out);
		out.println('中' + "\t" + 100);
		out.close();
		try {
			File dir = new File("E:/java_test/se2_day04");
			if (!dir.exists()) {
				dir.mkdirs();
			}
			File file = new File(dir, "text01.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			out = new PrintStream(file);
			out.println('中');
			out.println(100);
			Map<String, Object> person = new HashMap<String, Object>();
			person.put("name", "张飞");
			person.put("sex", '男');
			person.put("age", 33);
			out.println(person);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
