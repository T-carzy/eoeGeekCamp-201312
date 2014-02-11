package com.eoe.se1.day01.button;

public class Button {
	/*保存一个对象，该对象中的onClick()用于响应按
	 * 钮被点击的事件
	 */
	OnClickListener mOnClickListener;
	public void setOnClickListener(OnClickListener l){
		mOnClickListener=l;
	}
	/*当按钮被点击时，调用mOnClickListener中保存
	 * 的对象的onClick()响应用户的点击。
	 */
	public void performClick(){
		mOnClickListener.onClick();
	}
}
