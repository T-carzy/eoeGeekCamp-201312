package com.eoe.se2.day01;

public class Code20 {
public static void main(String[] args) throws InterruptedException {
	Singer singer=new Singer();
	Thread zhangfei=new Thread(singer,"张飞");
	Thread wangfei=new Thread(singer,"王菲");
	wangfei.start();
	Thread.sleep(1000);
	zhangfei.start();
}
static class Singer implements Runnable{
	String[] song={
			"我是一只小小鸟",
			"想要飞却也飞不高",
			"我寻寻觅觅一个温暖的怀抱",
			"这样的要求会不会太高",
	};
int index=0;
	@Override
	public void run() {
		while(true){
			System.out.println(
					Thread.currentThread().getName()+":"+song[index++%4]);
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