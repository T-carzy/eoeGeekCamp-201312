package com.example.tablelayout;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
Button login,exit;
EditText etName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        	login=(Button) findViewById(R.id.btnLogin);
        	
        	
        	etName=(EditText) findViewById(R.id.etName);
        	login.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					String userName=etName.getText().toString();
					String regex="[\\w]{4,10}";
					if(userName.matches(regex)){
						Toast.makeText(MainActivity.this, "注册成功", 3000).show();
					}else
					{
						etName.setError("注册格式不正确");
					}
				}
			});
        	exit=(Button) findViewById(R.id.btnExit);
        	exit.setOnClickListener(new Mylistener());
        	
    }
    public class Mylistener implements OnClickListener{

		@Override
		public void onClick(View v) {
			finish();
		}
    	
    }
    

  
    
}
