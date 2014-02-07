package com.example.calculator;

import android.os.Bundle;
import android.R.string;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	private Button btn1;
	private Button btn2;
	private Button btn3;
	private Button btn4;
	private Button btn5;
	private Button btn6;
	private Button btn7;
	private Button btn8;
	private Button btn9;
	private Button btn0;
	private Button btnadd;
	private Button btnsub;
	private Button btnmul;
	private Button btndiv;
	private Button btnequal;
	private Button btnpoint;
	private Button btnc;// 清除
	private EditText msg;// 显示

	private String str_oper = "+";// 运算符
	private StringBuffer str_display = new StringBuffer();// 显示
	private String str_result;// 显示结果
	private double num1;
	private double num2;
	private boolean flag = true;// 小数点个数控制开关
	private boolean b_sub, b_mul, b_div;// 运算符开关控制

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn0 = (Button) findViewById(R.id.btn0);
		btn1 = (Button) findViewById(R.id.btn1);
		btn2 = (Button) findViewById(R.id.btn2);
		btn3 = (Button) findViewById(R.id.btn3);
		btn4 = (Button) findViewById(R.id.btn4);
		btn5 = (Button) findViewById(R.id.btn5);
		btn6 = (Button) findViewById(R.id.btn6);
		btn7 = (Button) findViewById(R.id.btn7);
		btn8 = (Button) findViewById(R.id.btn8);
		btn9 = (Button) findViewById(R.id.btn9);
		btnadd = (Button) findViewById(R.id.btnadd);
		btnc = (Button) findViewById(R.id.btnc);
		btndiv = (Button) findViewById(R.id.btnc);
		btnequal = (Button) findViewById(R.id.btnequal);
		btnmul = (Button) findViewById(R.id.btnmul);
		btnpoint = (Button) findViewById(R.id.btnpoint);
		btnsub = (Button) findViewById(R.id.btnsub);
		msg = (EditText) findViewById(R.id.msg);
		msg.setText("0.0");
		btn0.setOnClickListener(new android.view.View.OnClickListener() {

			@Override
			public void onClick(View v) {
				str_display.append("0");
				msg.setText(str_display.toString());

			}
		});
		btn1.setOnClickListener(new android.view.View.OnClickListener() {

			@Override
			public void onClick(View v) {
				str_display.append("1");
				msg.setText(str_display.toString());

			}
		});
		btn2.setOnClickListener(new android.view.View.OnClickListener() {

			@Override
			public void onClick(View v) {
				str_display.append("2");
				msg.setText(str_display.toString());

			}
		});
		btn3.setOnClickListener(new android.view.View.OnClickListener() {

			@Override
			public void onClick(View v) {
				str_display.append("3");
				msg.setText(str_display.toString());

			}
		});
		btn4.setOnClickListener(new android.view.View.OnClickListener() {

			@Override
			public void onClick(View v) {
				str_display.append("4");
				msg.setText(str_display.toString());

			}
		});
		btn5.setOnClickListener(new android.view.View.OnClickListener() {

			@Override
			public void onClick(View v) {
				str_display.append("5");
				msg.setText(str_display.toString());

			}
		});
		btn6.setOnClickListener(new android.view.View.OnClickListener() {

			@Override
			public void onClick(View v) {
				str_display.append("6");
				msg.setText(str_display.toString());

			}
		});
		btn7.setOnClickListener(new android.view.View.OnClickListener() {

			@Override
			public void onClick(View v) {
				str_display.append("7");
				msg.setText(str_display.toString());

			}
		});
		btn8.setOnClickListener(new android.view.View.OnClickListener() {

			@Override
			public void onClick(View v) {
				str_display.append("8");
				msg.setText(str_display.toString());

			}
		});
		btn9.setOnClickListener(new android.view.View.OnClickListener() {

			@Override
			public void onClick(View v) {
				str_display.append("9");
				msg.setText(str_display.toString());

			}
		});

		btnpoint.setOnClickListener(new android.view.View.OnClickListener() {

			@Override
			public void onClick(View v) {
				if (flag) {
					str_display.append(".");
					flag = false;
				}

			}
		});
		btnadd.setOnClickListener(new android.view.View.OnClickListener() {

			@Override
			public void onClick(View v) {
				str_oper = "+";
				if (!(str_display.toString() == "")) {
					num1 += Double.parseDouble(str_display.toString());
					str_display = new StringBuffer("");
				}
				if (!(str_result == null)) {
					num1 = Double.parseDouble(str_result);
					str_result = null;
				}
				msg.setText(String.valueOf(num1));
				flag = true;
			}
		});
		btndiv.setOnClickListener(new android.view.View.OnClickListener() {

			@Override
			public void onClick(View v) {
				str_oper = "%";
				if (!b_div && !(str_display.toString() == "")) {
					num1 = Double.parseDouble(str_display.toString());
					msg.setText(String.valueOf(num1));
					str_display = new StringBuffer("");
					b_div = true;
				} else {
					if (!(str_display.toString() == "")) {
						num1 %= Double.parseDouble(str_display.toString());
						str_display = new StringBuffer("");
					}
				}
				if (!(str_result == null)) {
					num1 = Double.parseDouble(str_result);
					str_result = null;
				}
				msg.setText(String.valueOf(num1));
				flag = true;
			}
		});
		btnsub.setOnClickListener(new android.view.View.OnClickListener() {

			@Override
			public void onClick(View v) {
				str_oper="-";
				if (!b_sub && !(str_display.toString() == ""))
					;
				{
					num1 = Double.parseDouble(str_display.toString());
					msg.setText(String.valueOf(num1));
					str_display = new StringBuffer("");
					b_sub = true;
				}
				{
					if (!(str_display.toString() == "")) {
						num1 -= Double.parseDouble(str_display.toString());
						str_display = new StringBuffer("");
					}
					if (!(str_result == null)) {
						num1 = Double.parseDouble(str_result);
						str_result = null;
					}
					msg.setText(String.valueOf(num1));
				}
				flag = true;

			}
		});
		btnmul.setOnClickListener(new android.view.View.OnClickListener() {

			@Override
			public void onClick(View v) {
				str_oper = "*";
				if (!b_mul && !(str_display.toString() == "")) {
					num1 = Double.parseDouble(str_display.toString());
					msg.setText(String.valueOf(num1));
					str_display = new StringBuffer("");
					b_mul = true;
				} else {
					if (!(str_display.toString() == "")) {
						num1 *= Double.parseDouble(str_display.toString());
						str_display = new StringBuffer("");
					}
					if (!(str_result == null)) {
						num1 = Double.parseDouble(str_result);
						str_result = null;
					}
					msg.setText(String.valueOf(num1));
				}
				flag = true;
			}
		});
		btnc.setOnClickListener(new android.view.View.OnClickListener() {

			@Override
			public void onClick(View v) {
				str_oper="+";
				str_display=new StringBuffer("");
				str_result=null;
				num1=0;
				num2=0;
				flag=true;
				b_mul=false;
				b_div=false;
				b_sub=false;
				msg.setText("0.0");
				

			}
		});
		
		btnequal.setOnClickListener(new android.view.View.OnClickListener() {

			@Override
			public void onClick(View v) {
				if (str_oper.equals("+")) {
					num2 = Double.parseDouble(str_display.toString());
					str_result = String.valueOf(num1 + num2);
					msg.setText(str_result);
					str_display = new StringBuffer("");
				}
				if (str_oper.equals("-")) {
					num2 = Double.parseDouble(str_display.toString());
					str_result = String.valueOf(num1 - num2);
					msg.setText(str_result);
					str_display = new StringBuffer("");
				}
				if (str_oper.equals("*")) {
					num2 = Double.parseDouble(str_display.toString());
					str_result = String.valueOf(num1 * num2);
					msg.setText(str_result);
					str_display = new StringBuffer("");
				}
				if (str_oper.equals("%")) {
					num2 = Double.parseDouble(str_display.toString());
					if (!(num2 == 0)) {
						str_result = String.valueOf((num1 % num2));
						msg.setText(str_result);
					}

					str_display = new StringBuffer("");
				}
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
