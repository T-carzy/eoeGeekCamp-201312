package com.eoe.sel02.day01;

public class Test02 {
	public static void main(String[] args) {
		MyThread t=new MyThread("嗷嗷嗷");
		t.start();
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
static class MyThread extends Thread{
	public MyThread() {

	}
	public MyThread(String name){
		this.setName(name);
	}
	@Override
	public void run() {
	for (int i = 1; i <= 10; i++) {
		System.out.println(this.getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	}
}
}
