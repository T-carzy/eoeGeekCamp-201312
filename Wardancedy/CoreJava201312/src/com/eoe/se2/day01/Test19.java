package com.eoe.se2.day01;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Test19 {
	public static void main(String[] args) {
		final Timer timer=new Timer();
		//��ȡϵͳ��ǰʱ��
		long startTime=System.currentTimeMillis();
		final long endTime=startTime+1000*10;
		//����һ����ʱ���ƻ�����
		timer.schedule(new TimerTask() {
			long minute;
			long second;
			@Override
			public void run() {
				//��ȡʣ��ʱ��
				long leftTime=endTime-System.currentTimeMillis();
				minute=leftTime/1000/60;
				second=leftTime/1000%60;
				System.out.println(minute+":"+second);
			}
		}, 0,1000);
		Date endDate=new Date(endTime);
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				timer.cancel();
				System.out.println("����ʱ�䵽!");
			}
		},endDate);
	}
}
