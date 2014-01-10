package com.eoe.learnjava.day07;

import java.util.Random;

public class Deal {

	/**
	 * ����������˳����
	 * @param args
	 */
	public static void main(String[] args) {
		String[] player={"�ŷ�","����","�����"};
		String[] cards={"����3","����4","����5","����6",
				"����7","����8","����9","����10","����J",
				"����Q","����K","����A"};
		Random random = new Random();
		for (int i = cards.length-1; i >= 0; i--) {
			int j=random.nextInt(i+1);//�������i����
			swap(cards,i,j);
			System.out.println(player[i%3]+":"+cards[i]);
		}
	}
	static void swap(String[] a,int i,int j){
		String c=a[i];
		a[i]=a[j];
		a[j]=c;
	}
	

}
