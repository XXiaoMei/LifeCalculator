package com.example.login;

import com.special.ResideMenuDemo.MenuActivity;
import com.special.ResideMenuDemo.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class LoginTab extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.logintab);
	}
	public void myclick(View view){
		//µÇÂ¼´¦Àí
		//Toast.makeText(this,"µÇÂ¼ÖÐ...",Toast.LENGTH_LONG).show();
		Intent intent=new Intent(LoginTab.this,MenuActivity.class);
		startActivity(intent);
		finish();
	}
	

}
