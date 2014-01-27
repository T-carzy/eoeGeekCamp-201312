package com.example.workforcalculator;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class CalculatorActivity extends Activity implements OnClickListener{
	private Button ling,one,two,three,four,five,
	six,seven,eight,nine;//0-9个按钮
	private EditText input;//输出结果
	private Button
	jia,jian,cheng,gang,quyu,dengyu,//+ - * / % =
	pingfang,jiecheng,kaifang,// ^ n! √
	tuige,qingping,point;// ← C .
	//true表示正确，可以继续输入；false表示有误，输入被锁定
	public boolean panduan=true;
    //判断是否是按=之后的输入，true表示输入在=之前，false反之
	public boolean dengyuhou=true;
	StringBuilder sb;
	double a,b;
	char c;
	int n;
	

	@Override
	public void onCreate(Bundle instance) {
		super.onCreate(instance);
		setContentView(R.layout.activity_main);
		sb=new StringBuilder();
		initViews();	
	}


	private void initViews() {
		input=(EditText)findViewById(R.id.input);
		dengyu=(Button)findViewById(R.id.dengyu);
		jia=(Button)findViewById(R.id.jia);
		jian=(Button)findViewById(R.id.jian);
		cheng=(Button)findViewById(R.id.cheng);
		gang=(Button)findViewById(R.id.gang);
		quyu=(Button)findViewById(R.id.quyu);
		jiecheng=(Button)findViewById(R.id.jiecheng);
		pingfang=(Button)findViewById(R.id.pingfang);
		kaifang=(Button)findViewById(R.id.kaifang);
		tuige=(Button)findViewById(R.id.tuige);
		qingping=(Button)findViewById(R.id.qingping);
		point=(Button)findViewById(R.id.point);
		ling=(Button)findViewById(R.id.ling);
		one=(Button)findViewById(R.id.one);
		two=(Button)findViewById(R.id.two);
		three=(Button)findViewById(R.id.three);
		four=(Button)findViewById(R.id.four);
		five=(Button)findViewById(R.id.five);
		six=(Button)findViewById(R.id.six);
		seven=(Button)findViewById(R.id.seven);
		eight=(Button)findViewById(R.id.eight);
		nine=(Button)findViewById(R.id.nine);
		dengyu.setOnClickListener(this);
		jia.setOnClickListener(this);
		jian.setOnClickListener(this);
		cheng.setOnClickListener(this);
		gang.setOnClickListener(this);
		quyu.setOnClickListener(this);
		jiecheng.setOnClickListener(this);
		pingfang.setOnClickListener(this);
		kaifang.setOnClickListener(this);
		tuige.setOnClickListener(this);
		qingping.setOnClickListener(this);
		point.setOnClickListener(this);
		one.setOnClickListener(this);
		two.setOnClickListener(this);
		three.setOnClickListener(this);
		four.setOnClickListener(this);
		five.setOnClickListener(this);
		six.setOnClickListener(this);
		seven.setOnClickListener(this);
		eight.setOnClickListener(this);
		nine.setOnClickListener(this);
	}


	@Override
	public void onClick(View v) {
		switch(v.getId()){
		case R.id.one:
			sb.append("1");
			input.setText(sb.toString());
			break;
		case R.id.two:
			sb.append("2");
			input.setText(sb.toString());
			break;
		case R.id.three:
			sb.append("3");
			input.setText(sb.toString());
			break;
		case R.id.four:
			sb.append("4");
			input.setText(sb.toString());
			break;
		case R.id.five:
			sb.append("5");
			input.setText(sb.toString());
			break;
		case R.id.six:
			sb.append("6");
			input.setText(sb.toString());
			break;
		case R.id.seven:
			sb.append("7");
			input.setText(sb.toString());
			break;
		case R.id.eight:
			sb.append("8");
			input.setText(sb.toString());
			break;
		case R.id.nine:
			sb.append("9");
			input.setText(sb.toString());
			break;
		case R.id.jia:
			c='+';
			sb.delete(0,sb.length());
			sb.append(input.getText().toString());
			a=Double.parseDouble(sb.toString());
			input.setText("");
			sb.delete(0, sb.length());
			break;
		case R.id.jian:
			c='-';
			sb.delete(0,sb.length());
			sb.append(input.getText().toString());
			a=Double.parseDouble(sb.toString());
			input.setText("");
			sb.delete(0, sb.length());
			break;
		case R.id.cheng:
			c='*';
			sb.delete(0,sb.length());
			sb.append(input.getText().toString());
			a=Double.parseDouble(sb.toString());
			input.setText("");
			sb.delete(0, sb.length());
			break;
		case R.id.gang:
			c='/';
			sb.delete(0,sb.length());
			sb.append(input.getText().toString());
			a=Double.parseDouble(sb.toString());
			input.setText("");
			sb.delete(0, sb.length());
			break;
		case R.id.quyu:
			c='%';
			sb.delete(0,sb.length());
			sb.append(input.getText().toString());
			a=Double.parseDouble(sb.toString());
			input.setText("");
			sb.delete(0, sb.length());
			break;
		case R.id.dengyu:
			sb.delete(0,sb.length());
			sb.append(input.getText().toString());
			b=Double.parseDouble(sb.toString());
			input.setText("");
			count();
			break;
		case R.id.jiecheng:
			n=Integer.parseInt(sb.toString());
			input.setText(fact(n)+"");
			sb.delete(0, sb.length());
		
			break;
		case R.id.tuige:
			if(input.getText().toString().length() > 0){
                input.setText(input.getText().toString().
               substring(0, input.getText().toString().length() - 1)); 
			input.toString();
			}
//		case R.id.qingping:
//			if(input.getText().toString().length() > 0){
//				StringBuilder ss=new StringBuilder("");
//				input.setText(ss.toString());
//			}
		}
	}
	
	private double fact(int n) {
		double result=1;
		for (int i = 1; i <= n; i++) {
			result*=i;
		}
		return result;
		
	}
	


	private void count(){
		switch (c) {
		case '+':
			input.setText(a+b+"");
			break;
		case '-':
			input.setText((a-b)+"");
			break;
		case '*':
			input.setText((a*b)+"");
			break;
		case '/':
			input.setText((a/b)+"");
			break;

		

		
		default:
			break;
		}
	}
	
}
