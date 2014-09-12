package com.example.day15_;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
TextView mtvLeftTime;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mtvLeftTime=(TextView) findViewById(R.id.tvLeftTime);
	}
public void start(View v){
	long startTime=System.currentTimeMillis();
	final long endTime=startTime+1000*20;
	long breakTime=startTime+1000*10;
	final Timer timer=new Timer();
	timer.schedule(new TimerTask() {
		long minute;
		long second;
		@Override
		public void run() {
		long leftTime=endTime-System.currentTimeMillis();
		minute=leftTime/1000/60;
		second=leftTime/1000%60;
			runOnUiThread(new Runnable() {
				
				@Override
				public void run() {
				mtvLeftTime.setText(minute+":"+second);
					
				}
			});
		}
	}, 0,1000);
	Date endDate=new Date(breakTime);
	timer.schedule(new TimerTask() {
		
		@Override
		public void run() {
			timer.cancel();
	        runOnUiThread(new Runnable() {
				
				@Override
				public void run() {
			
					
				}
			});
			
		}
	}, endDate);
}
public void standardDialog(View v){
	AlertDialog.Builder builder=new AlertDialog.Builder(this);
	builder.setIcon(R.drawable.ic_launcher);
	builder.setTitle("考试时间");
	builder.setMessage("亲，考试时间到了");
	builder.setPositiveButton("返回", new OnClickListener() {
		
		@Override
		public void onClick(DialogInterface arg0, int arg1) {
			finish();
			
		}
	});
	AlertDialog dialog=builder.create();
	dialog.show();
}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
