package com.eoe.sel02.day11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHeader;

import com.eoe.sel02.download.Record;



public class Test10 {
	static final String BASE_URL="http://127.0.0.1/eclipse-jee-kepler-SR1-win32-x86_64.zip";
	static final String FILENAME="eclipse-jee-kepler-SR1-win32-x86_64.zip";
	static final String RECORD_FILENAME="record.dat";
	static final String DEST_PATH="e:/java_test/";
	static boolean isContiue=true;
	static Record[] records;
	static final int THREAD_COUNT=3;
	public static void main(String[] args) {
		final ExecutorService pool = Executors.newFixedThreadPool(THREAD_COUNT);
		pool.execute(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("按任意键停止下载");
				new Scanner(System.in).next();
				isContiue=false;
				pool.shutdown();
			}
		});
		if(!readRecord()){
			requestServer();
		}
		for(int i=0;i<records.length;i++){
			pool.execute(new DownloadTask(i));
		}
	}
	static void saveRecord(){
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
	static boolean readRecord(){
		ObjectInputStream ois=null;
		File file=new File(DEST_PATH+RECORD_FILENAME);
		if(!file.exists()){
			records=new Record[THREAD_COUNT];
			return false;
		}
		try {
			ois=new ObjectInputStream(new FileInputStream(file));
			records=(Record[]) ois.readObject();
			return true;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
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
		return false;
	}
	static void requestServer(){
		HttpClient client=new DefaultHttpClient();
		HttpGet get=new HttpGet(BASE_URL);
		try {
			HttpResponse response=client.execute(get);
			if(response.getStatusLine().getStatusCode()==200){
				long fileSize=response.getEntity().getContentLength();
				long blockSize=fileSize/THREAD_COUNT;
				for(int i=0;i<records.length;i++){
					records[i]=new Record();
					records[i].setStartPos(i*blockSize);
					records[i].setEndPos((i+1)*blockSize);
				}
				records[records.length-1].setEndPos(fileSize-1);
			}
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if(client!=null){
				client.getConnectionManager().shutdown();
			}
		}
	}
	static class DownloadTask implements Runnable{
		int threadi;
		
		public DownloadTask(int threadi) {
			super();
			this.threadi = threadi;
		}

		@Override
		public void run() {
			HttpClient client=new DefaultHttpClient();
			HttpPost post=new HttpPost(BASE_URL);
			Record record=records[threadi];
			long start=record.getStartPos();
			long end=record.getEndPos();
			RandomAccessFile raf=null;
			post.addHeader(new BasicHeader("Range","bytes="+start+"-"+end));
			try {
				HttpResponse response=client.execute(post);
				int code=response.getStatusLine().getStatusCode();
				if(code!=200&&code!=206){
					System.out.println("下载失败");
					return ;
				}
				raf=new RandomAccessFile(DEST_PATH+RECORD_FILENAME,"rw");
				raf.seek(start);
				int len;
				InputStream in=response.getEntity().getContent();
				byte[] buffer=new byte[1024];
				while(start<end&&isContiue){
					len=in.read(buffer);
					raf.write(buffer, 0, len);
					start+=len;
					record.setStartPos(start);
				}
				saveRecord();
			} catch (ClientProtocolException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				if(raf!=null){
					try {
						raf.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if(client!=null){
					client.getConnectionManager().shutdown();
				}
			}
			int count=0;
			for(int i=0;i<records.length;i++){
				if(records[i].getStartPos()>=records[i].getEndPos())
					count++;
			}
			if(count==THREAD_COUNT){
				System.out.println(FILENAME+"下载完成");
				File file=new File(DEST_PATH+RECORD_FILENAME);
				if(file.exists()){
					file.delete();
				}
				System.exit(0);
			}
			
		}
		
	}
	
}
