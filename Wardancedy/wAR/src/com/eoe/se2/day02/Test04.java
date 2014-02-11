package com.eoe.se2.day02;

import javax.xml.transform.ErrorListener;

public class Test04 {
	private static final byte BYTE = 1;
	private static final byte KB = 2;
	private static final byte MB = 4;
	private static final byte GB = 8;

	public static void main(String[] args) {
		double size = 512;
		System.out.println("file size=" + filesSize(size, BYTE | KB | MB));
		size = 10 * 1024;
		System.out.println("file size=" + filesSize(size, BYTE | KB | MB));
		size = 1024 * 1024 * 5;
		System.out.println("file size=" + filesSize(size, BYTE | KB | MB));
		size = 1024.0 * 1024 * 1024 * 5;
		System.out.println("file size=" + filesSize(size, BYTE | KB | MB));
		size = 1024.0 * 1024 * 1024 * 5;
		System.out.println("file size=" + filesSize(size, GB));
	}

	static String filesSize(double size, int mode) {
		String result = null;
		if (mode == (BYTE | KB | MB | GB)) {
			if (size < 1024) {
				return size + "Byte";
			} else if (size < 1024 * 1024) {
				return size / 1024 + "KB";
			} else if (size < 1024 * 1024 * 1024) {
				return size / 1024.0 / 1024 + "MB";

			} else {
				return size / 1024.0 / 1024 / 1024 + "GB";
			}
		} else if (mode == (BYTE | KB | MB)) {
			if (size < 1024) {
				return size + "Byte";
			} else if (size < 1024 * 1024) {
				return size / 1024 + "KB";
			} else {
				return size / 1024 / 1024 + "MB";
			}
		} else if (mode == (BYTE | KB)) {
			if (size < 1024) {
				return size + "Byte";
			} else {
				return size / 1024 + "KB";
			}
		} else if ((mode & GB) != 0) {
			return size / 1024 / 1024 / 1024 + "GB";
		} else if ((mode & MB) != 0) {
			return size / 1024 / 1024 + "MB";

		} else if ((mode & KB) != 0) {
			return size / 1024 + "KB";
		} else if ((mode & BYTE) != 0) {
			return size + "Byte";
		}
		return result;
	}
}
