package com.eoe.se2.day01;
public class Test05 {
	public static void main(String[] args) {
		Test05 t=new Test05();
		
		t.new UserThread("ס������","����˭��?").start();
		t.new UserThread("��������", "��ˮ�ܵ�").start();
	}
	class UserThread extends Thread{
		String action;
		public UserThread(String name,String action){
			this.setName(name);
			this.action=action;
	}
		@Override
		public void run() {
			for (int i = 0; i <=50; i++) {
				System.out.println(getName()+":"+action);
				Thread.yield();
			}
		}
	}
}
