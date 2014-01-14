package com.example.resultcode;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SayHelloAty extends Activity {
	EditText metSay;
	Button mbtnSubmmit;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sayhello_aty);
		metSay=(EditText) findViewById(R.id.etSay);
		mbtnSubmmit=(Button) findViewById(R.id.btnSubmmit);
		mbtnSubmmit.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
			Intent i=new Intent();
			i.putExtra("result", metSay.getText().toString());
			setResult(1,i);
			finish();
			}
		});
	}
}
