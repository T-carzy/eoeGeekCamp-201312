package com.eoe.pre.day04;

import java.util.Timer;
import java.util.TimerTask;

public class Test07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//����һ���ƻ��������
		final Timer timer=new Timer();
		//��ȡϵͳ��ǰʱ�䣬��λ������
		long start=System.currentTimeMillis();
		final long end=start+1000*10;//60���Ժ��ʱ��
		
		timer.schedule(new TimerTask() {
			long minute,second;
			@Override
			public void run() {
				//����ʣ��ʱ��
				long leftTime=end-System.currentTimeMillis();
				minute=leftTime/1000/60;//�������
				second=leftTime/1000%60;//������
				System.out.println(minute+":"+second);
			}
		}, 0,1000);
		//���õڶ����ƻ�����10���ֹͣ���мƻ�����
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				System.out.println("����!");
				timer.cancel();
			}
		}, 10*1000);
	}

}
