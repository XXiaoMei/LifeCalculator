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
		tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator("��¼").setContent(loginIntent));
		Intent registerIntent=new Intent(this,RegisterTab.class);
		tabHost.addTab(tabHost.newTabSpec("tab2").setIndicator("ע��").setContent(registerIntent));
		tabHost.setCurrentTabByTag("tag2");
		tabHost.setOnTabChangedListener(new OnTabChangeListener(){
			@Override
			public void onTabChanged(String tabId){
				Toast.makeText(MainActivity.this, "��ǰѡ��"+tabId+"��ǩ", Toast.LENGTH_LONG).show();
			}
		});
	}
}
