package com.example.mjdemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecActivity extends Activity {
	private Button btn_get;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sec);
		btn_get = (Button) findViewById(R.id.btn_get);
		btn_get.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(SecActivity.this, "加入成功",Toast.LENGTH_SHORT).show();
			}
		});
	}

	

}
