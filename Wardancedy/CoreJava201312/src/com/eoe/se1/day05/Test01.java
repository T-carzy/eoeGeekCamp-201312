package com.eoe.se1.day05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * �����ַ����еĶ��Ų���ʾ�ö������ַ����Ŀ�ʼ��
 * ������λ��.
 */
public class Test01 {
	public static void main(String[] args) {
		String text="a b ,c ,d";
		Pattern p=Pattern.compile(",");
		Matcher m=p.matcher(text);
		if(m.find()){
			System.out.println(m.group()+"\tstart:"+m.start()+"\tend:"+m.end());
		}else{
			System.out.println("not found!");
		}
	}
}
