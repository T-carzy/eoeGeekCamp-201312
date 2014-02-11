package com.example.listview;

import java.util.ArrayList;

import com.eoe.day11_01_.entity.GeneralInfo;

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
ArrayList<GeneralInfo> mGenerals;//
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initGenerals();
		ListView lvGeneral=(ListView) findViewById(R.id.lvGeneral);
		//创建自定义的适配器对象
		GeneralAdapter adapter=new GeneralAdapter();
		//关联适配器和ListView
		lvGeneral.setAdapter(adapter);
		
	}

	private void initGenerals() {
		mGenerals=new ArrayList<GeneralInfo>();
		//GeneralInfo general=new GeneralInfo(R.drawable.baiqi, "白起");
		GeneralInfo general=new GeneralInfo(R.drawable.baiqi, "白起");
		mGenerals.add(general);
		general=new GeneralInfo(R.drawable.caocao, "曹操");
		mGenerals.add(general);
		general=new GeneralInfo(R.drawable.chengjisihan, "成吉思汗");
		mGenerals.add(general);
		general=new GeneralInfo(R.drawable.hanxin, "韩信");
		mGenerals.add(general);
		general=new GeneralInfo(R.drawable.lishimin, "李世民");
		mGenerals.add(general);
		general=new GeneralInfo(R.drawable.nuerhachi, "努尔哈赤");
		mGenerals.add(general);
		general=new GeneralInfo(R.drawable.sunbin, "孙膑");
		mGenerals.add(general);
		general=new GeneralInfo(R.drawable.sunwu, "孙武");
		mGenerals.add(general);
		general=new GeneralInfo(R.drawable.yuefei, "岳飞");
		mGenerals.add(general);
		general=new GeneralInfo(R.drawable.zhuyuanzhang, "朱元璋");
		mGenerals.add(general);
	
	}
class GeneralAdapter extends BaseAdapter{

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mGenerals.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return mGenerals.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View converView, ViewGroup parent) {
		//步骤1，获取列表项的布局
		View layout=View.inflate(MainActivity.this, R.layout.general_item, null);
		//步骤2，获取layout中的ImageView
		ImageView ivGeneral=(ImageView) layout.findViewById(R.id.ivGeneral);
		//步骤3，获取layout中的TextView
		TextView tvGeneral=(TextView) layout.findViewById(R.id.tvGeneral);
		int postion = 0 ;
		//步骤4，获取当前就女士家的对象
		GeneralInfo general=mGenerals.get(postion);
		//步骤5，将当前的军事家的头像显示在ivGeneral控件
		ivGeneral.setImageResource(general.getPhotoid());
		//步骤6，将当前军事家的姓名显示tvGeneral
		tvGeneral.setText(general.getName());
		return layout;
	}
	
}
//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.main, menu);
//		return true;
//	}

}
