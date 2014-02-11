package com.eoe.sel02.day01;

public class Test06 {
	public static void main(String[] args) {
		RunnableImp target=new RunnableImp();
		Thread zhangFei=new Thread(target,"张飞");
		Thread wangFei=new Thread(target, "王菲");
		Thread liuYiFei=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 1; i <50; i++) {
					System.out.println(Thread.currentThread()+":"+i);
				}				
			}
		},"刘亦菲");
		zhangFei.start();
		wangFei.start();
		liuYiFei.start();
	}
	static class RunnableImp implements Runnable{

		@Override
		public void run() {
				for (int i = 1; i < 50; i++) {
					System.out.println(Thread.currentThread()+":"+i);
				}
		}
		
	}

}
