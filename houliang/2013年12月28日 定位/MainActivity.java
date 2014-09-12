package com.example.baidumap_location;
import android.os.Bundle;
import android.view.Menu;
import com.baidu.mapapi.BMapManager;
import com.baidu.mapapi.GeoPoint;
import com.baidu.mapapi.MKLocationManager;
import com.baidu.mapapi.MapActivity;
import com.baidu.mapapi.MapController;
import com.baidu.mapapi.MapView;
import com.baidu.mapapi.MyLocationOverlay;

public class MainActivity extends MapActivity {
	BMapManager mBMapMan = null;
	private MapView mMapView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initMap();
	}
	private void initMap() {
		mBMapMan = new BMapManager(getApplication());
		mBMapMan.init("C0EF05A481CAA729C2EE7AF6152EE1868FA1E755", null);
		initMapActivity(mBMapMan);
		mMapView = (MapView) findViewById(R.id.bmapsView);
		mMapView.setBuiltInZoomControls(true);
		showMyLocation();
	}
	MKLocationManager mLocationManager;
	private void showMyLocation() {
		// ��ʼ�� Location ģ��
		mLocationManager = mBMapMan.getLocationManager();
		// ͨ�� enableProvider �� disableProvider ������ѡ��λ�� Provider
		mLocationManager.enableProvider(MKLocationManager.MK_NETWORK_PROVIDER);
		// mLocationManager.disableProvider(MKLocationManager.MK_GPS_PROVIDER);
		// ��Ӷ�λͼ��
		MyLocationOverlay mylocTest = new MyLocationOverlay(this, mMapView);
		mylocTest.enableMyLocation(); // ���ö�λ
		mylocTest.enableCompass(); // ����ָ����
		mMapView.getOverlays().add(mylocTest);			
	}
	@Override
	protected void onDestroy() {
		super.onDestroy();
		if (mBMapMan != null) {
			mBMapMan.destroy();
		}
	}
	@Override
	protected void onResume() {
		super.onResume();
		if (mBMapMan != null) {
			mBMapMan.start();
		}
	}
	@Override
	protected void onPause() {
		super.onPause();
		if (mBMapMan != null) {
			mBMapMan.stop();
		}
	}
	@Override
	protected boolean isRouteDisplayed() {
		return false;
	}
}