package com.eoe.sel02.day09;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.eoe.sel02.download.Record;

public class Download {
	private static final String BASE_URL="http://127.0.0.1/";
	private static final String DEST_PATH="e:/java_test/";
	private static final String FILENAME="eclipse-jee-kepler-SR1-win32-x86_64.zip";
	private static final String RECORD_FILENAME="record.dat";
	private static int THREAD_COUNT=3;
	private static boolean isContinue=true;
	private static Record[] records;
	private static int BUF_SIZE=1024;
	public static void main(String[] args) {
		final ExecutorService pool = Executors.newFixedThreadPool(THREAD_COUNT+1);
		pool.execute(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("安任意键停止下载");
				new Scanner(System.in).next();
				isContinue=false;
				pool.shutdown();
			}
		});
		if(!readRecord()){
			long fileSize=requestfileSize();
			long blockSize=fileSize/THREAD_COUNT;
			for(int i=0;i<records.length;i++){
				records[i]=new Record();
				records[i].setFileName(FILENAME);
				records[i].setStartPos(i*blockSize);
				records[i].setEndPos((i+1)*blockSize-1);
			}
			records[records.length-1].setEndPos(fileSize-1);
		}
		for(int i=0;i<records.length;i++){
			pool.execute(new DownloadTask(i));
		}
	}
	static boolean readRecord(){
		File file=new File(DEST_PATH+RECORD_FILENAME);
		if(!file.exists()){
			records=new Record[THREAD_COUNT];
			return false;
		}
		ObjectInputStream ois=null;
		try {
			ois=new ObjectInputStream(new FileInputStream(file));
			records=(Record[]) ois.readObject();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(ois!=null){
				try {
					ois.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return true;
		
	}
	static void savaRecord(){
		ObjectOutputStream oos=null;
		try {
			oos=new ObjectOutputStream(new FileOutputStream(DEST_PATH+RECORD_FILENAME));
			oos.writeObject(records);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if(oos!=null){
				try {
					oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	static long requestfileSize(){
		HttpURLConnection con=null;
		try {
			URL url=new URL(BASE_URL+FILENAME);
			con=(HttpURLConnection) url.openConnection();
			con.setConnectTimeout(5000);
			con.setReadTimeout(5000);
			con.setRequestMethod("GET");
			con.setDoInput(true);
			InputStream in=con.getInputStream();
			if(con.getResponseCode()!=200){
				System.out.println(con.getResponseMessage());
				return 0;
			}
			long fileSize=con.getContentLength();
			return fileSize;
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		finally{
			if(con!=null){
				con.disconnect();
			}
		}
		return 0;
	}
	static class DownloadTask implements Runnable{
		int threadi;
		
		public DownloadTask(int threadi) {
			super();
			this.threadi = threadi;
		}

		@Override
		public void run() {
			RandomAccessFile raf=null;
			HttpURLConnection con=null;
			try {
				URL url=new URL(BASE_URL+FILENAME);
				con=(HttpURLConnection) url.openConnection();
				con.setConnectTimeout(5000);
				con.setReadTimeout(5000);
				con.setDoInput(true);
				con.setRequestMethod("GET");
				long start=records[threadi].getStartPos();
				long end=records[threadi].getEndPos();
				con.setRequestProperty("Range","bytes="+start+"-"+end);
				InputStream in=con.getInputStream();
				int responseCode=con.getResponseCode();
				if(responseCode!=200&&responseCode!=206){
					System.out.println(con.getResponseMessage());
					return ;
				}
				raf=new RandomAccessFile(DEST_PATH+FILENAME, "rw");
				raf.seek(start);
				byte[] buffer=new byte[BUF_SIZE];
				int len;
				while(start<end&&isContinue){
					len=in.read(buffer);
					raf.write(buffer, 0, len);
					start+=len;
					records[threadi].setStartPos(start);
				}
				if(isContinue){
					System.out.println("第"+(threadi+1)+"下载完毕");
				}else{
					savaRecord();
				}
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				if(raf!=null){
					try {
						raf.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(con!=null){
						con.disconnect();
					}
					int count=0;
					for (Record record : records) {
						if(record.getStartPos()>=record.getEndPos()){
							count++;
						}
					}
					if(count==THREAD_COUNT){
						System.out.println(FILENAME+"下载完成");
						File file=new File(DEST_PATH+RECORD_FILENAME);
						if(file.exists()){
							file.delete();
						}
					}
				}
			}
		}
	}
}
