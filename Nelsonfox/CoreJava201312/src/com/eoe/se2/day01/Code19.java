package com.eoe.se2.day01;

public class Code19 {
public static void main(String[] args) {
	RunnableImp target=new RunnableImp();
	Thread zhangFie=new Thread(target, "张飞");
	Thread wangFie=new Thread(target, "王菲");
	 Thread liuyifei=new Thread(new Runnable() {
		
		@Override
		public void run() {
		for(int i=1;i<=50;i++){
			System.out.println(Thread.currentThread()+":"+i);
		}
			
		}
	},"刘亦菲");
	 zhangFie.start();
	 wangFie.start();
	 liuyifei.start();
}
static class RunnableImp implements Runnable{

	@Override
	public void run() {
for(int i=1;i<=50;i++){
	System.out.println(Thread.currentThread()+":"+i);
}

}
		
	}
	
}