package com.example.startmenu;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
		setContentView(R.layout.splash);
        
        Thread logoTimer = new Thread(){
        	public void run(){
        		try{
        			sleep(1000);
        			Intent menuIntent = new Intent("com.example.startmenu.MENU");
        			startActivity(menuIntent);
        			
        		}catch(InterruptedException e){
        			e.printStackTrace();
        		}

        		finally{
        			finish();
        		}
        		
        	}
        };
        logoTimer.start();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
