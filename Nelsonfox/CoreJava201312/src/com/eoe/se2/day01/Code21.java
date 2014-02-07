package com.eoe.se2.day01;

import java.util.Random;

public class Code21 {
static int[] a=new int[30];
static int index;
public static void main(String[] args) {
	Thread t1=new Thread(){
		@Override
		public void run() {
		while(index<10){
			if(a[index]>0){
				System.out.println(
						Thread.currentThread().getName()+":"+a[index]+":"+index);
				Thread.yield();//让CPU控制权
			}
		}
		}
	};
	t1.start();
	final Random random=new Random();
	Thread t2=new Thread(){
		@Override
		public void run() {
			while(true){
				if(index<a.length){
					a[index]=random.nextInt(100);
					System.out.println(Thread.currentThread().getName()+":"+a[index]+":"+index);
					yield();
					index++;
				}else{
					System.out.println("下标已越界");
				}
			}
		}
	};
	//j将t2设置为后台守护线程
	t2.setDaemon(true);
	t2.start();
}
}
