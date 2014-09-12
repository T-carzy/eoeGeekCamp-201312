package com.eoe.se2.day01;

public class Test04 {
	public static void main(String[] args) {
		PersonThread zhangfei=new PersonThread("’≈∑…");
		PersonThread wangfei=new PersonThread("Õı∑∆");
		PersonThread liuyifei=new PersonThread("¡ı“‡∑∆");
		zhangfei.setPriority(Thread.MAX_PRIORITY);
		liuyifei.setPriority(Thread.MIN_PRIORITY);
		wangfei.setPriority(5);
		zhangfei.start();
		wangfei.start();
		liuyifei.start();
				
	}
	static class PersonThread extends Thread{
		public PersonThread(String name) {
			super.setName(name);
		}
		@Override
		public void run() {
			for (int i = 1; i <=10; i++) {
				System.out.println(this.getName()+":"+i);
				Thread.yield();
			}
		}
	}
}
