package com.example.frameanimation;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class MainActivity extends Activity {


	private ImageView imageView;

	private AnimationDrawable drawable;

	private OnClickListener onClickListener=new OnClickListener() {

		@Override
		public void onClick(View arg0) {
			switch (arg0.getId()) {
			case R.id.playBtn:
				drawable.start();
				break;

			case R.id.stopBtn:
				drawable.stop();
				break;
			}
		}
	};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		imageView=(ImageView) findViewById(R.id.myImage);
		imageView.setBackgroundResource(R.drawable.my_anim);
		drawable=(AnimationDrawable) imageView.getBackground();
		findViewById(R.id.playBtn).setOnClickListener(onClickListener);
		findViewById(R.id.stopBtn).setOnClickListener(onClickListener);
	}

}
