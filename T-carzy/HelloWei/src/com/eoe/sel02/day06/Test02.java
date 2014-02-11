package com.eoe.sel02.day06;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * 单线程的线程池的创建与使用。
 * 本例演示单线程的线程池，当向该线程池添加多个代表下载
 * 文件的任务时，该线程池将按添加任务的顺序依次执行任务，
 * 即一个下载任务执行完毕，再执行线程池中的下一个下载任务。
 */
public class Test02 {
	public static void main(String[] args) {
		ExecutorService pools = Executors.newSingleThreadExecutor();
		pools.execute(new CopyTask("文件1"));
		pools.execute(new CopyTask("文件2"));
		pools.execute(new CopyTask("文件3"));
		pools.shutdown();
	}
	static class CopyTask implements Runnable{
		String fileName;
		
		public CopyTask(String fileName) {
			super();
			this.fileName = fileName;
		}

		@Override
		public void run() {
			for (int i = 1; i <=5; i++) {
				System.out.println(fileName+"在复制"+i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}
