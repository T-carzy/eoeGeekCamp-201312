package com.eoe.sel02.day06;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test04 {
	public static void main(String[] args) {
		ExecutorService pools = Executors.newCachedThreadPool();
		pools.execute(new TalkTask());
		pools.execute(new DownloadTask());
		pools.execute(new ScanVirusTask());
		pools.shutdownNow();
	}
	static class TalkTask implements Runnable{
		@Override
		public void run() {
			while(true){
				System.out.println("聊天...");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

				System.out.println("聊天被曝光...");}
				break;
			}
		}
	}
	static class DownloadTask implements Runnable{
		@Override
		public void run() {
			while(true){
				System.out.println("执行下载任务...");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("下载被窃...");
				}
				break;
			}
		}
	}
	static class ScanVirusTask implements Runnable{
		@Override
		public void run() {
			while(true){
				System.out.println("扫描病毒...");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("程序被病毒杀死...");
					break;
				}
			}
		}
	}
}
