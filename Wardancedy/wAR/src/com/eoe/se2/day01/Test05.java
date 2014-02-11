package com.eoe.se2.day01;

public class Test05 {
public static void main(String[] args) throws InterruptedException {
	Thread zhugeliang=new Thread(){
		public void run() {
			try {
				Thread.sleep(1000*10);
				System.out.println("我是个直男");
			} catch (InterruptedException e) {
				System.out.println("我不是个直男");
			}
		}	
		};
		zhugeliang.start();
		Thread.sleep(2000);
		zhugeliang.interrupt();//唤醒线程

}
}
