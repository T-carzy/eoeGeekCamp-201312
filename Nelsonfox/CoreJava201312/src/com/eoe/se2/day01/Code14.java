package com.eoe.se2.day01;

import java.util.Timer;
import java.util.TimerTask;

public class Code14 {
public static void main(String[] args) {
	final Thread t=new Thread("张飞"){
		@Override
		public void run() {
			while(true){
				System.out.println(this.getName()+"z...,Z..");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	};
	t.start();
	final Timer timer=new Timer();
	timer.schedule(new TimerTask() {
		
		@Override
		public void run() {
		t.interrupt();
		timer.cancel();
			
		}
	}, 5*1000);
}
}
