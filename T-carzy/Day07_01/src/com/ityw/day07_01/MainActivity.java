package com.ityw.day07_01;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.app.Activity;
/**
 * 演示注册页面的创建，包含：CheckBox、RadioButton、RadioGroup、Spinner标签
 * 的定义。
 * @author yw
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //按钮被点击时，系统将自动调用onClick()
    public void onClick(View v){
    	if(v.getTag().toString().equals("linear_layout")){
    		setContentView(R.layout.linearlayout_reigster);
    	}else if(v.getTag().toString().equals("relative_layout")){
    		setContentView(R.layout.relativelayout_register);
    	}else if(v.getTag().toString().equals("table_layout")){
    		setContentView(R.layout.tablelayout_register);
    	}else if(v.getTag().toString().equals("grid_layout")){
    		setContentView(R.layout.gridlayout_register);
    	}
    	//在日志窗口的main标签中输出Button.tag属性的值
    	Log.i("main",v.getTag().toString());
    }
}
