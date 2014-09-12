package com.eoe.day14__01;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	//��׼�Ի���ť�ĵ���¼���Ӧ
	public void standardDialog(View v){
		AlertDialog.Builder builder=new AlertDialog.Builder(this);
		builder.setIcon(R.drawable.ic_launcher);
		builder.setTitle("��׼�Ի���");
		builder.setMessage("�ף����Ǹ���׼�Ի���");
		builder.setPositiveButton("����", new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				finish();//�رյ�ǰActivity
			}
		});
		AlertDialog dialog=builder.create();
		dialog.show();
	}
	//�б�Ի���
	public void listDialog(View v){
		AlertDialog.Builder builder=new Builder(this);
		builder.setIcon(R.drawable.ic_launcher);
		builder.setTitle("�б�Ի���");
		final String[] items=new String[]{"����һ","���ڶ�",
			"������","������","������","������","������"};
		builder.setItems(items, new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				Toast.makeText(MainActivity.this, 
					items[which]+"��ѡ��", 3000).show();
			}
		});
		//builder.show();//ֱ�Ӵ�������ʾ�Ի���
		AlertDialog dialog=builder.create();
		dialog.show();
	}
	public void customDialog(View v){
		View layout=View.inflate(this, R.layout.result, null);
		Button btnOK=(Button) layout.findViewById(R.id.btnOK);
		btnOK.setOnClickListener(new android.view.View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		AlertDialog.Builder builder=new Builder(this);
		builder.setIcon(R.drawable.ic_launcher);
		builder.setTitle("�Զ���Ի���");
		builder.setView(layout);
		final AlertDialog dialog=builder.create();
		dialog.show();
		Button btnCancel=(Button) layout.findViewById(R.id.btnCancel);
		btnCancel.setOnClickListener(new android.view.View.OnClickListener() {
			@Override
			public void onClick(View v) {
				dialog.dismiss();
			}
		});
	}
}
