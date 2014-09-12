package com.eoe.day12_;

import android.app.Activity;

public class BaseActivity extends Activity {
	//写一个泛型方法，实现MainActivity中的findViewById无需类型转换
	public <T> T findViewById_(int id){
		return (T)findViewById(id);
	}
}
