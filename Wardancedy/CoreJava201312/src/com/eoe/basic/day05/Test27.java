package com.eoe.basic.day05;

public class Test27 {

	/**
	 * startWidth()示例
	 */
	public static void main(String[] args) {
		//将以下代表网站资源的字符串分解为协议、主机地址、端口号和资源路径
		String url="http://127.0.0.1:8080/elts/user.txt";
		if(url.startsWith("http://")){ //判断是否是http协议
			//协议名称
			String protocol=url.substring(0,url.indexOf("://"));
			//获取主机IP地址
			String host=url.substring(url.indexOf("://")+3,url.lastIndexOf(":"));
			//获取端口号
			String port=url.substring(url.lastIndexOf(":")+1);
			port=port.substring(0,port.indexOf("/"));
			//获取资源的文件名
			String filename=url.substring(url.indexOf(port)+port.length()+1);
			System.out.println("protocol:"+protocol);
			System.out.println("host:"+host);
			System.out.println("port:"+port);
			System.out.println("path:"+filename);
		}
	}

}
