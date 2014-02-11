package com.eoe.sel2.day001;

public class Test04 {
	public static void main(String[] args) {
		new Thread("住户张三"){
			@Override
			public void run() {
			for (int i = 1; i <10; i++) {
				System.out.println(this.getName()+":你谁呀？"+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			}
		}.start();
		//创建第二个对象
		new Thread("高珊"){
		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.println(this.getName()+":送快递的！"+i);
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
