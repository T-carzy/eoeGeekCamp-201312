package com.eoe.basic.day06.sort;

import java.util.Arrays;
/**
 * ��������
 * �������2��Ԫ�ؿ�ʼ��
 * ��ǰ��������(����)����������Ԫ��
 *    ���磺a[3]��{10,25,50}���룺
 *    {10,25,50,20,45}
 *  ����ǰ�Ƚ�a[3]��ֵ������һ����ʱ����k�С�
 *  ѭ������j��2��ʼ��ÿ�εݼ���ѭ��������������i>=0&&k>a[j]
 *  ѭ���壺a[j+1]=a[j]��������Ԫ�ص�ֵ���κ���һλ��Ϊ�����ڵء�
 *  ѭ�������󣬽�k��ֵ���Ƹ�a[j+1].
 */
public class Test04InsertSortDemo1 {
	public static void main(String[] args) {
		int[] a={32,65,49,58,97};
		System.out.println(Arrays.toString(a));
		int i;
		i=1;
		int k=a[i];
		int j;
		for(j=i-1;j>=0&&k>a[j];j--){
			a[j+1]=a[j];
		}
		a[j+1]=k;
		i++;//i=2
		k=a[i];
		for (j =i-1; j>=0&&k>a[j];j--) {
			a[j+1]=a[j];
		}
		a[j+1]=k;
		i++;//i=3
		k=a[i];
		for(j=i-1;j>=0&&k>a[j];j--){
			a[j+1]=a[j];
		}
		a[j+1]=k;
		i++;//i=4
		k=a[i];
		for(j=i-1;j>=0&&k>a[j];j--){
			a[j+1]=a[j];
		}
		a[j+1]=k;
//		for (int i = 1; i < a.length; i++) {
//			//��a[i]��ֵ��������ʱ����k��
//			int k=a[i];
//			int j;
//			//ѭ����i-1��0,ѭ��������������j>=0����k��ֵС��a[j]
//			for(j=i-1;j>=0&&k>a[j];j--){
//				a[j+1]=a[j];//ÿ�ν�����Ԫ�ص�ֵ���κ���һλ
//			}
//			//ѭ�������󣬽�k��ֵ������a[j+1],��j��ֵ�����һ�Ρ�
//			a[j+1]=k;
//		}
		System.out.println(Arrays.toString(a));
		
	}
}
