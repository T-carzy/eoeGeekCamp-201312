package com.eoe.sel02.day06.Upload_;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import com.eoe.sel02.day06.Download.FileInfo;

public class UploadClient2 {
	private static final String SRC_PATH="e:/java_test/";
	private static final String FILENAME="genymotion-2.0.1-vbox.exe";
	private static final String RECORD_FILENAME="genymotion-2.0.1-vbox_record.dat";
	private static boolean isContinue=true;
	public static void main(String[] args) {
		new Thread(){
			@Override
			public void run() {
				System.out.println("按任意键停止文件上传");
				new Scanner(System.in).next();
				isContinue=false;
			}
		}.start();
		ObjectOutputStream oos=null;
		RandomAccessFile raf=null;
		try {
			Socket socket=new Socket("127.0.0.1",9999);
			long position=readPosition();
			FileInfo info=new FileInfo(FILENAME, position);
			oos=new ObjectOutputStream(socket.getOutputStream());
			oos.writeObject(info);
			raf=new RandomAccessFile(SRC_PATH+FILENAME, "r");
			byte[] buffer=new byte[1024];
			int len;
			raf.seek(position);
			OutputStream out=socket.getOutputStream();
			System.out.println(FILENAME+"开始上传");
			while((len=raf.read(buffer))!=-1&&isContinue){
				out.write(buffer, 0, len);
				position+=len;
			}
			position=isContinue?0:position;
			savePosition(position);
			if(isContinue){
				System.out.println(FILENAME+"上传完毕");
			}else{
				System.out.println(FILENAME+"上传被终止");
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(oos!=null){
					oos.close();
				}
				if(raf!=null){
					raf.close();
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
			File file=new File(SRC_PATH+RECORD_FILENAME);
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
			if(dis!=null){
				try {
					dis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return position;
	}
	static void savePosition(long position){
		DataOutputStream dos=null;
		try {
			dos=new DataOutputStream(new FileOutputStream(SRC_PATH+RECORD_FILENAME));
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
