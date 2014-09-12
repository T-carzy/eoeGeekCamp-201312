package se2.day04;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test03 {
	static final String dir="d:/se1/day04";
	static final String strFile="LT01Collection.java";
public static void main(String[] args) {
	Scanner input =new Scanner(System.in);
	System.out.println("1-isFile()");
	System.out.println("2-isDirectory()");
	System.out.println("3-lastModified()");
	System.out.println("4-length()");
	System.out.println("5-list()");
	System.out.println("6-listFiles()");
	System.out.println("select(1-6)");
	int select=input.nextInt();
	switch(select){
	case 1://isFile()
		File file1=new File(dir,strFile);
		if(file1.exists()){
			System.out.println(strFile+"���ļ�:"+file1.isFile());
		}
		break;
	case 2://isDirectory()
		File dir2=new File(dir);
		if(dir2.exists()){
			System.out.println(dir2+"���ļ���:");
		}
		break;
	case 3://lastModified()
		File file2=new File(dir,strFile);
		long time=file2.lastModified();
		Date date=new Date(time);
		SimpleDateFormat fmt=new SimpleDateFormat("yyyy-MM-dd:HH:mm:ss");
		String strDate=fmt.format(date);
		Calendar cal=Calendar.getInstance();
		cal.setTime(date);
		int year=cal.get(Calendar.YEAR);
		int month=cal.get(Calendar.MONTH);
		int day=cal.get(Calendar.DAY_OF_MONTH);
		int hour=cal.get(Calendar.HOUR_OF_DAY);
		int minute=cal.get(Calendar.MINUTE);
		int second=cal.get(Calendar.SECOND);
		System.out.println(strFile+"���±༭��ʱ��:"+year+"��"+month
				+"��"+day+"��"+hour+"ʱ"+minute+"��"+second+"��");
		System.out.println(strFile+"����༭��ʱ��:"+strDate);
		break;
	case 4://length()
		File file4=new File(dir,strFile);
		if(file4.exists()){
			System.out.println(strFile+"���ļ�����:"+file4.length());
		}
		break;
	case 5://list()
		File dir5=new File(dir);
		String[] file5=dir5.list();
		for(int i=0;i<file5.length;i++){
			System.out.println(file5[i]);
		}
		break;
	case 6://listFiles()
		File dir6=new File(dir);
		File[] files=dir6.listFiles();
		System.out.println("����\t\t\t\t��С\t����\t�޸�����");
		for(int i=0;i<files.length;i++){
		String name=files[i].getName();
		int len=name.length()<=40?name.length():40;
		name=name.substring(0,len);
		while(name.length()<40){
			name+=" ";
		}
		System.out.println(name);
		System.out.println(files[i].length()+"\t");
		if(files[i].isFile()){
			System.out.println("�ļ�\t");
		}else{
			System.out.println("�ļ���\t");
		}
		Date date6=new Date(files[i].lastModified());
		SimpleDateFormat fmt6=new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
		String strDate6=fmt6.format(date6);
		System.out.println(strDate6);
		}
		break;
	}
}
}
