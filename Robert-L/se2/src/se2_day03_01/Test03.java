package se2_day03_01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用BufferedInputStream和BufferedOutputStream 实现文件的复制
 * 
 * @author yw
 * 
 */
public class Test03 {
	public static void main(String[] args) {
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			FileInputStream fis = new FileInputStream(
					"e:/java_test/src/spjj.zip");
			bis = new BufferedInputStream(fis);
			FileOutputStream fos = new FileOutputStream(
					"e:/java_test/dest/spjj.zip");
			bos = new BufferedOutputStream(fos);
			byte[] buffer = new byte[1024 * 10];
			int len;
			long start = System.currentTimeMillis();
			while ((len = fis.read(buffer)) != -1) {
				fos.write(buffer, 0, len);
			}
			long end = System.currentTimeMillis();
			System.out.println("cost time=" + (end - start) + "毫秒");
			System.out.println("文件复制完毕");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (bis != null) {
					bis.close();
				}
				if (bos != null) {
					bos.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
