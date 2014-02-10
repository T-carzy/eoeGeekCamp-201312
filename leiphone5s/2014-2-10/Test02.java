package se2.day05;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test02 {
	public static void main(String[] args) {
		ExecutorService pools = Executors.newSingleThreadExecutor();
		pools.execute(new CopyTask("�ļ�1"));
		pools.execute(new CopyTask("�ļ�2"));
		pools.execute(new CopyTask("�ļ�3"));
		pools.shutdown();
	}

	static class CopyTask implements Runnable {
		String fileName;

		public CopyTask(String fileName) {
			this.fileName = fileName;
		}

		@Override
		public void run() {
			for (int i = 1; i <= 5; i++)
				System.out.println(fileName + "�ڸ���..." + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
