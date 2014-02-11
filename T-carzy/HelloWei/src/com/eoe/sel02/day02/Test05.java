package com.eoe.sel02.day02;

import java.util.Scanner;

public class Test05 {
	static final byte BYTE=1;
	static final byte KB=2;
	static final byte MB=4;
	static final byte GB=8;
	static final int KB_=1<<10;
	static final int MB_=1<<20;
	static final int GB_=1<<30;
	public static void main(String[] args) {
		System.out.println("");
		long size=new Scanner(System.in).nextLong();
		String text=fileSize(size,BYTE|KB|MB|GB);
		System.out.println(text);
	}
	private static String fileSize(long size,int mode) {
		if(mode==(BYTE|KB|MB|GB)){
			if(size<KB_){
				return size+"byte";
			}else if(size<MB_){
				return size*1.0/KB_+"kb";
			}else if(size<GB_){
				return size*1.0/MB_+"mb";
			}else{
				return size*1.0/GB_+"gb";
			}
		}
		if(mode==BYTE){
			return size+"byte";
		}
		if(mode==KB){
			return size*1.0/KB_+"kb";
		}
		if(mode==MB){
			return size*1.0/MB_+"mb";
		}
		if(mode==GB){
			return size*1.0/GB_+"gb";
		}
		return null;
	}
}
