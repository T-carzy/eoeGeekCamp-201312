package com.fengleiit.pjo;

import java.util.Random;
import java.util.Scanner;
public class Exercise02 {
	public static void main(String[] args) {
		Random random=new Random();
		String[] names={"�ŷ�","����","�����"};
		String[] cards={"����A","����2","����3","����4","����5","����6",
				"����7","����8","����9","����10","����J","����Q","����K"};
		int i;
		for(i=cards.length-1;i>0;i--){
			int index=random.nextInt(i);
			String temp=cards[index];
			cards[index]=cards[i];
			cards[i]=temp;
			System.out.println(names[i%3]+cards[i]);			
		}
		System.out.println(names[0]+":"+cards[0]);
	}
}
