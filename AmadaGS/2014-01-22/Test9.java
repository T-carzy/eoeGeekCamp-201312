package com.eoe.sel2.day001;

import java.util.Scanner;

public class Test9 {
	static boolean loop=true;
	private static int i;
	public static void main(String[] args) {
		final Thread t=new Thread(){
			@Override
			public void run() {
				String s="";
				while(loop){
					try {
						Thread.sleep(10000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						for (int i = 0; i < 100000; i++) {
							s+="a";
						}
						System.out.println(i);
						loop=false;
					}
				}
			}
		};
		t.start();
		new Thread(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("请输入一个整数");
				Scanner s=new Scanner(System.in);
				 i=s.nextInt();
				t.interrupt();
		};
	}.start();
}
}
