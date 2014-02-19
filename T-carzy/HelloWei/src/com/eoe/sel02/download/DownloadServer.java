package com.eoe.sel02.download;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DownloadServer {
	private static final String SRC_PATH = "e:/tools/";
	private static final int PORT = 9999;

	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(Runtime
				.getRuntime().availableProcessors() * 50);
		try {
			ServerSocket server = new ServerSocket(PORT);
			System.out.println("等待客户端发送下载的文件名");
			while (true) {
				Socket socket = server.accept();
				Record record = responseClient(socket);
				if (record != null) {
					pool.execute(new DownloadTask(socket, record));
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static class DownloadTask implements Runnable {
		Socket socket;
		Record record;
		final int BUF_SIZE = 10 * 1024;

		public DownloadTask(Socket socket, Record record) {
			super();
			this.socket = socket;
			this.record = record;
		}

		@Override
		public void run() {
			RandomAccessFile raf = null;
			try {
				OutputStream out = socket.getOutputStream();
				raf = new RandomAccessFile(SRC_PATH + record.getFileName(), "r");
				long start = record.getStartPos();
				long end = record.getEndPos();
				raf.seek(start);
				byte[] buffer = new byte[BUF_SIZE];
				int len;
				while ((len = raf.read(buffer)) != -1 && start < end) {
					out.write(buffer, 0, len);
					start += len;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				if (raf != null) {
					try {
						raf.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}

	}

	/*
	 * 响应客户端发送的请求，请求分两种： 1.获取文件名。responseClient返回null
	 * 2.请求下载。responseClient返回客户端发送的record对象
	 */
	private static Record responseClient(Socket socket) throws IOException,
			ClassNotFoundException {
		ObjectInputStream ois = null;
		ois = new ObjectInputStream(socket.getInputStream());
		RecordInfo info = (RecordInfo) ois.readObject();
		if ("download".equals(info.getRequestType())) {
			return info.getRecord();
		}
		if ("filename".equals(info.getRequestType())) {
			FileInputStream fis = new FileInputStream(SRC_PATH
					+ info.getRecord().getFileName());
			int fileSize = fis.available();
			info.setFileSize(fileSize);
			ObjectOutputStream oos = new ObjectOutputStream(
					socket.getOutputStream());
			oos.writeObject(info);
		}
		return null;
	}
}
