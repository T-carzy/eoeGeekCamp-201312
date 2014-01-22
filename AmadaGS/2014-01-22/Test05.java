package com.eoe.sel2.day001;

public class Test05 {
	public static void main(String[] args) {
		new Thread(new RunnableImp()).start();
		new Thread(new Runnable(){

			@Override
			public void run() {
				for (int i = 0; i <10; i++) {
					System.out.println("new Runnable:"+i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
			
		}).start();
	}
}
 class RunnableImp implements Runnable{

		@Override
		public void run() {
			for(int i=1;i<10;i++){
				System.out.println("RunnableImp:"+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
 }
		
