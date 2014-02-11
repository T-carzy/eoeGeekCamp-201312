package com.eoe.sel02.day06.Upload_;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class UploadClient1 {
	private static final String SRC_PATH="e:/tools";
	private static final String FILENAME="eclipse-jee-kepler-SR1-win32-x86_64.zip/";
	private static final String RECORD_FILENAME="eclipse-jee-kepler-SR1-win32-x86_64_recoed.dat";
	private static boolean isContinue=true;
	public static void main(String[] args) {
		
	}
	static long readPoistion(){
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
}
