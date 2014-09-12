package com.example.resultcode;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class QuestionAty extends Activity {
	RadioButton mRbA,mRbB,mRbC,mRbD;
	Button mBtnquesion;
	public static final int RESAULT_A=1,RESAULT_B=2,RESAULT_C=3,RESAULT_D=4;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.question_aty);
		mRbA=(RadioButton) findViewById(R.id.rbA);
		mRbB=(RadioButton) findViewById(R.id.rbB);
		mRbC=(RadioButton) findViewById(R.id.rbC);
		mRbD=(RadioButton) findViewById(R.id.rbD);
		mBtnquesion=(Button) findViewById(R.id.btnOk);
		mBtnquesion.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				int code=0;
				String checked="";
				if(mRbA.isChecked()){
					code=RESAULT_A;
					checked=mRbA.getText().toString();
				}else if(mRbB.isChecked()){
					code=RESAULT_B;
					checked=mRbB.getText().toString();
				}else if(mRbC.isChecked()){
					code=RESAULT_C;
					checked=mRbC.getText().toString();
				}else if(mRbD.isChecked()){
					code=RESAULT_D;
					checked=mRbD.getText().toString();
				}
				
				//…Ë÷√∑µªÿ¬Î
				Intent i=new Intent();
				i.putExtra("result", checked);
				setResult(code,i);
				finish();
			}
		});
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		return super.onCreateOptionsMenu(menu);
		
	}
}
