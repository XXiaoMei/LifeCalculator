package com.example.register;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Achieve extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_achieve);
		suit();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.achieve, menu);
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
		RelativeLayout  r1 = (RelativeLayout) findViewById(R.id.achieve_layout1);
		RelativeLayout.LayoutParams param = (RelativeLayout.LayoutParams)r1.getLayoutParams();
		param.height = (int)(Constant.displayHeight * 0.3);
		r1.setLayoutParams(param);
		
		TextView name = (TextView)findViewById(R.id.achieve_name);
		name.setGravity(Gravity.CENTER);
		LayoutParams nameparams = (LayoutParams)name.getLayoutParams();
		nameparams.height = (int)(Constant.displayHeight * 0.07);
		name.setLayoutParams(nameparams);
		
		EditText editname = (EditText)findViewById(R.id.achieve_editname);
		LayoutParams editnameparams = (LayoutParams)editname.getLayoutParams();
		editnameparams.height = (int)(Constant.displayHeight * 0.07);
		editname.setLayoutParams(editnameparams);
		
		TextView password = (TextView)findViewById(R.id.achieve_password);
		password.setGravity(Gravity.CENTER);
		LayoutParams passwordparams = (LayoutParams)password.getLayoutParams();
		passwordparams.height = (int)(Constant.displayHeight * 0.07);
		password.setLayoutParams(passwordparams);
		
		EditText editpassword = (EditText)findViewById(R.id.achieve_editpassword);
		LayoutParams editpasswordparams = (LayoutParams)editpassword.getLayoutParams();
		editpasswordparams.height = (int)(Constant.displayHeight * 0.07);
		editpassword.setLayoutParams(editpasswordparams);
		
		TextView check = (TextView)findViewById(R.id.achieve_check);
		check.setGravity(Gravity.CENTER);
		LayoutParams checkparams = (LayoutParams)check.getLayoutParams();
		checkparams.height = (int)(Constant.displayHeight * 0.07);
		check.setLayoutParams(checkparams);
		
		EditText editcheck = (EditText)findViewById(R.id.achieve_editcheck);
		LayoutParams editcheckparams = (LayoutParams)editcheck.getLayoutParams();
		editcheckparams.height = (int)(Constant.displayHeight * 0.07);
		editcheck.setLayoutParams(editcheckparams);
		
		RelativeLayout  r2 = (RelativeLayout) findViewById(R.id.achieve_layout2);
		RelativeLayout.LayoutParams param2 = (RelativeLayout.LayoutParams)r2.getLayoutParams();
		param.height = (int)(Constant.displayHeight * 0.4);
		r2.setLayoutParams(param2);
	}
}
