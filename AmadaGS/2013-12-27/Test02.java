package JavaDay05;

public class Test02 {

	/**
	 * @param args   ��ȡЭ������
	 */
	public static void main(String[] args) {
		String url="http://www.eoe.com/logo.git";
		int pos=url.indexOf(":/");
		String pro=url.substring(0, pos);
		System.out.println("Э�����֣�"+pro);
		int a=url.lastIndexOf("/");
		String n=url.substring(a+1);
		System.out.println("�ļ�����:"+n);
		

	}

}
