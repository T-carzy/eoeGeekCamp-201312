package com.example.day14_01;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	public void standardDialog(View v){
		AlertDialog.Builder builder=new AlertDialog.Builder(this);
		builder.setIcon(R.drawable.ic_launcher);
		builder.setTitle("标准对话框");
		builder.setMessage("亲，按时标准对话框");
		builder.setPositiveButton("返回", new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				finish();
			}
		});
		AlertDialog dialog=builder.create();
		dialog.show();
	}
	
		public void listDialog(View v){
			AlertDialog.Builder builder=new Builder(this);
			builder.setIcon(R.drawable.ic_launcher);
			builder.setTitle("列表对话框");
			final String[] items=new String[]{
					"星期一","星期二",
					"星期三","星期四","星期五",
					"星期六","星期日"
			};
			builder.setItems(items, new OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					Toast.makeText(MainActivity.this, items[which]+"被选择", 3000);
				}
			});
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
			builder.setTitle("自定义对话框");
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
