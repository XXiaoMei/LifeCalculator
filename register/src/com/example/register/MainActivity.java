package com.example.register;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		//获取屏幕的大小
		DisplayMetrics displayMetrics = new DisplayMetrics();
		getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
		Constant.displayWidth = displayMetrics.widthPixels;
		Constant.displayHeight = displayMetrics.heightPixels;
		suit();
		init();
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
	public void suit()
	{
		RelativeLayout  r1 = (RelativeLayout) findViewById(R.id.register_layout1);
		RelativeLayout.LayoutParams param = (RelativeLayout.LayoutParams)r1.getLayoutParams();
		param.height = (int)(Constant.displayHeight * 0.12);
		r1.setLayoutParams(param);
		
		TextView name = (TextView)findViewById(R.id.register_name);
		name.setGravity(Gravity.CENTER);
		LayoutParams nameparam = (LayoutParams)name.getLayoutParams();
		nameparam.height = (int)(Constant.displayHeight * 0.07);
		name.setLayoutParams(nameparam);
		
		EditText editname = (EditText)findViewById(R.id.register_editname);
		LayoutParams editnameparam = (LayoutParams)editname.getLayoutParams();
		editnameparam.height = (int)(Constant.displayHeight * 0.07);
		editname.setLayoutParams(editnameparam);
		
		EditText check = (EditText)findViewById(R.id.register_check);
		LayoutParams checkparam = (LayoutParams)check.getLayoutParams();
		checkparam.height = (int)(Constant.displayHeight * 0.07);
		check.setLayoutParams(checkparam);
		
		Button sendcheck = (Button)findViewById(R.id.register_sendcheck);
		LayoutParams sendcheckparam = (LayoutParams)sendcheck.getLayoutParams();
		sendcheckparam.height = (int)(Constant.displayHeight * 0.07);
		sendcheck.setLayoutParams(sendcheckparam);
		
		EditText code = (EditText)findViewById(R.id.register_code);
		LayoutParams codeparam = (LayoutParams)code.getLayoutParams();
		codeparam.height = (int)(Constant.displayHeight * 0.07);
		code.setLayoutParams(codeparam);
		
		Button register = (Button)findViewById(R.id.register_register);
		LayoutParams registerparam = (LayoutParams)register.getLayoutParams();
		registerparam.height = (int)(Constant.displayHeight * 0.15);
		register.setLayoutParams(registerparam);
	}
	public void init()
	{
		Button register = (Button)findViewById(R.id.register_register);
		register.setOnClickListener(new MyOnclickedListener(this));
	}
	
	class MyOnclickedListener implements OnClickListener
	{

		private Context context;
		
		public MyOnclickedListener(Context context)
		{
			this.context = context;
		}
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent intent = new Intent(context,Achieve.class);
			context.startActivity(intent);
		}
		
	}
}
