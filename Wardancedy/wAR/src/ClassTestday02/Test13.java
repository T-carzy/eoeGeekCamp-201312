package ClassTestday02;

public class Test13 {

	/** 示例：long类型转换为double类型的精度丢失现象。*/
	public static void main(String[] args) {
long l=0X200000001l;
double d=1;
/*�����Ǹ���Ķ�������ʽ���ܹ�54λ
100000,00000000,00000000,00000000,00000000,00000000,00000001 long
10000,00000000,00000000,00000000,00000000,00000000,000100000 double
*  �����double�����н���ʧ���1λ��ݡ�
*/
System.out.println("long:"+Long.toBinaryString(l)+" "+l);
System.out.println("double"+Long.toBinaryString((long)d)+""+d);
	}

}
