package com.eoe.weekday.Test;

import com.eoe.weekday.entity.ArrayList_;

public class TestSet {
	public static void main(String[] args) {
		ArrayList_<String> names=new ArrayList_<String>();
		names.add("��ɺ");
		names.add("��С��");
		names.add("���");
		names.add("����");
		names.add("�Ժ�");
		for(int i=0;i<names.size();i++){
			System.out.print(names.get(i)+"  ");
		}
		System.out.println();
		System.out.println("�޸ĺ��Ԫ�أ�");
		//ʵ���޸�Ԫ������
		names.set(2, "������");
		names.set(1,"����");
		//ʵ��foreach����
		for(String n:names){
			System.out.print(n+" ");
		}
		
		

	}

}
