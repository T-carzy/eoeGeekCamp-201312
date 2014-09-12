package com.eoe.pre.day04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Դ�ļ���·��
		String src="f:/java_test/src/cocos2d_x.zip";
		//Ŀ���ļ���·��
		String dest="f:/java_test/dest/cocos2d_x.zip";
		FileInputStream fis=null;
		FileOutputStream fos=null;
		//alt+shift+z
		try {
			fis=new FileInputStream(src);
			fos=new FileOutputStream(dest);
			byte[] buffer=new byte[1024*100];
			int len;
			//�����ļ����ƿ�ʼ��ϵͳʱ��
			long start=System.currentTimeMillis();
			while((len=fis.read(buffer))!=-1){
				fos.write(buffer, 0, len);
			}
			//�����ļ����ƽ�����ϵͳʱ��
			long end=System.currentTimeMillis();
			System.out.println("cost time="+(end-start)/1000+"��");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(fis!=null){
					fis.close();
				}
				if(fos!=null){
					fos.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
