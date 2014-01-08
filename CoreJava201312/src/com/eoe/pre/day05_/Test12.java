package com.eoe.pre.day05_;

public class Test12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String url="http://www.com.eoe.cn/logo.gif";
		if(url.startsWith("http")){
			System.out.println("是HTTP协议");
		}else{
			System.out.println("不是HTTP协议");
		}
		String path="d:\\java\\day01\\Test01.java";
		if(path.endsWith("java")){
			System.out.println("是Java源程序");
		}else{
			System.out.println("不是Java源程序");
		}
	}

}
