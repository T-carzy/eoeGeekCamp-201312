package com.example.android_day11;

import java.util.ArrayList;

import entity.GeneralInfo;

import android.R.layout;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {
ArrayList<GeneralInfo>mGenerals;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initGenerals();
		ListView lvGeneral=(ListView) findViewById(R.id.lvGeneral);
		GeneralAdapter adapter=new GeneralAdapter();
		lvGeneral.setAdapter(adapter);
	}

	private void initGenerals() {
			mGenerals=new ArrayList<GeneralInfo>();
			GeneralInfo general=new GeneralInfo(R.drawable.baiqi,"白起");
			mGenerals.add(general);
		    general=new GeneralInfo(R.drawable.caocao,"曹操");
			mGenerals.add(general);
			general=new GeneralInfo(R.drawable.chengjisihan,"成吉思汗");
			mGenerals.add(general);
			general=new GeneralInfo(R.drawable.hanxin,"韩信");
			mGenerals.add(general);
			general=new GeneralInfo(R.drawable.lishimin,"李世明");
			mGenerals.add(general);
			general=new GeneralInfo(R.drawable.nuerhachi,"努尔哈赤");
			mGenerals.add(general);
			general=new GeneralInfo(R.drawable.sunbin,"孙膑");
			mGenerals.add(general);
			general=new GeneralInfo(R.drawable.sunwu,"孙武");
			mGenerals.add(general);
			general=new GeneralInfo(R.drawable.yuefei,"岳飞");
			mGenerals.add(general);
			general=new GeneralInfo(R.drawable.zhuyuanzhang,"朱元璋");
			mGenerals.add(general);
	}
		class GeneralAdapter extends BaseAdapter{

			@Override
			public int getCount() {

				return mGenerals.size();
			}

			@Override
			public Object getItem(int position) {
				return mGenerals.get(position);
			}

			@Override
			public long getItemId(int position) {
				return position;
			}

			@Override
			public View getView(int position, View convertView, ViewGroup parent) {
				View layout=View.inflate(MainActivity.this,R.layout.general_item, null);
				ImageView ivGeneral=(ImageView) layout.findViewById(R.id.ivGenreal);
				TextView tvGeneral=(TextView)layout.findViewById(R.id.tvGeneral);
				GeneralInfo general=mGenerals.get(position);
				ivGeneral.setImageResource(general.getPhotoid());
				tvGeneral.setText(general.getName());
				return layout;
			}
			
		}
	
}
