package com.eoe.day12_;

import java.util.ArrayList;
import java.util.HashMap;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

public class MainActivity extends BaseActivity 
implements OnItemClickListener,OnItemLongClickListener{
	static final String PHOTO_KEY = "photoid";
	static final String NAME_KEY = "name";
	ListView mlvGenearl;
	ArrayList<HashMap<String, Object>> mGenerals;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mlvGenearl =findViewById_(R.id.lvGenerals);
		initGenerals();
		SimpleAdapter adapter=new SimpleAdapter(this,
			mGenerals,
			R.layout.general_item, 
			new String[]{PHOTO_KEY, NAME_KEY},
			new int[]{R.id.ivGeneral,R.id.tvGeneral});
		mlvGenearl.setAdapter(adapter);
		mlvGenearl.setOnItemClickListener(this);
		mlvGenearl.setOnItemLongClickListener(this);
	}

	private void initGenerals() {
		mGenerals = new ArrayList<HashMap<String, Object>>();
		// 创建代表第一个军事家的HashMap对象
		HashMap<String, Object> general = new HashMap<String, Object>();
		general.put(PHOTO_KEY, R.drawable.baiqi);
		general.put(NAME_KEY, "白起");
		mGenerals.add(general);
		// 创建代表第二个军事家的HashMap对
		general = new HashMap<String, Object>();
		general.put(PHOTO_KEY, R.drawable.caocao);
		general.put(NAME_KEY, "曹操");
		mGenerals.add(general);
		// 创建代表第三个军事家的HashMap对
		general = new HashMap<String, Object>();
		general.put(PHOTO_KEY, R.drawable.chengjisihan);
		general.put(NAME_KEY, "成吉思汗");
		mGenerals.add(general);
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		HashMap<String, Object> general=mGenerals.get(position);
		String name=general.get(NAME_KEY).toString();
		Toast.makeText(this, name+"被选择", 3000).show();
	}

	@Override
	public boolean onItemLongClick(AdapterView<?> parent, View view,
			int position, long id) {
		HashMap<String, Object> general=mGenerals.get(position);
		String name=general.get(NAME_KEY).toString();
		Toast.makeText(this, name+"被长按", 3000).show();
		return true;
	}
}
