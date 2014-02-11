package com.eoe.sel2.day001;

public class Test11 {
	static int r=0;
	public static void main(String[] args) throws InterruptedException {
		Thread t=new Thread("t1"){
			@Override
			public void run() {
				for(int i=1;i<=10;i++){
					r++;
				}
			};
		};
		t.start();
		t.join();
		System.out.println("r="+r);
	}
}
