package com.eoe.basic.day05;

import java.util.Random;
/**
 * ������ơ�
 */
public class Test12 {
	public static void main(String[] args) {
		String[] cards = { 
			"����3", "����4", "����5", "����6","����7","����8",
			"����9","����10", "����J" , "����Q", "����K","����A","����2"};
		String[] players = { "�ŷ�", "����", "�����" };
		Random random=new Random();
		//ѭ�������Ӵ�С�ݼ�
		for(int i=cards.length-1;i>0;i--){
			//�������һ��0��i-1֮�������->j
			int j=random.nextInt(i);
			/*�������������cards[j]��cards[i]
			 * Ŀ���ǽ�����������ƴ�����������ӡ����֤�������Ժ��ų�
			 * ��δ��������֮�⡣
			 */
			String temp=cards[i];			
			cards[i]=cards[j];
			cards[j]=temp;
			//��ӡ�ƺ�����
			System.out.println(players[i%3]+":"+cards[i]);
		}
		System.out.println(players[0]+":"+cards[0]);
	}
}
