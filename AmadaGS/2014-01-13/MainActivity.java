package com.example.com.ityw.eoe.day09_01;
import com.example.com.ityw.eoe.day09_01.MyListener;

import com.eoe.day09.entity.User;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity {
	EditText metUserName,metPwd,metFirmPwd;
	Spinner mspinCity;// 所在城市
	CheckBox mchkReadBook, mchkTour, mchkGame;//用于爱好的控件用因变量
	RadioButton mrdMale, mrdFemale;
	Button mbtnRegister,mbtnExit;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();
	}

	private void initView() {
		metUserName = (EditText) findViewById(R.id.etUserName);
		metPwd = (EditText) findViewById(R.id.etPwd);
		metFirmPwd = (EditText) findViewById(R.id.etFirmPwd);
		mrdFemale = (RadioButton) findViewById(R.id.rdFemale);
		mrdMale = (RadioButton) findViewById(R.id.rdMale);
		mchkGame = (CheckBox) findViewById(R.id.chkGame);
		mchkReadBook = (CheckBox) findViewById(R.id.chkReadBook);
		mchkTour = (CheckBox) findViewById(R.id.chkTour);
		mspinCity = (Spinner) findViewById(R.id.spinCity);
		
		MyListener listener=new MyListener(this,metUserName,metPwd,
				metFirmPwd,mspinCity,mchkReadBook,mchkTour,mchkGame,
				mrdMale,mrdFemale);
		findViewById(R.id.btnExit).setOnClickListener(listener);
		findViewById(R.id.btnRegister).setOnClickListener(listener);
	}
			
		
	}
