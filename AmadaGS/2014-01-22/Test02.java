package com.eoe.sel2.day001;

import com.eoe.oop.day3.Person;

public class Test02 {
	public static void main(String[] args) {
		PersonThread zhangfei=new PersonThread("’≈∑…");
		PersonThread wangfei=new PersonThread("Õı∑∆");
		PersonThread liuyifei=new PersonThread("¡ı“‡∑∆");
		zhangfei.setPriority(Thread.MAX_PRIORITY);
		wangfei.setPriority(Thread.MIN_PRIORITY);
		liuyifei.setPriority(6);
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
			for (int i = 0; i <=10; i++) {
				System.out.println(getName()+":"+i);
				Thread.yield();
			}
		}
	}
}
