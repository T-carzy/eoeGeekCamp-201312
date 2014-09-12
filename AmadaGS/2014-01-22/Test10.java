package com.eoe.sel2.day001;


public class Test10 {
	static int money=1000;
	public static void main(String[] args) {
		User user1=new User("高神");
		User user2=new User("张飞");
		User user3=new User("王小丫");
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
				System.out.println(getName()+"取出400元");
				money-=400;
				System.out.println("剩余"+money);
			}else{
				System.out.println("余额不足");
			}
		}
	}
}
