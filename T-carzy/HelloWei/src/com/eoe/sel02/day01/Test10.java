package com.eoe.sel02.day01;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
			final Thread zhangFei=new Thread(){
				@Override
				public void run() {
					while(true){
						System.out.println("zzZZ...");
						try {
							Thread.sleep(1000*10);
						} catch (InterruptedException e) {
						System.out.println("不睡觉吵什么吵！");
						break;
						}
						
					}
				}
			};
			zhangFei.start();
			new Thread(){
				@Override
				public void run() {
					System.out.println("输入任意一个字符或数字");
					new Scanner(System.in).next();
					zhangFei.interrupt();
				};
			}.start();
}
}
