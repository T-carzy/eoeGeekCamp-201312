package com.eoe.se2.day01;

import java.util.Timer;
import java.util.TimerTask;

public class Test18 {
	public static void main(String[] args) {
		final Thread t=new Thread("’≈∑…"){
			@Override
			public void run() {
				while(true){
					System.out.println(this.getName()+" z...,z..");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						System.out.println("À≠∞—∞≥≥≥–—¿≤£ø");
						break;
					}
				}
			}
		};
		t.start();
		final Timer timer=new Timer();
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				t.interrupt();//ªΩ–—tœﬂ≥Ã
				timer.cancel();
			}
		}, 5*1000);
	}
}
