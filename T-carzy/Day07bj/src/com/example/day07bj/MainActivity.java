package com.example.day07bj;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.util.Log;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	public void onClick(View v){
		if(v.getTag().toString().equals("linear_layout")){
			setContentView(R.layout.linearlayout_reigster);
		}else if(v.getTag().toString().equals("relative_layout")){
			setContentView(R.layout.relativelayout_register);
		}else if(v.getTag().toString().equals("table_layout")){
			setContentView(R.layout.tablelayout_register);
		}else if(v.getTag().toString().equals("grid-layout")){
			setContentView(R.layout.gridlayout_register);
		}
		Log.i("main",v.getTag().toString());
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
