package com.eoe.se1.day05;
/**
 * ��д������֤4λ16���������������������Ĵ�ӡ����
 * (�ⷨ1)
 * @author yw
 *
 */
public class Test02 {
	public static void main(String[] args) {
		String[] data={"0x55ff","0X78ad","0x32ah","0x7ff1"};
		String regex="0[xX][\\da-fA-F]{4}";
		for (int i = 0; i < data.length; i++) {
			if(data[i].matches(regex)){
				System.out.println(data[i]);
			}
		}
		
	}
}
