package com.eoe.pre.day05_;

public class Test12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String url="http://www.com.eoe.cn/logo.gif";
		if(url.startsWith("http")){
			System.out.println("��HTTPЭ��");
		}else{
			System.out.println("����HTTPЭ��");
		}
		String path="d:\\java\\day01\\Test01.java";
		if(path.endsWith("java")){
			System.out.println("��JavaԴ����");
		}else{
			System.out.println("����JavaԴ����");
		}
	}

}
