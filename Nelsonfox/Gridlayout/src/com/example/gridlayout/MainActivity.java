package com.example.gridlayout;

import android.os.Bundle;
import android.accounts.Account;
import android.app.Activity;
import android.content.DialogInterface;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
	EditText etName;
	Button Login, Exit;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();

	}

	private void initView() {
		etName = (EditText) findViewById(R.id.etName);
		Login = (Button) findViewById(R.id.btnLogin);
		Exit = (Button) findViewById(R.id.btnExit);
		Login.setOnClickListener(this);
		Exit.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnLogin:
			String userName=etName.getText().toString();
			String regex="[\\w]{4,10}";
			if(userName.matches(regex)){
				Toast.makeText(this, "注册成功", 3000).show();
			}else
			{
				etName.setError("注册格式不正确");
			}
			break;
		case R.id.btnExit:
			finish();
	
		}
			
	}

}
