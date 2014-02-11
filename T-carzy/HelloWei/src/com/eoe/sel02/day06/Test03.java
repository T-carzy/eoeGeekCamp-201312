package com.eoe.sel02.day06;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * 带缓存的线程池的创建与使用.
 * 本例演示带缓存的线程池，当向该线程池添加多个代表下载
 * 文件的任务时，该线程池将并发运行这些下载任务。
 */
public class Test03 {
	public static void main(String[] args) {
		ExecutorService pools = Executors.newCachedThreadPool();
		pools.execute(new DownloadTask("文件1"));
		pools.execute(new DownloadTask("文件2"));
		pools.execute(new DownloadTask("文件3"));
		pools.shutdown();

	}
	static class DownloadTask implements Runnable{
		String fileName;

		public DownloadTask(String fileName) {
			super();
			this.fileName = fileName;
		}
		@Override
		public void run() {
			for(int i=1;i<=5;i++){
				System.out.println(fileName+"在下载..."+i);
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
