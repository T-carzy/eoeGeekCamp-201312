package Day04;

public class Test01 {

	/**
	 * ��whileѭ�����A-Z��Ӧ��unicode��ֵ
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		int i=65;
		while (i<=65+25){
			System.out.println((char)i+":"+i);
			i++;
		}
	}
*/	
		char i='A';
		while(i<='Z'){
			System.out.println(i+":"+(int)i);
			i++;
		}
	}
}

