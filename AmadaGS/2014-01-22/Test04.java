package com.eoe.sel2.day001;

public class Test04 {
	public static void main(String[] args) {
		new Thread("ס������"){
			@Override
			public void run() {
			for (int i = 1; i <10; i++) {
				System.out.println(this.getName()+":��˭ѽ��"+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			}
		}.start();
		//�����ڶ�������
		new Thread("��ɺ"){
		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.println(this.getName()+":�Ϳ�ݵģ�"+i);
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
