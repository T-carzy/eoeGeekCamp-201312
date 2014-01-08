package com.eoe.pre.day05_;

import java.util.Random;

public class Test10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random random=new Random();
		String[] names={"’≈∑…","Õı∑∆","¡ı“‡∑∆"};
		String[] cards={"∫ÏÃ“3","∫ÏÃ“4","∫ÏÃ“5","∫ÏÃ“6",
				        "∫ÏÃ“7","∫ÏÃ“8","∫ÏÃ“9","∫ÏÃ“10",
				        "∫ÏÃ“J","∫ÏÃ“Q","∫ÏÃ“K","∫ÏÃ“A","∫ÏÃ“2"};
		for (int i = cards.length-1; i>0;i--) {
			int index=random.nextInt(i);
			//cards[index]”Îcards[i]Ωªªª
			String temp=cards[index];
			cards[index]=cards[i];
			cards[i]=temp;
			System.out.println(names[i%3]+":"+cards[i]);
		}
	}

}
