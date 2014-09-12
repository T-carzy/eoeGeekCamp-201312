package com.eoe.sel2.day001;

public class Test06 {
	public static void main(String[] args) throws InterruptedException {
		Singer singer=new Singer();
		Thread wangfei=new Thread(singer,"王菲");
		Thread liuhuan=new Thread(singer,"扣環");
		wangfei.start();
		Thread.sleep(1000);
		liuhuan.start();
		
	}
}
class Singer implements Runnable{
	String[] song={
			"我是一隻小小鳥",
			"想要飛卻非也飛不高",
		
			"我尋尋覓覓一個溫暖的懷抱",
			"這樣的要求算不算高"};
	int index=0;
	@Override
	public void run() {
		while(true){
			System.err.println(Thread.currentThread().getName()
					+":"+song[index++%4]);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}