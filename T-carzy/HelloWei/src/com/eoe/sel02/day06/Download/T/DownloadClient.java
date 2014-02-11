package com.eoe.sel02.day06.Download.T;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


import com.eoe.sel02.day06.Download.FileInfo;

public class DownloadClient {
	static final String DEST_PATH="e:/java_test/";
	static final String FILENAME="eclipse-jee-kepler-SR1-win32-x86_64.zip";
	static final String RECORD_FILENAME="eclipse-jee-kepler-SR1-win32-x86_64_record.dat";
	static boolean isContinue=true;
	public static void main(String[] args) {
		new Thread(){
			@Override
			public void run() {
				System.out.println("按任意键停止下载");
				new Scanner(System.in).next();
				isContinue=false;
			}
		}.start();
		RandomAccessFile raf=null;
		ObjectOutputStream oos=null;
		Socket socket=null;
		try {
			socket=new Socket("127.0.0.1", 9999);
			InputStream in=socket.getInputStream();
			oos=new ObjectOutputStream(socket.getOutputStream());
			long position=readPosition();
			FileInfo info=new FileInfo(FILENAME, position);
			oos.writeObject(info);
			raf=new RandomAccessFile(DEST_PATH+FILENAME, "rw");
			raf.seek(position);
			int len;
			byte[] buffer=new byte[1024];
			System.out.println(info.getFileName()+"开始下载");
			while((len=in.read(buffer))!=-1&&isContinue){
				raf.write(buffer,0,len);
				position+=len;
			}
			position=isContinue?0:position;
			savePosition(position);
			System.out.println(info.getFileName()+"下载结束");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				if(oos!=null){
					oos.close();
				}
				if(raf!=null){
					raf.close();
				}
				if(socket!=null){
					socket.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	static long readPosition(){
		long position=0;
		DataInputStream dis=null;
		try {
			File file=new File(DEST_PATH+RECORD_FILENAME);
			if(!file.exists()){
				return 0;
			}
			dis=new DataInputStream(new FileInputStream(file));
			position=dis.readLong();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				if(dis!=null){
					dis.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return position;
	}
	static void savePosition(long position){
		DataOutputStream dos=null;
		try {
			dos=new DataOutputStream(new FileOutputStream(DEST_PATH+RECORD_FILENAME));
			dos.writeLong(position);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if(dos!=null){
				try {
					dos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}
