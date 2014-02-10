package com.eoe.se2.day02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test07 {
	public static void main(String[] args) {
		String path = "E:\\java_test\\se2_day02\\day01";
		File dir = new File(path);
		if (!dir.exists()) {
			System.out.println("路径错误！");
			return;
		}
		File file = new File(dir, "Test01.java");
		if (!file.exists()) {
			System.out.println("文件不存在");
			return;
		}
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			int len;
			byte[] buffer = new byte[1024];
			StringBuffer sb = new StringBuffer();
			while ((len = fis.read(buffer)) != -1) {
				String text = new String(buffer, 0, len);
				sb.append(text);

			}
			System.out.println(sb.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
