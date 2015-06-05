package com.example.sqlite1;



import com.special.ResideMenuDemo.R;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class SQLiteActivity extends Activity{
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.registertab);
		final EditText id = (EditText)findViewById(R.id.id);
		final EditText password = (EditText)findViewById(R.id.password);
		final RadioGroup sex = (RadioGroup)findViewById(R.id.sex);
		final TextView showTime = (TextView)findViewById(R.id.showTime);
		final Button register = (Button)findViewById(R.id.register);
		final SQLiteDatabase db = SQLiteDatabase.openOrCreateDatabase(this.getFilesDir().toString()+"user.db3",null);
		try{
			db.execSQL("create table student(id ingeter,password integer(50),sex varchar(20),showTime varchar(50))");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		register.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// TODO Auto-generated method stub
				String i=id.getText().toString();
				String p=password.getText().toString();
				String s=sex.getContext().toString();
				String h=showTime.getText().toString();
				db.execSQL("insret into user values(?,?,?,?)",new String[]{i,p,s,h});
				Toast.makeText(SQLiteActivity.this,"×¢²á³É¹¦£¡",Toast.LENGTH_SHORT).show();
			}
		});
		
	}

}
