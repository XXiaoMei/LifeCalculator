package com.example.login;
import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.Toast;
public class MainActivity extends TabActivity{
	private TabHost tabHost;
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tabHost=getTabHost();
		Intent loginIntent=new Intent(this,LoginTab.class);
		tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator("登录").setContent(loginIntent));
		Intent registerIntent=new Intent(this,RegisterTab.class);
		tabHost.addTab(tabHost.newTabSpec("tab2").setIndicator("注册").setContent(registerIntent));
		tabHost.setCurrentTabByTag("tag2");
		tabHost.setOnTabChangedListener(new OnTabChangeListener(){
			@Override
			public void onTabChanged(String tabId){
				Toast.makeText(MainActivity.this, "当前选中"+tabId+"标签", Toast.LENGTH_LONG).show();
			}
		});
	}
}
