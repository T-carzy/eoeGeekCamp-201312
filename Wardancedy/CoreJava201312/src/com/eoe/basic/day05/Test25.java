package com.eoe.basic.day05;

public class Test25 {
	/**
	 * startsWith()示例
	 */
	public static void main(String[] args) {
		String url="http://www.baidu.com";
		if(url.startsWith("http://")){
			System.out.println(url+"是http协议的网址");
		}
	}
}
