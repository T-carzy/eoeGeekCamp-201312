package com.eoe.sel2.day001;


public class Test10 {
	static int money=1000;
	public static void main(String[] args) {
		User user1=new User("����");
		User user2=new User("�ŷ�");
		User user3=new User("��СѾ");
		user1.start();
		user2.start();
		user3.start();
	}
	static class User extends Thread{
		public User(String name) {
		this.setName(name);
		}
		@Override
		public void run() {
			if(money>400){
				System.out.println(getName()+"ȡ��400Ԫ");
				money-=400;
				System.out.println("ʣ��"+money);
			}else{
				System.out.println("����");
			}
		}
	}
}
