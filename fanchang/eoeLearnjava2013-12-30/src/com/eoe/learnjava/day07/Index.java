package com.eoe.learnjava.day07;

public class Index {

	/**��ȡ�ַ����ַ�����һ�λ����һ�γ��ֵ��±�
	 * @param args
	 */
	public static void main(String[] args) {
		String url="http://www.eoe.com/logo.gif";
		int pos=url.indexOf("://");
		System.out.println(pos);
		String protocol=url.substring(0, pos); //��ȡЭ������
		System.out.println(protocol);
		pos=url.lastIndexOf("/");
		String filename=url.substring(pos+1); //��ȡͼƬ�ļ���
		System.out.println(filename);
	}

}
