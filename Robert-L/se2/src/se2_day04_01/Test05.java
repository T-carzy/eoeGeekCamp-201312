package se2_day04_01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;

public class Test05 {
	private static final String SRC_PATH = "F:/java_test/src";
	private static final String DEST_PATH = "F:/java_test/dest";
	private static final String FILE_NAME = "spjj.zip";
	static final String RECORD_FILE_NAME = "record.txt";

	enum Action {
		REDAY, DOWNING, STOP
	}

	static Action action;// 表示下载状态的枚举变量;

	public static void main(String[] args) {
		action = Action.REDAY;// 表示准备下载
		final DownloadTask downloadTask = new DownloadTask();
		downloadTask.start();
		Thread ctrlThread = new Thread() {
			@Override
			public void run() {
				Scanner scanner = new Scanner(System.in);
				while (true) {
					System.out.println("1-开始下载\t2-停止下载");
					int select = scanner.nextInt();
					action = Action.values()[select];
					synchronized (downloadTask) {
						downloadTask.notify();
					}
				}

			}
		};
		ctrlThread.setDaemon(true);
		ctrlThread.start();
	}

	static class DownloadTask extends Thread {
		@Override
		public void run() {
			if (action == Action.REDAY) {
				synchronized (this) {
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			}
			action = Action.DOWNING;
			// 从记录文件中读取上次保存的断点位置
			long pos = readLocation();
			RandomAccessFile srcRaf = null;
			RandomAccessFile destRaf = null;
			try {
				srcRaf = new RandomAccessFile(SRC_PATH + FILE_NAME, "r");
				destRaf = new RandomAccessFile(DEST_PATH + FILE_NAME, "rw");
				srcRaf.seek(pos);
				destRaf.seek(pos);
				byte[] buffer = new byte[1024];
				int len;
				while ((len = srcRaf.read(buffer)) != -1
						&& action == Action.DOWNING) {
					destRaf.write(buffer, 0, len);
					pos += len;
				}
				if (action == Action.DOWNING) {// 若是正常下载完毕
					pos = 0;
					savelocation(pos);// 将记录断点的位置设置为0
					System.out.println("文件下载完毕");
				} else {
					System.out.println("下载被终止");
					savelocation(pos);// 若不终止下载，保存断点
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	// 保存断点位置
	private static void savelocation(long pos) {
		DataOutputStream dos = null;
		File file = new File(RECORD_FILE_NAME);
		try {
			dos = new DataOutputStream(new FileOutputStream(file));
			dos.writeLong(pos);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (dos != null) {
				try {
					dos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	// 从记录文件中读取上次保存的断点位置
	private static long readLocation() {
		long pos = 0;
		DataOutputStream dos = null;
		DataInputStream dis = null;
		File file = new File(SRC_PATH, RECORD_FILE_NAME);
		try {
			if (!file.exists()) {
				file.createNewFile();
				dos = new DataOutputStream(new FileOutputStream(file));
				dos.writeLong(0);

			} else {
				dis = new DataInputStream(new FileInputStream(file));
				pos = dis.readLong();

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (dos != null) {
					dos.close();
				}
				if (dis != null) {
					dis.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return pos;
	}
}
