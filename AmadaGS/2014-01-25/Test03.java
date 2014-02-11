package Test000;

import java.util.Timer;
import java.util.TimerTask;

public class Test03 {

	static int second=60;
	public static void main(String[] args) {
		final Timer timer=new Timer();
		timer.schedule(new TimerTask(){
			@Override
			public void run() {
				System.out.println(second--);
			}
		}, 0,1000);
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				System.out.println("»ð¼ý·¢Éä");
				timer.cancel();
			}
		}, 1000*10);
	}
}
