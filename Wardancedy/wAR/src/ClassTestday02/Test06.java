package ClassTestday02;

public class Test06 {


	/**
	 * 调用包装类显示各基本数据类型的取值范围。
	 */
	public static void main(String[] args) {
		// Byte��ĳ��÷����ͳ���
System.out.println("byte���������"+Math.pow(2, 8));
System.out.println("byte��ȡֵ��Χ��"+Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
byte bMax=Byte.parseByte("127");
System.out.println(bMax);
//Short��ĳ��÷����ͳ���
System.out.println("short���������:"+Math.pow(2, 16));
System.out.println("short��ȡֵ��Χ:"+Short.MIN_VALUE+"~"+Short.MAX_VALUE);
short shortValue=Short.parseShort("1000");
System.out.println(shortValue);
//Integer��ĳ��÷����ͳ���
System.out.println("int���������:"+Math.pow(2, 32));
System.out.println("int����ݷ�Χ:"+Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
int intValue=Integer.parseInt("2000000");
System.out.println(intValue);
String binaryValue=Integer.toBinaryString(16);
String hexValue=Integer.toHexString(16);
String octalvalue=Integer.toOctalString(16);
System.out.println("16ת��Ϊ������:"+binaryValue);
System.out.println("16ת��Ϊʮ�������"+hexValue);
System.out.println("16ת��Ϊ�ѽ�����"+octalvalue);

//Float��ĳ��÷����ͳ���

System.out.println("float���������"+Math.pow(2, 32));
System.out.println("float��ȡֵ��Χ��"+Float.MIN_VALUE+"~"+Float.MAX_VALUE);
float floatValue=Long.parseLong("2000000");
System.out.println(floatValue);
hexValue=Float.toHexString(16);
System.out.println("16ת��Ϊʮ�������"+hexValue);

//Double��ĳ��÷����ͳ���
System.out.println("double���������"+Math.pow(2, 64));
System.out.println("double��ȡֵ��Χ��"+Double.MIN_VALUE+"~"+Double.MAX_VALUE);
double doubleValue=Long.parseLong("2000000");
System.out.println(doubleValue);
binaryValue=Long.toBinaryString(16);
hexValue=Long.toHexString(16);
octalvalue=Long.toOctalString(16);
System.out.println("16ת��Ϊ�����ƣ�"+binaryValue);
System.out.println("16ת��Ϊʮ�������"+hexValue);
System.out.println("16ת��Ϊ�˽�����"+octalvalue);



	}

}
