package com.example.baidumapwalkrouteoverlay;

import com.baidu.mapapi.BMapManager;
import com.baidu.mapapi.GeoPoint;
import com.baidu.mapapi.MKAddrInfo;
import com.baidu.mapapi.MKBusLineResult;
import com.baidu.mapapi.MKDrivingRouteResult;
import com.baidu.mapapi.MKGeneralListener;
import com.baidu.mapapi.MKPlanNode;
import com.baidu.mapapi.MKPoiResult;
import com.baidu.mapapi.MKSearch;
import com.baidu.mapapi.MKSearchListener;
import com.baidu.mapapi.MKSuggestionResult;
import com.baidu.mapapi.MKTransitRouteResult;
import com.baidu.mapapi.MKWalkingRouteResult;
import com.baidu.mapapi.MapActivity;
import com.baidu.mapapi.MapView;
import com.baidu.mapapi.RouteOverlay;
import com.baidu.mapapi.TransitOverlay;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Toast;
/**
 * 实现公交换乘，步行
 * @author Administrator
 *
 */
public class MainActivity extends MapActivity {
	MapView mapView;
	BMapManager bMapManager;
	MKSearch mkSearch;
	String key = "C0EF05A481CAA729C2EE7AF6152EE1868FA1E755";
	MKPlanNode start, end;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mapView = (MapView) findViewById(R.id.bmapview);
		bMapManager = new BMapManager(this);
		bMapManager.init(key, new MKGeneralListener() {

			@Override
			public void onGetPermissionState(int arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onGetNetworkState(int arg0) {
				// TODO Auto-generated method stub
				if (arg0 == 300) {
					Toast.makeText(MainActivity.this, "输入的key有误", 1);
				}
			}
		});
		initMapActivity(bMapManager);
		mkSearch = new MKSearch();
		mkSearch.init(bMapManager, new MysearchListener());
		start = new MKPlanNode();
		start.pt = new GeoPoint((int) (39.915 * 1e6), (int) (116.404 * 1e6));
		end = new MKPlanNode();
		end.pt = new GeoPoint(40057034, 116307852);
		mkSearch.walkingSearch(null, start, null, end);
		mkSearch.transitSearch("北京", start, end);
	}

	class MysearchListener implements MKSearchListener {

		@Override
		public void onGetAddrResult(MKAddrInfo arg0, int arg1) {
			// TODO Auto-generated method stub

		}

		@Override
		public void onGetBusDetailResult(MKBusLineResult arg0, int arg1) {
			// TODO Auto-generated method stub

		}

		@Override
		public void onGetDrivingRouteResult(MKDrivingRouteResult arg0, int arg1) {
			// TODO Auto-generated method stub

		}

		@Override
		public void onGetPoiDetailSearchResult(int arg0, int arg1) {
			// TODO Auto-generated method stub

		}

		@Override
		public void onGetPoiResult(MKPoiResult arg0, int arg1, int arg2) {
			// TODO Auto-generated method stub

		}

		@Override
		public void onGetRGCShareUrlResult(String arg0, int arg1) {
			// TODO Auto-generated method stub

		}

		@Override
		public void onGetSuggestionResult(MKSuggestionResult arg0, int arg1) {
			// TODO Auto-generated method stub

		}

		@Override
		public void onGetTransitRouteResult(MKTransitRouteResult arg0, int arg1) {
			// TODO Auto-generated method stub
			if(arg0==null){
				return;
			}
			TransitOverlay overlay=new TransitOverlay(MainActivity.this, mapView);
			overlay.setData(arg0.getPlan(0));
			mapView.getOverlays().add(overlay);
			mapView.invalidate();
		}

		@Override
		public void onGetWalkingRouteResult(MKWalkingRouteResult arg0, int arg1) {
			// TODO Auto-generated method stub
			if (arg0 == null) {
				return;
			}
			RouteOverlay overlay = new RouteOverlay(MainActivity.this, mapView);
			overlay.setData(arg0.getPlan(0).getRoute(0));
			mapView.getOverlays().add(overlay);
			mapView.invalidate();
		}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	protected boolean isRouteDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		if (bMapManager != null) {
			bMapManager.destroy();
		}
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		if (bMapManager != null) {
			bMapManager.start();
		}
	}
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		if(bMapManager!=null){
			bMapManager.stop();
		}
	}

}
