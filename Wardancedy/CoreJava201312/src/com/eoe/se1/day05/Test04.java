package com.eoe.se1.day05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * ����û�����𰸣������𰸰����õ�������ʽ�������� �ָ�Ϊ���飬�����������������ʾ������Ľ����
 * 
 * @author yw c a , d a c d [c,a,d]
 * 
 *         [a,c,d]
 */
public class Test04 {
	public static void main(String[] args) {
		String regex = "([a-d](\\s*,\\s*|\\s+)+){1,4}";
		Scanner scanner = new Scanner(System.in);
		System.out.println("�����(a-d��A-D):");
		String answer = null;
		boolean ok;
		do {
			answer=scanner.nextLine().trim().toLowerCase();
			answer+=" ";
			ok = answer.matches(regex);
			if (!ok) {
				System.out.println("����Ĵ𰸴���");
			}
		} while (!ok);
		//System.out.println(ok);
		regex="\\s*,\\s*|\\s+";
		answer=answer.replaceAll(regex, " ");
		String[] data=answer.split(" ");
		Arrays.sort(data);
		System.out.println(Arrays.toString(data));
		List<String> list=Arrays.asList(data);
		System.out.println(list);
		//System.out.println(answer);
	}
}
