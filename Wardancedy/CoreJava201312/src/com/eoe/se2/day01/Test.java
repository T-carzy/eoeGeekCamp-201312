package com.eoe.se2.day01;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Test {
	static final int BYTE=1;
	static final int KB=2;
	static final int MB=4;
	static final int GB=8;
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println(fileSize(1024*1024*1024*3.5, BYTE|KB|MB|GB));
	}
	static String fileSize(double size,int mode){
		if(mode== (BYTE | KB | MB |GB)){
			if(size<1<<10){
				return size+"byte";
			}else if(size<1<<20){
				return size/(1<<10)+"kb";
			}else if(size<1<<30){
				return size/(1<<20)+"mb";
			}else{
				return size/(1<<30)+"gb";
			}
		}
		return null;
	}
}
