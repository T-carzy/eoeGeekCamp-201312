package com.fengleiit.pjo;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise10 {
	public static void main(String[] args) {
		String[] names={"�ŷ�","����","�����","���"};
				System.out.println(Arrays.toString(names));
				Scanner scanner=new Scanner(System.in);
				System.out.println("������ɾ����λ��(1~4):");
				int index=scanner.nextInt();
				for(int i=index;i<names.length;i++){
					names[i-1]=names[i];//�����к���ĸ�ֵ��ǰ���
				}				
				names=Arrays.copyOf(names, names.length-1);
			System.out.println(Arrays.toString(names));	
	}
}
