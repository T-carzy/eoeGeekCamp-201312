package com.eoe.pre.day04;

public class Test06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Song song=new Song();//�����������
		Thread wangfei=new Thread(song, "����");
		Thread zhangfei=new Thread(song, "�ŷ�");
		wangfei.start();
		try {
			Thread.sleep(800);
			zhangfei.start(); 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//����������
	static class Song implements Runnable{
		String[] songs={
			"����һ֧ССС��",
			"��Ҫ��Ҳ�ɲ���",
			"��ѰѰ���٣�ѰѰ����һ����ů�Ļ���",
			"������Ҫ��᲻��̫��"
		};
		int index=0;//ָ��ǰ����Ԫ��
		@Override
		public void run() {
			while(true){
				System.out.println(
					Thread.currentThread().getName()+":"+
					songs[index++%songs.length]);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}//����1000����
//				if(index<3){
//					index++;
//				}else{
//					index=0;
//				}
			}
		}
	}
}
