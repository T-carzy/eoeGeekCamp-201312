package com.example.day13;

import java.util.ArrayList;
import java.util.List;


import android.os.Bundle;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends BaseActivity implements OnItemLongClickListener{
	List<GeneralInfo> mGenerals;
	GridView mgvGeneral;
	GeneralAdapter mAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initGeneral();
		initView();
	}

	private void initView() {
		mgvGeneral = findViewById_(R.id.gvGeneral);
		mAdapter = new GeneralAdapter();
		mgvGeneral.setAdapter(mAdapter);
		mgvGeneral.setOnItemLongClickListener(this);
	}

	private void initGeneral() {
		Resources res = getResources();
		String[] names = res.getStringArray(R.array.generals);
		int[] photoId = { R.drawable.baiqi, R.drawable.caocao,
				R.drawable.chengjisihan, R.drawable.hanxin,
				R.drawable.lishimin, R.drawable.nuerhachi, R.drawable.sunbin,
				R.drawable.sunwu, R.drawable.yuefei, R.drawable.zhuyuanzhang };
		mGenerals = new ArrayList<GeneralInfo>();
		GeneralInfo general;
		for (int i = 0; i < photoId.length; i++) {
			general = new GeneralInfo();
			general.setPothoId(photoId[i]);
			general.setName(names[i]);
			mGenerals.add(general);
		}
	}

	class GeneralAdapter extends BaseAdapter {

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return mGenerals.size();
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public View getView(int position, View layout, ViewGroup parent) {
			// TODO Auto-generated method stub
			layout = View.inflate(MainActivity.this, R.layout.general_item,
					null);
			ImageView ivGeneral = (ImageView) layout
					.findViewById(R.id.ivGeneral);
			TextView tvGeneral = (TextView) layout.findViewById(R.id.tvGeneral);
			GeneralInfo general = mGenerals.get(position);
			ivGeneral.setImageResource(general.getPothoId());
			tvGeneral.setText(general.getName());
			return layout;
		}

	}

	@Override
	public boolean onItemLongClick(AdapterView<?> arg0, View layout, int position,
			long id) {
		GeneralInfo general=mGenerals.get(position);
		Toast.makeText(this, general.getName()+"±»Ñ¡Ôñ",Toast.LENGTH_LONG).show();
		return true;
	}

}
