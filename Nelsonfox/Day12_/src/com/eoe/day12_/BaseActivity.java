package com.eoe.day12_;

import android.app.Activity;

public class BaseActivity extends Activity {
	//дһ�����ͷ�����ʵ��MainActivity�е�findViewById��������ת��
	public <T> T findViewById_(int id){
		return (T)findViewById(id);
	}
}
