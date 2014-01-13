package com.example.com.ityw.eoe.day09_01;

import com.eoe.day09.entity.*;

import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MyListener implements OnClickListener {
	EditText metUserName,metPwd,metFirmPwd;
	Spinner mspinCity;
	CheckBox mchkReadBook,mchkTour,mchkGame;
	RadioButton mrdMale,mrdFemale;
	MainActivity mContext;
	

	public MyListener(MainActivity mainActivity, EditText metUserName2,
			EditText metPwd2, EditText metFirmPwd2, Spinner mspinCity2,
			CheckBox mchkReadBook2, CheckBox mchkTour2, CheckBox mchkGame2,
			RadioButton mrdMale2, RadioButton mrdFemale2) {
		// TODO Auto-generated constructor stub
	}


	public void MyListenr(EditText metUserName, EditText metPwd, EditText metFirmPwd,
			Spinner mspinCity, CheckBox mchkReadBook, CheckBox mchkTour,
			CheckBox mchkGame, RadioButton mrdMale, RadioButton mrdFemale,
			MainActivity mContext) {
		//super();
		this.metUserName = metUserName;
		this.metPwd = metPwd;
		this.metFirmPwd = metFirmPwd;
		this.mspinCity = mspinCity;
		this.mchkReadBook = mchkReadBook;
		this.mchkTour = mchkTour;
		this.mchkGame = mchkGame;
		this.mrdMale = mrdMale;
		this.mrdFemale = mrdFemale;
		this.mContext = mContext;
	}

	
	@Override
	public void onClick(View v) {
		switch(v.getId()){
		case R.id.btnExit:
			mContext.finish();
			break;
		case R.id.btnRegister:
			String userName=metUserName.getText().toString();
			if(userName.length()==0){
				metUserName.setError("用户名不能为空");
				return;
			}
			String pwd=metPwd.getText().toString();
				if(pwd.length()==0){
					metPwd.setError("密碼不能為空");
					return;
				}
			String 	firmPwd=metFirmPwd.getText().toString();
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
				sex=mrdMale.getText().toString().charAt(0);
			}else{
				sex=mrdFemale.getText().toString().charAt(0);
			}
			StringBuilder hobby=new StringBuilder("爱好:");
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
			User user=new User(userName,firmPwd,sex,city,hobby.toString());
			Log.i("main",user.toString());
			Toast.makeText(mContext, "注册成功，"+user.toString(), 
					Toast.LENGTH_LONG).show();
			break;
		}

	}

}
