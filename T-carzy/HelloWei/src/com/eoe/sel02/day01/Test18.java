package com.eoe.sel02.day01;

import java.util.Timer;
import java.util.TimerTask;

public class Test18 {
	public static void main(String[] args) {
		final Thread t=new Thread("张飞"){
			@Override
			public void run() {
				while(true){
					System.out.println(this.getName()+"z...Z...");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						System.out.println("是谁打扰我休息");
						break;
					}
				}
			}
		};
		t.start();
		final Timer timer=new Timer();
		timer.schedule(new TimerTask(){
			@Override
			public void run() {
				t.interrupt();
				timer.cancel();
			}
		}, 1000*5);
	}
}
