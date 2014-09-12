package com.eoe.elts.activity;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import com.eoe.elts.R;
import com.eoe.elts.biz.ExamBiz;
import com.eoe.elts.biz.IExamBiz;
import com.eoe.elts.entity.ExamInfo;
import com.eoe.elts.entity.Question;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class ExamActivity extends Activity {
	IExamBiz examBiz;
	TextView mtvExamInfo;//��ʾ����ͷ��Ϣ�Ŀؼ�
	EditText metQuestion;//��ʾ��ǰ����Ŀؼ�
	CheckBox[] mchkOptions;//�ĸ���ѡ��ؼ�
	TextView mtvLeftTime;//��ʾʣ��ʱ��Ŀؼ�
	int mqid;//��ǰ���������
	ExamInfo examInfo;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.exam);
		Intent intent=getIntent();
		examBiz=(ExamBiz) intent.getSerializableExtra("exambiz");
		initView();//��ʼ���ؼ�
		beginExam();//��ʼ����
		startTime();//��ʼ����ʱ
	}
	private void startTime() {
		final Timer timer=new Timer();
		//��ȡ��ʼ���Ե�ʱ��
		long start=System.currentTimeMillis();
		//long limitTime=examInfo.getLimitTime()*60*1000; 
		long limitTime=60*1000;
		//������ʱ�䣬��λ������
		final long end=start+limitTime;
		timer.schedule(new TimerTask() {
			long minute,second;
			@Override
			public void run() {
				long leftTime=end-System.currentTimeMillis();
				minute=leftTime/1000/60;
				second=leftTime/1000%60;
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						mtvLeftTime.setText("ʣ��ʱ��:"+minute+":"+second);
					}
				});
			}
		}, 0,1000);
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						commit_();//����
					}
				});
				timer.cancel();
			}
		}, limitTime);
	}
	//��ʼ����
	private void beginExam() {
		//��ʼ����
		examInfo=examBiz.beginExam();
		//��ʾ����ͷ��Ϣ
		mtvExamInfo.setText(examInfo.toString());
		// ��ʾ��һ������
		metQuestion.setText(examBiz.getQuestion(mqid).toString());
		
	}
	//��ʼ���ؼ�
	private void initView() {
		mtvExamInfo=(TextView) findViewById(R.id.tvExamInfo);
		mtvLeftTime=(TextView) findViewById(R.id.tvLeftTime);
		metQuestion=(EditText) findViewById(R.id.etQuestion);
		mchkOptions=new CheckBox[4];
		mchkOptions[0]=(CheckBox) findViewById(R.id.chkA);
		mchkOptions[1]=(CheckBox) findViewById(R.id.chkB);
		mchkOptions[2]=(CheckBox) findViewById(R.id.chkC);
		mchkOptions[3]=(CheckBox) findViewById(R.id.chkD);
		
	}
	//��һ�ⰴť�ĵ���¼���Ӧ
	public void previous(View v){
		//���浱ǰ�����ѡ���
		examBiz.saveUserAnswers(mqid, getUserAnswers());
		if(mqid>0){
			mqid--;
		}
		//��ʾ�µĿ���͸ÿ����ѡ���
		refreshView();
	}
	//��ʾ�µĿ���͸ÿ����ѡ���
	private void refreshView() {
		Question question=examBiz.getQuestion(mqid);
		//��ʾ�µĿ���
		metQuestion.setText(question.toString());
		//����ĸ���ѡ��
		for(CheckBox chk:mchkOptions){
			chk.setChecked(false);
		}
		//ȡ������ѡ��Ĵ�
		ArrayList<String> userAnswers=question.getUserAnswers();
		//��ʾ�¿�����ѡ����Ĵ�
		for(String answer:userAnswers){
			//answer:A,B,C,D
			//       0,1,2,3
			char c=answer.charAt(0);
			mchkOptions[c-65].setChecked(true);
		}
	}
	//���ĸ���ѡ����ȡ���򹳵Ĵ�
	private ArrayList<String> getUserAnswers() {
		//����û�ѡ��Ĵ𰸵ļ���
		ArrayList<String> userAnswers=new ArrayList<String>();
		for(CheckBox chk:mchkOptions){
			if(chk.isChecked()){
				String text=chk.getText().toString();
				userAnswers.add(text);
			}
		}
		return userAnswers;
	}
	//��һ�ⰴť�ĵ���¼���Ӧ
	public void next(View v){
		examBiz.saveUserAnswers(mqid, getUserAnswers());
		if(mqid<examInfo.getQuestionCount()-1){
			mqid++;
		}
		refreshView();
	}
	//����ť����¼���Ӧ
	public void commit(View v){
		examBiz.saveUserAnswers(mqid, getUserAnswers());
		commit_();
	}
	void commit_(){
		AlertDialog.Builder builder=new AlertDialog.Builder(this);
		//���öԻ����һЩ����ֵ
		builder.setTitle("����");
		builder.setIcon(R.drawable.exam_commit32x32);
		builder.setMessage("���Ŀ��Գɼ���"+examBiz.over()+"��");
		builder.setPositiveButton("����", new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				finish();//�رտ��Դ���
			}
		});
		//�����Ի���
		AlertDialog dialog=builder.create();
		dialog.show();//��ʾ�Ի���
	}
}
