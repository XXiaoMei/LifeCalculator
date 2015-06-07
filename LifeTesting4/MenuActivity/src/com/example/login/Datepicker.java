package com.example.login;

import java.util.Calendar;

import com.special.ResideMenuDemo.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.DatePicker.OnDateChangedListener;
import android.widget.TextView;

public class Datepicker extends Activity{
	private int year,month,date;
	private TextView showTime;
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.registertab);
		showTime =(TextView)findViewById(R.id.showTime);
		DatePicker datePicker=(DatePicker)findViewById(R.id.datePicker);
		Calendar c1=Calendar.getInstance();//获取当前的年月日
		year=c1.get(Calendar.YEAR);
		month=c1.get(Calendar.MONTH);
		date=c1.get(Calendar.DAY_OF_MONTH);//设置时间选择器默认为当前时间
		//在init方法中初始化日期选择器为当前日期，并添加监听器
		datePicker.init(year, month, date, new OnDateChangedListener(){
			public void onDateChanged(DatePicker dp,int year,int month,int day){
				Datepicker.this.year=year;
				Datepicker.this.month=month;
				Datepicker.this.date=day;
				show(year,month,date);//在Text中显示修改过的日期
			}
		});
	}
	private void show(int year,int month,int day){
		String str=year+"-"+(month+1)+"-"+day+" ";
		showTime.setText(str);
	}

}
