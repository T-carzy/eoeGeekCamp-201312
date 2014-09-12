package com.eoe.se2.day01;

public class Code18 {
public static void main(String[] args) {
	MyThread zhangfei=new MyThread("张飞");
	MyThread wangfei=new MyThread("王菲");
	zhangfei.start();
	wangfei.start();
}
static class MyThread extends Thread{
	public MyThread(String name){
		setName(name);
	}
	@Override
	public void run() {
	for(int i=1;i<=10;i++){
		System.out.println(this.getName()+":"+i);
		yield();
	}
	}
}
}
