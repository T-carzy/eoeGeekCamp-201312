package com.example.resultcode;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	Button mBtnShowQuestion, mBtnSay;
	TextView tvResult, tvSay;
	public static final int REQUEST_CODE_QUESTION = 1;
	public static final int REQUEST_CODE_SAY = 2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tvResult=(TextView) findViewById(R.id.tvResult);
		tvSay=(TextView) findViewById(R.id.tvSay);
		mBtnSay=(Button) findViewById(R.id.btnSay);
		mBtnShowQuestion=(Button) findViewById(R.id.btnShowQuestion);
		mBtnShowQuestion.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivityForResult(new Intent(MainActivity.this,
						QuestionAty.class), REQUEST_CODE_QUESTION);
				
			}
		});
		mBtnSay.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivityForResult(new Intent(MainActivity.this, 
						SayHelloAty.class), REQUEST_CODE_SAY);
			}
		});
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);

		switch (requestCode) {
		case REQUEST_CODE_QUESTION:
			String result;
			switch (resultCode) {
			case QuestionAty.RESAULT_B:
				result = data.getStringExtra("result");
				tvResult.setText(result + "回答正确");
				break;
			default:
				result = data.getStringExtra("result");
				tvResult.setText(result + "回答错误");
				break;
			}
			break;
		case REQUEST_CODE_SAY:
			result = data.getStringExtra("result");
			tvSay.setText(result);
		default:
			break;
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
