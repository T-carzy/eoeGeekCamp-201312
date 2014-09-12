package fun.dwords;

public class Test {
	  public static void main(String[] args) {
		System.out.println("你好，我叫多多");
		
		try {
			System.out.println(1/0);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("除数为0！");
			e.printStackTrace();
		}
		System.out.println("我被0除后仍在运行");
	}
	}
