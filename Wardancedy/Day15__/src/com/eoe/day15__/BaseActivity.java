package com.eoe.day15__;

import android.app.Activity;

public class BaseActivity extends Activity{
	public <T> T findViewById_(int id){
		return (T)findViewById(id);
	}
}
