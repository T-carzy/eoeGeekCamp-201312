package com.eoe.se1.day01.button;

public class Button {
	/*����һ�����󣬸ö����е�onClick()������Ӧ��
	 * ť��������¼�
	 */
	OnClickListener mOnClickListener;
	public void setOnClickListener(OnClickListener l){
		mOnClickListener=l;
	}
	/*����ť�����ʱ������mOnClickListener�б���
	 * �Ķ����onClick()��Ӧ�û��ĵ����
	 */
	public void performClick(){
		mOnClickListener.onClick();
	}
}
