package com.example.day13;

import android.app.Activity;

public class BaseActivity extends Activity{
	public <T> T findViewById_(int id){
		return (T)findViewById(id);
		
	}
}
