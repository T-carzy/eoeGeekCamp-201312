package com.example.layout;

import java.text.DecimalFormat;
import java.util.regex.Pattern;

import android.os.Bundle;
import android.os.PatternMatcher;
import android.R.string;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class MainActivity extends Activity implements OnClickListener {
	EditText metUserName, metPwd, mwtFirmPwd;
	Spinner mspinCity;
	CheckBox mchkReadBook, mchkTour, mchkGame;
	RadioButton mrdMale, mrdFemale;
	Button mbtnRegister, mbtnExit;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.denglu);
		initView();
	}

	private void initView() {
		metUserName = (EditText) findViewById(R.id.etUserName);
		metUserName.setOnClickListener(this);
		mbtnExit = (Button) findViewById(R.id.btndenglu);
		mbtnExit.setOnClickListener(this);
		mbtnRegister = (Button) findViewById(R.id.btnRegister);
		mbtnRegister.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnRegister:
			String userName = metUserName.getText().toString();
			String regex = "[\\w_]{4,10}";

			if (!userName.matches(regex)) {
				metUserName.setError("输如内容不匹配");
			}
			break;

		}
	}
	class MyListerner implements OnClickListener{
		@Override
		public void onClick(View v) {
			
		}
	}

}
