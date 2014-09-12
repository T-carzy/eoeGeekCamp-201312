package com.eoe.se2.day01;
/**
 * ��ʾ��-12��join()ʵ���̵߳�ͬ��ʾ��2��
join()����ʵ�������̼߳�ͬ����ʵ�ֲ���2��200֮������������
(1)�����߳���IsPrime�����ж�һ�������Ƿ���������
����isPrime��ֵΪtrue��������ֵΪfalse��
(2)�����߳���FindPrime�̣߳�����isPrime�̲߳���2��200֮�������������
(3)���徲̬����i���ڴ�ű����ҵ�����isPrime��ʾ����i�ĵ�ǰֵ�Ƿ�ʹ������
Ϊȷ���̵߳�ͬ�������߳�isPrime����Ϊ�߳�FindPrime�����̡߳�

 * @author yw
 *
 */
public class Test13 {
	static boolean isPrime;
	public static void main(String[] args) {
		FindPrime findPrime=new FindPrime();
		findPrime.start();
	}
	static class FindPrime extends Thread{
		@Override
		public void run() {
			for(int i=2;i<200;i++){
				IsPrime t=new IsPrime(i);
				t.start();
				try {
					t.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if(isPrime){
					System.out.println(i);
				}
			}
		}
	}
	//���n�Ƿ�Ϊ����,���������isPrime������
	static class IsPrime extends Thread{
		int n;
		public IsPrime(int n) {
			this.n=n;
		}
		@Override
		public void run() {
			isPrime=true;
			int k=(int) Math.sqrt(n);
			for(int i=2;i<=k&&isPrime;i++){
				isPrime=n%i!=0;
			}
		}
	}
}
