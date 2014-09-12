package com.eoe.elts.activity;

import java.io.Serializable;

import com.eoe.elts.R;
import com.eoe.elts.biz.IExamBiz;
import com.eoe.elts.entity.User;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainMenuActivity extends Activity {
	IExamBiz examBiz;
	TextView mtvWelcome;
	 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		// �������˵����ڵ���ʾҳ��
		setContentView(R.layout.main_menu);
		//����һ��Activity��ȡ��Intent����
		Intent intent=getIntent();
		examBiz=(IExamBiz) intent.getSerializableExtra("exambiz");
		mtvWelcome=(TextView) findViewById(R.id.tvWelcome);
		//ȡ����½�ɹ��߶���
		User user=examBiz.getUser();
		mtvWelcome.setText("��ӭ"+user.getName()+"�μӿ���");
	}
	public void beginExam(View v){
		Thread t=new Thread(){
			@Override
			public void run() {
				examBiz.loadQuestions();//���ؿ���
			}
		};
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Intent intent=new Intent(this, ExamActivity.class);
		intent.putExtra("exambiz", (Serializable)examBiz);
		startActivity(intent);
	}
	public void exit(View v){
		finish();
	}
}
