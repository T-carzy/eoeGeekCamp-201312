package com.example.linearlayout;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
Button Login,Exit;
EditText etName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    private void initView() {
		etName = (EditText) findViewById(R.id.etName);
		
		
	}
    public void exit(View v){
    	finish();
    }
    
    public void login(View v){

			String userName=etName.getText().toString();
			String regex="[\\w]{4,10}";
			if(userName.matches(regex)){
				Toast.makeText(this, "注册成功", 3000).show();
			}else
			{
				etName.setError("注册格式不正确");
			}
	

		}
    }



    

