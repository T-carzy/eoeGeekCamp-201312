package com.eoe.pre.day01;

public class Test17 {

	/**continue;��������ѭ��֮������ִ����һѭ������
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i=1;;i++){
			if(i<=20){
				System.out.println("�������Գ�"+i+"��");
			}else if(i<=100){
				System.out.println("����..����..."+i+"��");
			}else{
				System.out.println("������֧������Over!");
				break;
			}
		}
	}

}
