package com.eoe.basic.day05;

public class Test26 {
	/**
	 * indexOf()��lastIndexOf()ʾ��
	 */
	public static void main(String[] args) {
		String url="http://www.tarean.com/logo.gif";
		int pos=url.indexOf("://");
		String protocol=url.substring(0,pos);
		System.out.println("Э������:"+protocol);
		pos=url.lastIndexOf("/");
		String filename=url.substring(pos+1);
		System.out.println("�ļ���:"+filename);
	}

}
