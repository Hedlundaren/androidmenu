package com.example.startmenu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//----------MENU 1---------------------------------------
		Button mn1 = (Button) findViewById(R.id.menu1);
		mn1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				startActivity(new Intent("com.example.startmenu.MENUONE"));
			}
		});
		
		//----------MENU 2---------------------------------------
		Button mn2 = (Button) findViewById(R.id.menu2);
		mn2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				startActivity(new Intent("com.example.startmenu.MENUTWO"));
			}
		});
		//--------------------------------------------------------
		
		
		
		
	}
	
	
	

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}
	
	

}
