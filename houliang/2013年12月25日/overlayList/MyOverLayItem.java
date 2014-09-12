package com.example.baidumap;
import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.Toast;
import com.baidu.mapapi.GeoPoint;
import com.baidu.mapapi.ItemizedOverlay;
import com.baidu.mapapi.MapView;
import com.baidu.mapapi.OverlayItem;

public class MyOverLayItem extends ItemizedOverlay<OverlayItem>{
	Drawable drawable;
	MapView mapView;
	Context context;
	private List<OverlayItem> list=new ArrayList<OverlayItem>();
	private double latitude1=39.90923;//γ��
	private double longitude1=116.397428;//����
	
	private double latitude2=39.90548;
	private double longitude2=116.370348;
	
	private double latitude4=39.91548;
	private double longitude4=116.340348;
	
	private double latitude3=39.9022;
	private double longitude3=116.359000;
	//�����ڵ�ͼ�ϱ�ʶ���꣬��һ��ͼƬ��ע
	public MyOverLayItem(Drawable drawable, MapView mapView,Context context) {
		super(drawable);
		this.drawable = drawable;
		this.mapView = mapView;
		this.context=context;
		GeoPoint geoPoint1=new GeoPoint((int)(latitude1*1e6),(int)(longitude1*1e6));
		GeoPoint geoPoint2=new GeoPoint((int)(latitude2*1e6),(int)(longitude2*1e6));
		GeoPoint geoPoint3=new GeoPoint((int)(latitude3*1e6),(int)(longitude3*1e6));
		GeoPoint geoPoint4=new GeoPoint((int)(latitude4*1e6),(int)(longitude4*1e6));
		list.add(new OverlayItem(geoPoint1, "Point1", "Point1"));
		list.add(new OverlayItem(geoPoint2, "Point2", "Point2"));
		list.add(new OverlayItem(geoPoint3, "Point3", "Point3"));
		list.add(new OverlayItem(geoPoint4, "Point4", "Point4"));
		populate();
	}	
	//���ڷ���ָ��list�����е�ÿ������
	@Override
	protected OverlayItem createItem(int arg0) {
		return list.get(arg0);
	}
	//����list���ϵĳ���
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return list.size();
	}
	@Override
	public boolean onTap(int i) {
		//���д��������⣡��Ҫ��� �Ѿ�OK
		Toast.makeText(context, list.get(i).getSnippet(),1 ).show();
		return true;
	}
	
	
}
