package com.eoe.sel2.day001;

import java.util.Random;

public class Test07 {
	static int index;
	static int[] a=new int[30];
	public static void main(String[] args) {
		new Thread("前台线程"){
			@Override
			public void run() {
				while(index<10){
					if(a[index]>0){
						System.out.println(this.getName()+":"
								+a[index]+":"+index);
						yield();
					}
				}
			}
		}.start();
		Thread daemonThread=new Thread("後臺守護線程"){
			@Override
			public void run() {
				while(true){
					if(index<a.length){
					a[index]=new Random().nextInt(100)+1;
					System.out.println(this.getName()+a[index]+":"+index);
					index++;
					yield();
					}
			}
		};
	};
	daemonThread.setDaemon(true);
	daemonThread.start();
	}
}
