package com.example.day11_01;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.day11_01.entity.GeneralInfo;

public class MainActivity extends Activity {

	ArrayList<GeneralInfo> mGenerals;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initGenerals();
		ListView lvGeneral = (ListView) findViewById(R.id.lvGeneral);
	}

	private void initGenerals() {
		// TODO Auto-generated method stub
		mGenerals = new ArrayList<GeneralInfo>();
		GeneralInfo general = new GeneralInfo(R.drawable.baiqi, "°×Æð");
		mGenerals.add(general);
		general = new GeneralInfo(R.drawable.caocao, "²Ü²Ù");
		mGenerals.add(general);
		general=new GeneralInfo(R.drawable.chengjisihan,"³É¼ªË¼º¹");
		mGenerals.add(general);
		general=new GeneralInfo(R.drawable.hanxin, "º«ÐÅ");
		mGenerals.add(general);
		general=new GeneralInfo(R.drawable.lishimin, "ÀîÊÀÃñ");
		mGenerals.add(general);
		general=new GeneralInfo(R.drawable.nuerhachi, "Å¬¶û¹þ³à");
		mGenerals.add(general);
		general=new GeneralInfo(R.drawable.sunbin, "Ëïë÷");
		mGenerals.add(general);
		general=new GeneralInfo(R.drawable.sunwu, "ËïÎä");
		mGenerals.add(general);
		general=new GeneralInfo(R.drawable.yuefei, "ÔÀ·É");
		mGenerals.add(general);
		general=new GeneralInfo(R.drawable.zhuyuanzhang, "ÖìÔªè°");
		mGenerals.add(general);

	}
	class GeneralAdapter extends BaseAdapter{
		 
		 

	@Override
public int getCount(){
		
		return mGenerals.size();
	}
	@Override
	public Object getItem(int position){
		return mGenerals.get(position);
	}
	@Override
	public long getItemId(int position){
		return position;
	}
	@Override
	public View getView(int position,View convertView,ViewGroup parent){
		View layout =View.inflate(MainActivity.this,R.layout.general_main,null);
		ImageView ivGeneral=(ImageView) layout.findViewById(R.id.ivGeneral);
		TextView tvGeneral=(TextView) layout.findViewById(R.id.tvGeneral);
		
		GeneralInfo general=mGenerals.get(position);
		
		ivGeneral.setImageResource(general.getPhotoid());
		tvGeneral.setText(general.getName());
		
		return layout;
	
	}
}
}
