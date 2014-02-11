package com.example.day15;

import java.util.Timer;
import java.util.TimerTask;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends BaseActivity {
	TextView mtvLeftTime;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mtvLeftTime = findViewById_(R.id.tvLeftTime);
	}

	public void start(View v) {
		long startTime = System.currentTimeMillis();
		final long endTime = startTime + 1000 * 60 * 10;
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			long minute;
			long second;

			@Override
			public void run() {
				long leftTime = endTime - System.currentTimeMillis();
				minute = leftTime / 1000 / 60;
				second = leftTime / 1000 % 60;
				runOnUiThread(new Runnable() {

					@Override
					public void run() {
						mtvLeftTime.setText(minute + ":" + second);
					}
				});
			}
		}, 0, 1000);
	}

}
