package com.eoe.se2.day01;

import java.util.ArrayList;
import java.util.Scanner;

public class Test14 {
	//代表人物的集合
	static ArrayList<String> tasks=new ArrayList<String>();
	public static void main(String[] args) {
		//负责从集合中取出数据并显示
		final Thread t1=new Thread("t1"){
			String s="";
			@Override
			public void run() {
				while(true){
					try {
						Thread.sleep(1000*60*60);
					} catch (InterruptedException e) {
						while(tasks.size()>0){
							//以下是一个耗时操作，模拟下载的耗时
							for(int i=1;i<=100000;i++){
								s+="a";
							}
							s=tasks.remove(0);
							if("q".equals(s)){
								break;
							}
							System.out.println(s);
						}
					}
					if("q".equals(s)){
						System.out.println("game over！");
						break;
					}
				}
			}
		};
		t1.start();
		final Scanner scanner=new Scanner(System.in);
		Thread t2=new Thread(){
			@Override
			public void run() {
				while(true){
					System.out.println("输入字符串");
					String text=scanner.next();
					//System.out.println(this.getName()+":"+text);
					tasks.add(text);
					t1.interrupt();//唤醒t1线程
				}
			}
		};
		t2.setDaemon(true);
		t2.start();
	}
}
