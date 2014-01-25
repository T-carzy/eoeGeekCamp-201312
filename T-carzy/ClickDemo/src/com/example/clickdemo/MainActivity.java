package com.example.clickdemo;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements OnClickListener{
	EditText met;
	Button mbtn1,mbtn2,mbtn3,mbtn4,mbtn5;
	Button mbtnAdd,mbtnCompute;
	StringBuilder sb;
	double a,b;
	char c;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		sb=new StringBuilder();
		initViews();
	}

	private void initViews() {
		met=(EditText) findViewById(R.id.et);
		mbtn1=(Button) findViewById(R.id.btn_1);
		mbtn2=(Button) findViewById(R.id.btn_2);
		mbtn3=(Button) findViewById(R.id.btn_3);
		mbtn4=(Button) findViewById(R.id.btn_4);
		mbtn5=(Button) findViewById(R.id.btn_5);
		mbtnAdd=(Button) findViewById(R.id.btnAdd);
		mbtnCompute=(Button) findViewById(R.id.btnCompute);
		//设置按钮点击事件
		mbtn1.setOnClickListener(this);
		mbtn2.setOnClickListener(this);
		mbtn3.setOnClickListener(this);
		mbtn4.setOnClickListener(this);
		mbtn5.setOnClickListener(this);
		mbtnAdd.setOnClickListener(this);
		mbtnCompute.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnAdd:
			c='+';
			sb.delete(0, sb.length());
			sb.append(met.getText().toString());
			a=Double.parseDouble(sb.toString());
			met.setText("");
			sb.delete(0, sb.length());
			break;
		case R.id.btnCompute:
			sb.delete(0, sb.length());
			sb.append(met.getText().toString());
			b=Double.parseDouble(sb.toString());
			met.setText("");
			compute();
			break;
		case R.id.btn_1:
			sb.append("1");
			met.setText(sb.toString());
			break;
		case R.id.btn_2:
			sb.append("2");
			met.setText(sb.toString());
			break;
		case R.id.btn_3:
			
			break;
		case R.id.btn_4://=
			
			break;
		case R.id.btn_5:
			
			break;
		}
	}

	private void compute() {
		switch (c) {
		case '+':
			met.setText(a+b+"");
			break;

		default:
			break;
		}
	}

}
