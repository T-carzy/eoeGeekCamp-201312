package com.eoe.basic.day05;

import java.util.Random;
/**
 * 随机发牌。
 */
public class Test12 {
	public static void main(String[] args) {
		String[] cards = { 
			"红桃3", "红桃4", "红桃5", "红桃6","红桃7","红桃8",
			"红桃9","红桃10", "红桃J" , "红桃Q", "红桃K","红桃A","红桃2"};
		String[] players = { "张飞", "王菲", "刘亦飞" };
		Random random=new Random();
		//循环变量从大到小递减
		for(int i=cards.length-1;i>0;i--){
			//随机产生一个0～i-1之间的整数->j
			int j=random.nextInt(i);
			/*以下三个命令交换cards[j]和cards[i]
			 * 目的是将随机产生的牌从挑出来并打印，保证该张牌以后被排除
			 * 在未产生的牌之外。
			 */
			String temp=cards[i];			
			cards[i]=cards[j];
			cards[j]=temp;
			//打印牌和牌手
			System.out.println(players[i%3]+":"+cards[i]);
		}
		System.out.println(players[0]+":"+cards[0]);
	}
}
