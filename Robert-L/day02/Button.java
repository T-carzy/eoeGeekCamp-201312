package com.eoe.se1.day02;

public class Button {
	/*
	 * 保存一个对象，该对象的onClick()用于响应按钮被点击的事件
	 */
	OnClickListener mOnClickListener;

	public void setOnClickListener(OnClickListener l) {

		mOnClickListener = l;
	}

	/*
	 * 当按钮被点击时，调用mOnClickListener中保存的对象 的onClick()响应用户的点击
	 */
	public void performClick() {
		mOnClickListener.onClick();
	}
}
