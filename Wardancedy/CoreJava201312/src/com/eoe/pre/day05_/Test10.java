package com.eoe.pre.day05_;

import java.util.Random;

public class Test10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random random=new Random();
		String[] names={"�ŷ�","����","�����"};
		String[] cards={"����3","����4","����5","����6",
				        "����7","����8","����9","����10",
				        "����J","����Q","����K","����A","����2"};
		for (int i = cards.length-1; i>0;i--) {
			int index=random.nextInt(i);
			//cards[index]��cards[i]����
			String temp=cards[index];
			cards[index]=cards[i];
			cards[i]=temp;
			System.out.println(names[i%3]+":"+cards[i]);
		}
	}

}
