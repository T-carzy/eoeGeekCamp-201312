package com.eoe.basic.day05;

public class Test27 {

	/**
	 * startWidth()ʾ��
	 */
	public static void main(String[] args) {
		//�����´�����վ��Դ���ַ����ֽ�ΪЭ�顢������ַ���˿ںź���Դ·��
		String url="http://127.0.0.1:8080/elts/user.txt";
		if(url.startsWith("http://")){ //�ж��Ƿ���httpЭ��
			//Э������
			String protocol=url.substring(0,url.indexOf("://"));
			//��ȡ����IP��ַ
			String host=url.substring(url.indexOf("://")+3,url.lastIndexOf(":"));
			//��ȡ�˿ں�
			String port=url.substring(url.lastIndexOf(":")+1);
			port=port.substring(0,port.indexOf("/"));
			//��ȡ��Դ���ļ���
			String filename=url.substring(url.indexOf(port)+port.length()+1);
			System.out.println("protocol:"+protocol);
			System.out.println("host:"+host);
			System.out.println("port:"+port);
			System.out.println("path:"+filename);
		}
	}

}
