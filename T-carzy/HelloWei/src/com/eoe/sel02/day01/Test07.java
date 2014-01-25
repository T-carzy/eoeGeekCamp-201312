package com.eoe.sel02.day01;

public class Test07 {
	public static void main(String[] args) throws InterruptedException {
			Singer singer=new Singer();
			Thread zhangFei=new Thread(singer, "张飞");
			Thread wangFei=new Thread(singer,"王菲");
			wangFei.start();
			Thread.sleep(1200);
			zhangFei.start();
			Thread.sleep(1100);
}
	static class Singer implements Runnable{
		String [] song={
				"俺是一个小小鸟",
				"想要飞也飞不高",
				"俺寻寻觅觅一个温暖的怀抱",
				"这样的要求会不会太高"
		};
		int index=0;
		@Override
		public void run() {
		while(true){
			System.out.println(Thread.currentThread().getName()+":"+song[index++%4]);
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}	
		}
	}
}
