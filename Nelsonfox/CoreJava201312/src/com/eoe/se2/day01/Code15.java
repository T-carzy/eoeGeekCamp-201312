package com.eoe.se2.day01;





public class Code15 {
public static void main(String[] args) {
	MyThread t=new MyThread();
	t.start();
	for(int i = 1;i<=50;i++){
		System.out.println("main Thread:"+i);
	}
}
static class MyThread extends Thread{
	@Override
	public void run() {
	for(int i=1;i<=50;i++){
		System.out.println("MyThread:"+i);
	}
	}
}
}
