package Day05;

import java.util.Scanner;

public class test07 {

	/**
	 * @param args ��������ѧ����������ƥ��������±�
	 */
	public static void main(String[] args) {
		String[] name={"zhangsan","lisi","wangwu","zhaoliu"};
		Scanner scanner=new Scanner(System.in);
		System.out.println("������������");
		String n=scanner.next();
		for(int i=0;i<name.length;i++){
			if(n.equals(name[i])){
				System.out.println(name[i]+":"+i);
			}
		}
	}

}
