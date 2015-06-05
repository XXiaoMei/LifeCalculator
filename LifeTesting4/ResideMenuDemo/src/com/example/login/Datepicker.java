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
		Calendar c1=Calendar.getInstance();//��ȡ��ǰ��������
		year=c1.get(Calendar.YEAR);
		month=c1.get(Calendar.MONTH);
		date=c1.get(Calendar.DAY_OF_MONTH);//����ʱ��ѡ����Ĭ��Ϊ��ǰʱ��
		//��init�����г�ʼ������ѡ����Ϊ��ǰ���ڣ�����Ӽ�����
		datePicker.init(year, month, date, new OnDateChangedListener(){
			public void onDateChanged(DatePicker dp,int year,int month,int day){
				Datepicker.this.year=year;
				Datepicker.this.month=month;
				Datepicker.this.date=day;
				show(year,month,date);//��Text����ʾ�޸Ĺ�������
			}
		});
	}
	private void show(int year,int month,int day){
		String str=year+"-"+(month+1)+"-"+day+" ";
		showTime.setText(str);
	}

}
