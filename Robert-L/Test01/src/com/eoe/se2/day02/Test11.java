package com.eoe.se2.day02;

import java.util.Scanner;

/*
 * 通过位运算计算文件大小，按指定格式返回任意单位的字
 * 节数。
 */
public class Test11 {
	static final byte BYTE = 1;
	static final byte KB = 2;
	static final byte MB = 4;
	static final byte GB = 8;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入的文件大小（单位：字节）");
		long size = scanner.nextLong();
		String text = fileSize(size, BYTE | KB | MB | GB);
		System.out.println(text);

	}

	static String fileSize(long size, int mode) {
		if(mode==(BYTE | KB | MB | GB)){
			if(size<1024){
				return size+"btye";
			}else if(size<1<<20){
				return Math.round(size*1.0/(1<<10)*100000)/100000.0+"kb";
			}else if(size<1<<30){
				return Math.round(size*1.0/(1<<20)*100000)/100000.0+"mb";
			}else{
				return Math.round(size*1.0/(1<<30)*100000)/100000.0+"gb";
			}
		}
		if(mode==BYTE){
			return size+"btye";
		} 
		if(mode==KB){
			return  Math.round(size*1.0/(1<<10)*100000)/100000.0+"kb";
		} 
		if(mode==MB){
			return  Math.round(size*1.0/(1<<20)*100000)/100000.0+"kb";
		}
		if(mode==GB){
			return  Math.round(size*1.0/(1<<30)*100000)/100000.0+"kb";
		}
		return null;
	}
}
