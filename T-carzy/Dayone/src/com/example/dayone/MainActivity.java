package com.example.dayone;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{
	Button OK,exit;
	EditText etName;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();
	}

	private void initView() {
		OK=(Button)findViewById(R.id.btnzhuce);
		exit=(Button)findViewById(R.id.btnExit);
		etName=(EditText) findViewById(R.id.etName);
	}



	@Override
	public void onClick(View v) {
		switch(v.getId()){
		case R.id.btnzhuce:
			String userName=etName.getText().toString();
			String regex="[\\w_]{4,10}";
			if(userName.matches(regex)){
				Toast.makeText(this, "注册成功", 3000).show();
			}else{
				etName.setError("注册格式错误");
			}
		case R.id.btnExit:
			finish();
		}
	}

}
