package com.eoe.se2.day01;

public class Test07 {
	public static void main(String[] args) throws InterruptedException {
		Singer singer=new Singer();
		Thread zhangFei=new Thread(singer, "�ŷ�");
		Thread wangFei=new Thread(singer, "����");
		wangFei.start();
		Thread.sleep(900);
		zhangFei.start();
	}
	//����һ�����񣬹�����߳�ִ��
	static class Singer implements Runnable{
		String[] song={
			"����һ��СС��",
			"��Ҫ��Ҳ�ɲ���",
			"��ѰѰ����һ����ů�Ļ���",
			"������Ҫ��᲻��̫��"
		};
		int index=0;
		@Override
		public void run() {
			while(true){
				System.out.println(
					Thread.currentThread().getName()+
					":"+song[index++%4]);
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
