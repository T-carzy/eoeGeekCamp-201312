package com.example.onclick;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.util.Log;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;
import android.app.Activity;

public class MainActivity extends Activity {


	EditText metUserName,metPwd,metFirmPwd;
	Spinner mspinCity;
	CheckBox mchkReadBook,mchkTour,mchkGame;
	RadioButton mrdMale,mrdFemale;
	Button mbtnRegister,mbtnExit;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();
		setListener();
	}


	private void initView() {
		// TODO Auto-generated method stub
		
	}


	private void setListener() {
		mbtnExit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				finish();
			
			}
		});
		mbtnRegister.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String userName=metUserName.getText().toString();
				if(userName.length()==0){
					metUserName.setError("用户名不能为空");
					return;
					
				}
				String pwd =metPwd.getText().toString();
				if(pwd.length()==0){
					metPwd.setError("密码不能为空");
					return;
				}
			}
		});
			
	}





	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
