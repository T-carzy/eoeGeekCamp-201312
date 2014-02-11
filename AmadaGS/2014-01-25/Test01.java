package Test000;

import java.util.Scanner;

public class Test01 {
	private static final byte BYTE = 1; // 00001
	private static final byte KB = 2; // 00010
	private static final byte MB = 4; // 00100
	private static final byte GB = 8; // 01000
	private static final byte TB = 16; // 10000

	public static void main(String[] args) {
		System.out.println("请输入一个文件的字节数:");
		long size = new Scanner(System.in).nextLong();
        System.out.println("请输入mode的数");
		int mode = new Scanner(System.in).nextInt();
		System.out.println("file size（文件大小）" + fileSize(size, mode));

		
		
		
		
	}

	private static String fileSize(long size, int mode) {
		String result = null;
		if (mode == (BYTE | KB | MB | GB | TB)) {
			if (size < 1024) {
				return size + "Byte";
			} else if (size < 1 << 20) {
				return size / 1024.0 + "KB";
			} else if (size < 1 << 30) {
				return size / 1024.0 / 1024 + "MB";
			} else if (size < 1 << 40) {
				return size / 1024.0 / 1024 / 1024 + "GB";
			} else {
				return size / 1024.0 / 1024 / 1024 / 1024 + "TB";
			}
		} else if (mode == (BYTE | KB | MB|GB)) {
			if (size < 1024) {
				return size + "Byte";
			} else if (size < 1 << 20) {
				return size / 1024.0 + "KB";
			} else if (size < 1 << 30){
				return size / 1024.0 / 1024 + "MB";
			} else {
				return size / 1024.0 / 1024 / 1024 + "GB";
			}
		} else if (mode == (BYTE | KB | MB)) {
			if (size < 1024) {
				return size + "Byte";
			} else if (size < 1 << 20) {
				return size / 1024.0 + "KB";
			} else {
				return size / 1024.0 / 1024 + "MB";
			}
		} else if (mode == (BYTE | KB)) {
			if (size < 1024) {
				return size + "Byte";
			} else {
				return size / 1024.0 + "KB";
			}
		}else if ((mode & TB) != 0) {
			return size / 1024.0 / 1024 / 1024 /1024+ "TB";
		}else if ((mode & GB) != 0) {
			return size / 1024.0 / 1024 / 1024 + "GB";
		} else if ((mode & MB) != 0) {
			return size / 1024.0 / 1024 + "MB";
		} else if ((mode & KB) != 0) {
			return size / 1024.0 + "kB";
		} else if ((mode & BYTE) != 0) {
			return size + "byte";
		}
		return result;
	}
}
