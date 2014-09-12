package com.example.baidumap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import com.baidu.mapapi.GeoPoint;
import com.baidu.mapapi.MapView;
import com.baidu.mapapi.Overlay;

public class MyOverlay extends Overlay {
	MapView mapView;
public MyOverlay(MapView mapView) {
		super();
		this.mapView = mapView;
	}
GeoPoint geoPoint=new GeoPoint((int)(39.915*1E6), (int)(116.404*1E6));
private Paint paint=new Paint();//����һ�����ʹ���

@Override
public void draw(Canvas arg0, MapView arg1, boolean arg2) {
	// TODO Auto-generated method stub
	super.draw(arg0, arg1, arg2);
	Point point=mapView.getProjection().toPixels(geoPoint, null);
	arg0.drawText("�������찲��", point.x, point.y, paint);
}
}
