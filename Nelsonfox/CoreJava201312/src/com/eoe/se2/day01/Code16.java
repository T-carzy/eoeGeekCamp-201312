package com.eoe.se2.day01;



public class Code16 {
public static void main(String[] args) {
	MyThread t=new MyThread("梁文峰");
	t.start();
	for(int i=1;i<=10;i++){
		System.out.println(Thread.currentThread().getName()+":"+"z...Z...");
	}
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
class MyThread extends Thread{
	public MyThread() {
		// TODO Auto-generated constructor stub
	}
	public MyThread(String name){
		this.setName(name);
	}
	@Override
	public void run() {
	for(int i=1;i<=10;i++){
		System.out.println(this.getName()+"z..Z...");
	}
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}