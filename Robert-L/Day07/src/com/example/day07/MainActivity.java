package com.example.day07;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	// 按钮被点击时，系统将自动调用onClick()
	public void onClick(View v) {
		if (v.getTag().toString().equals("linear_layout")) {
			setContentView(R.layout.linearlayout_register);
		} else if (v.getTag().toString().equals("relative_layout")) {
			setContentView(R.layout.relativelayout_register);
		} else if (v.getTag().toString().equals("table_layout")) {
			setContentView(R.layout.tablelayout_register);
		} else if (v.getTag().toString().equals("grid_layout")) {
			setContentView(R.layout.gridlayout_register);
		}
		// 在日志窗口的main标签中输出Button.tag的属性的值
		Log.i("main", v.getTag().toString());

	}

}
