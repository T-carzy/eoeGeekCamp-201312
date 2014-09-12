package com.example.project01;

import android.R;
import android.os.Bundle;
import android.R.string;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity {
//声明用于输入姓名，密码，确认密码的编辑框的引用变量
	EditText metUserNsme,metPwd,metFirmPwd;
	Spinner mspinCity;
	CheckBox mchkReadBook,mchkTour,mchkGame;
	RadioButton mrdMale,mrdFemale;
	Button mbtnRegister,mbtnExit;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gridlayout_register);
		initView();//初始化控件
		setListener();//注册对坚挺时间的处理
	}
//注册对监听事件的处理
	private void setListener(){
		//采用匿名内部类的方式设置对退出按钮点击事件的毁掉
		mbtnExit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				finish();
				
			}
		});
		//采用匿名内部类的方式设置对注册按钮点击事件的回调
		mbtnRegister.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			String userName=metUserNsme.getText().toString();
			if(userName.length()==0){
				metUserNsme.setError("用户名不能为空");
				return;
			}
				String pwd=metPwd.getText().toString();
				if(pwd.length()==0){
					metPwd.setError("密码不能为空");
					return;
				}
				String firmPwd=metFirmPwd.getText().toString();
				if(firmPwd.length()==0){
					metFirmPwd.setError("确认密码不能为空");
					return;
				}
				if(!pwd.equals(firmPwd)){
					metFirmPwd.setError("密码不一致");
					return;
				}
				char sex;
				if(mrdFemale.isChecked()){
					sex=mrdFemale.getText().toString().charAt(0);
				}else{
					sex=mrdMale.getText().toString().charAt(0);
				}
				StringBuilder hobby=new StringBuilder("爱好");
				if(mchkGame.isChecked()){
					hobby.append(",").append(mchkGame.getText().toString());
				}
				if(mchkReadBook.isChecked()){
					hobby.append(",").append(mchkReadBook.getText().toString());
				}
				if(mchkTour.isChecked()){
					hobby.append(",").append(mchkTour.getText().toString());
				}
				String city=mspinCity.getSelectedItem().toString();
				//创建注册用户对象
				User user=new User(userName,firmPwd,sex,city,hobby,toString());
				Log.i("main", user.toString());//在日志窗口显示注册用户信息
				//在窗口显示注册用户信息
				Toast.makeText(MainActivity.this,"注册成功,"+user.toString() , Toast.LENGTH_LONG).show();
			}
		
		});
	}
	private void initView(){
		//通过查找XML中定义的控件，创建用于输入姓名的编辑框对象
		metUserNsme=findViewById(R.id.etUserName);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, meUsernamenu);
		return true;
	}

}
