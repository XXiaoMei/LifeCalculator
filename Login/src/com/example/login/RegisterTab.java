package com.example.login;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class RegisterTab extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.registertab);
	}
	public void myclick(View view){
		//ע�ᴦ��
		Toast.makeText(this,"ע����...",Toast.LENGTH_LONG).show();
	}

}
