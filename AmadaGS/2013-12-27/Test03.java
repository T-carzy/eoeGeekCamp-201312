package JavaDay05;

public class Test03 {

	/**
	 * @param args  �����´�����վ��Դ���ַ����ֽ�ΪЭ�顢������ַ���˿ںź���Դ·��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="http://127.0.0.1:8080/eoe/GS";
		if(url.startsWith("http:")){
			int a=url.indexOf(":");
		    String pro=url.substring(0, a);
		System.out.println("Э���ǣ�"+pro);
		
		int b=url.lastIndexOf(":");
		String add=url.substring(a+3, b);
	System.out.println(""+add);
	
	   int c=url.indexOf("/");
	   String hao=url.substring(b+1,c-1);
	   System.out.println(""+hao);
		   
	
		
		 
		
		
		
		
		
		}
		
		
		
		
		
	}

}
