package com.eoe.sel2.day001;

public class Test03 {
	public static void main(String[] args) {
		new UserThread("住户韩伟","你谁呀？").start();
		new UserThread("工人多多","修水管的").start();
	}
	static class UserThread extends Thread{
		String action;
		public UserThread(String name,String action) {
			this.setName(name);
			this.action=action;
		}
		@Override
		public void run() {
			for (int i = 0; i <=10; i++) {
				System.out.println(getName()+":"+action);
				Thread.yield();
			}
		}
	}
}
