package com.eoe.se2.day01;

public class Test10 {
	public static void main(String[] args) throws InterruptedException {
		Singer singer=new Singer();
		Thread wangfei=new Thread(singer, "����");
		Thread zhangfei=new Thread(singer, "�ŷ�");
		wangfei.start();
		Thread.sleep(1000);
		zhangfei.start();
	}
	static class Singer implements Runnable{
		String[] song ={
			"����һֻСС��",
			"��Ҫ��ȴ�ɲ���",
			"��ѰѰ������Ҫһ����ů�Ļ���",
			"������Ҫ��᲻���"};
		int index=0;
		@Override
		public void run() {
			while(true){
				System.out.println(Thread.currentThread().getName()+":"+
		song[index++%4]);
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
