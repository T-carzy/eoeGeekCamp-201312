package com.eoe.basic.day05;

public class Test26 {
	/**
	 * indexOf()和lastIndexOf()示例
	 */
	public static void main(String[] args) {
		String url="http://www.tarean.com/logo.gif";
		int pos=url.indexOf("://");
		String protocol=url.substring(0,pos);
		System.out.println("协议名称:"+protocol);
		pos=url.lastIndexOf("/");
		String filename=url.substring(pos+1);
		System.out.println("文件名:"+filename);
	}

}
