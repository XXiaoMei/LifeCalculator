package com.msquirrel.ui;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;

import android.widget.ListView;

import com.msquirrel.adapter.WeChatAdapter;

import com.msquirrel.bean.UserInfo;
import com.special.ResideMenuDemo.R;

public class MainActivity extends Activity {

	private ListView mListView = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.healthbar);
		mListView = (ListView) findViewById(R.id.lv_main);
	
		// mListView.setDividerHeight(0);
		setData();
	}

	
	private void setData() {
		List<UserInfo> mList = new ArrayList();
		UserInfo mUserInfo = new UserInfo();
		
		mList.add(mUserInfo);
		//---------------------------------------------
		UserInfo mUserInfo2 = new UserInfo();
		
		mList.add(mUserInfo2);	

		WeChatAdapter mWeChatAdapter = new WeChatAdapter(this);
		mWeChatAdapter.setData(mList);
		mListView.setAdapter(mWeChatAdapter);
	}

	

}
