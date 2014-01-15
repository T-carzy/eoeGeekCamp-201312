package com.example.com.ityw.day08_04;

import com.ityw.day08.entity.User;

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
	Spinner mspinCity;
	CheckBox mchkReadBook,mchkTour,mchkGame;
	RadioButton mrdMale,mrdFemale;
	Button mbtnRegister,mbtnExit;
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		intiView();
		
	}

	private void intiView() {
		metUserName=(EditText) findViewById(R.id.etUserName);
		metPwd=(EditText) findViewById(R.id.etPwd);
		metFirmPwd=(EditText) findViewById(R.id.etFirmPwd);
		mrdFemale=(RadioButton) findViewById(R.id.rdFemale);
		mrdMale=(RadioButton) findViewById(R.id.rdMale);
		mchkGame=(CheckBox) findViewById(R.id.chkGame);
		mchkReadBook=(CheckBox) findViewById(R.id.chkReadBook);
		mchkTour=(CheckBox) findViewById(R.id.chkTour);
		mspinCity=(Spinner) findViewById(R.id.spinCity);
		mbtnExit=(Button) findViewById(R.id.btnExit);//
		MyListener listener=new MyListener();
		mbtnExit.setOnClickListener(listener);
		mbtnRegister=(Button) findViewById(R.id.btnRegister);
		mbtnRegister.setOnClickListener(listener);
	}
	//成员内部类的实现
	private class MyListener implements OnClickListener{

		@Override
		public void onClick(View v) {
			switch(v.getId()){
			case R.id.btnExit:
				MainActivity.this.finish();
				break;
			case R.id.btnRegister:
				String userName=metUserName.getText().toString();
				if(userName.length()==0){
					metUserName.setError("用户名不能为空");
					return;
				}
				String pwd=metPwd.getText().toString();
				if(pwd.length()==0){
					metPwd.setError("密码不能为空");
					return;
				}
				String firmPwd=metFirmPwd.getText().toString();
				if(firmPwd.length()==0){
					metFirmPwd.setError("密码不一致");
					return;
				}
				char sex;
				if(mrdFemale.isChecked()){
					sex=mrdFemale.getText().toString().charAt(0);
				}else{
					sex=mrdMale.getText().toString().charAt(0);
				}
				StringBuilder hobby=new StringBuilder("爱好:");
				if(mchkGame.isChecked()){
					hobby.append(mchkGame.getText().toString());
				}
				if(mchkTour.isChecked()){
					hobby.append(",").append(mchkTour.getText().toString());
				}
				if(mchkReadBook.isChecked()){
					hobby.append(",").append(mchkReadBook.getText().toString());
				}
				String city=mspinCity.getSelectedItem().toString();
				User user=new User(userName, firmPwd, sex,city, hobby.toString());
				Log.i("main",user.toString());
				Toast.makeText(MainActivity.this, "注册成功,"+user.toString(), Toast.LENGTH_LONG).show();
			}
		}
	}
}
