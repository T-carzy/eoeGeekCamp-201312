package com.eoe.weekday.Test;

import com.eoe.weekday.entity.ArrayList_;

public class TestRemove {
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
		//ʵ���Ƴ�����
		names.remove(2);
		for(int i=0;i<names.size();i++){
			System.out.print(names.get(i)+"  ");
		}
		//ʵ���ж��Ƿ����ĳԪ��
		System.out.println();
		System.out.println(names.contains("��ɺ"));
		System.out.println(names.contains("��ɺ"));
	}

}
