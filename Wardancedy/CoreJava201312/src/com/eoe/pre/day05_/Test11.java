package com.eoe.pre.day05_;

public class Test11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String url="http://www.com.eoe.cn/logo.gif";
		System.out.println(url);
		int pos=url.indexOf("://");
		String protocol=url.substring(0,pos);
		int lastPos=url.lastIndexOf("/");
		String host=url.substring(pos+3,lastPos);
		String filename=url.substring(lastPos+1);
		System.out.println("Э�飺"+protocol);
		System.out.println("������ַ:"+host);
		System.out.println(filename);
	}

}
