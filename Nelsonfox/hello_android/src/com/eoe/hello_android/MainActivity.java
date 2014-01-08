package com.eoe.hello_android;

import android.os.Bundle;
import android.util.Log;
import android.app.Activity;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {


//	protected void onCreate(Bundle savedInstanceState) {
//		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_main);
//	}

	@Override
	//按钮被点击时，系统将自动调用onClick()
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	public void onClick(View v){
		if(v.getTag().toString().equals("linear_layout")){
			setContentView(R.layout.linearlayout_reigster);
		}else if(v.getTag().toString().equals("relative_layout")){
			setContentView(R.layout.relaative_register);
		}else if(v.getTag().toString().equals("grid_layout")){
			setContentView(R.layout.gridlayout_register);
		}else if(v.getTag().toString().equals("tablelayout_register")){
			setContentView(R.layout.tablelayout_register);
		}
		
	}
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
