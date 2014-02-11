package Test000;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Test04 {
	static int count=60;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Timer timer=new Timer();
		long startTime=System.currentTimeMillis();
		final long endTime=startTime+10*1000;
		Date date=new Date(endTime);
		
		timer.schedule(new TimerTask(){
			long minute;
			long second;
			public void run() {
				long leftTime=endTime-System.currentTimeMillis();
				minute=leftTime/1000/60;
				second=leftTime/1000%60;
			System.out.println(minute+"fen"+second+"Ãë");	
			}
		}, 0,1000);
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				System.out.println("»ð¼ý·¢Éä");
				timer.cancel();
				
			}
		}, date);
	}
}
