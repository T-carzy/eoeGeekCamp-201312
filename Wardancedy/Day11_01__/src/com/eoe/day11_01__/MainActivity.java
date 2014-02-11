package com.eoe.day11_01__;

import java.util.ArrayList;

import com.eoe.day11_01__.entity.GeneralInfo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
		//�����Զ��������������
		GeneralAdapter adapter=new GeneralAdapter();
		//������������ListView
		lvGeneral.setAdapter(adapter);
	}

	private void initGenerals() {
		mGenerals=new ArrayList<GeneralInfo>();
		GeneralInfo general=new GeneralInfo(R.drawable.baiqi, "����");
		mGenerals.add(general);
		general=new GeneralInfo(R.drawable.caocao, "�ܲ�");
		mGenerals.add(general);
		general=new GeneralInfo(R.drawable.chengjisihan, "�ɼ�˼��");
		mGenerals.add(general);
		general=new GeneralInfo(R.drawable.hanxin, "����");
		mGenerals.add(general);
		general=new GeneralInfo(R.drawable.lishimin, "������");
		mGenerals.add(general);
		general=new GeneralInfo(R.drawable.nuerhachi, "Ŭ������");
		mGenerals.add(general);
		general=new GeneralInfo(R.drawable.sunbin, "����");
		mGenerals.add(general);
		general=new GeneralInfo(R.drawable.sunwu, "����");
		mGenerals.add(general);
		general=new GeneralInfo(R.drawable.yuefei, "����");
		mGenerals.add(general);
		general=new GeneralInfo(R.drawable.zhuyuanzhang, "��Ԫ�");
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
			//����1����ȡ�б���Ĳ���
			View layout=View.inflate(MainActivity.this, R.layout.general_item, null);
			//����2����ȡlayout�е�ImageView
			ImageView ivGeneral=(ImageView) layout.findViewById(R.id.ivGeneral);
			//����3����ȡlayhout�е�TextView
			TextView tvGeneral=(TextView) layout.findViewById(R.id.tvGeneral);
			//����4����ȡ��ǰ���¼ҵĶ���
			GeneralInfo general=mGenerals.get(position);
			//����5������ǰ���¼ҵ�ͷ����ʾ��ivGeneral�ؼ���
			ivGeneral.setImageResource(general.getPhotoid());
			//����6������ǰ���¼ҵ�������ʾ��tvGeneral�ؼ���
			tvGeneral.setText(general.getName());
			return layout;
		}
		
	}

}
