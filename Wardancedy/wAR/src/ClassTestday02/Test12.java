package ClassTestday02;

public class Test12 {

	/**
	 * ʾ�� int����ת��Ϊfloat���Ͷ�ʧ���Ȱ���
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=0x1000001;
System.out.println("int:"+Integer.toBinaryString(i)+" "+i);
float f=i;
System.out.println("float"+Integer.toBinaryString((int)f)+" "+f);
	}

}