package com.eoe.sel2.day001;

public class Test06 {
	public static void main(String[] args) throws InterruptedException {
		Singer singer=new Singer();
		Thread wangfei=new Thread(singer,"����");
		Thread liuhuan=new Thread(singer,"�ۭh");
		wangfei.start();
		Thread.sleep(1000);
		liuhuan.start();
		
	}
}
class Singer implements Runnable{
	String[] song={
			"����һ�bСС�B",
			"��Ҫ�w�s��Ҳ�w����",
		
			"�Ҍ���ҒҒһ����ů�đѱ�",
			"�@�ӵ�Ҫ���㲻���"};
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