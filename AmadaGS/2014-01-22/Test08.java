package com.eoe.sel2.day001;

public class Test08 {
	public static void main(String[] args) throws InterruptedException {
		Thread zhangfei=new Thread("�ŷ�"){
			@Override
			public void run() {
				System.out.println(getName()+"˯���ˣ����ࡣ��");
				try {
					Thread.sleep(1000*70);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					System.out.println("˭���ҳ����ˣ�");
				}
			};
		};
		zhangfei.start();
		Thread.sleep(1000*2);
		zhangfei.interrupt();
	}
}
