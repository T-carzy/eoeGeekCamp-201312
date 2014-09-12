package Test000;

import java.util.Timer;
import java.util.TimerTask;

public class Test02 {

	public static void main(String[] args) {
		final Thread t=new Thread(){
			@Override
			public void run() {
				System.out.println("∫Ù‡‡∫Ù‡‡°£°£");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					System.out.println("∏√∆¥≤¡À°£°£");
				}
			};
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
