
	package com.eoe.basic.day01;

	public class Exercise04 {

		/** ����������������ڴ洢���ݵĵ�Ԫ�ı�ʾ��
		 * @param args
		 */
		public static void main(String[] args) {
			//20��ƽ����+10��ƽ�������ٳ���(20��ƽ����-10��ƽ����)		
			System.out.println("(sqrt(20)+sqrt(10))/(sqrt(20)-sqrt(10))="+(Math.sqrt(20)+Math.sqrt(10))/(Math.sqrt(20)-Math.sqrt(10)));
			double sqrt10=Math.sqrt(10);
			double sqrt20=Math.sqrt(20);
			double result=((sqrt20+sqrt10)/(sqrt20-sqrt10));
			double result2=Math.round(result*100)/100.0;
			System.out.println("(sqrt(20)+sqrt(10))/(sqrt(20)-sqrt(10))="+result2);
			
		}

	}


