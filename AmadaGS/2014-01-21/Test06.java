package com.eoe.se2.day01;

public class Test06 {
	public static void main(String[] args) {
		new Thread("ס������"){
			@Override
			public void run() {
				for (int i = 0; i <=10; i++) {
					System.out.println(this.getName()+":��˭ѽ��");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			};
		}.start();
		//�����ڶ����̶߳�������ִ��
		new Thread("�����ŷ�"){
			public void run() {
				for (int i = 0; i <=10; i++) {
					System.out.println(getName()+":��ˮ�ܵ�");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			};
		}.start();
	}
	}
