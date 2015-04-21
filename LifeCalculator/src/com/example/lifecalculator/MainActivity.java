package com.example.lifecalculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener{

	private int[] layoutId={R.layout.main1,R.layout.main2,R.layout.main3,R.layout.main4,
			R.layout.main5,R.layout.main6,R.layout.main7,R.layout.main8,R.layout.main9,
			R.layout.main10,R.layout.main11,R.layout.main12,R.layout.main13,R.layout.main14};

	private int i=0;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layoutId[i]);
        
      	Button last=(Button)findViewById(R.id.button1);
   	 if(i==0){//设置上一页不可见
       	   last.setVisibility(View.INVISIBLE);
          }
   	last.setOnClickListener(this);
   	
   	Button next=(Button)findViewById(R.id.button2);
   	next.setOnClickListener(this);

    }

    public void initbtn(){
    	Button last=(Button)findViewById(R.id.button1);
    	 if(i==0){//设置上一页不可见
        	   last.setVisibility(View.INVISIBLE);
           }
    	last.setOnClickListener(this);
    	
    	Button next=(Button)findViewById(R.id.button2);
    	next.setOnClickListener(this);
    }

    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

	@Override
	public void onClick(View v) {
		if(v.getId()==R.id.button1){
			i=i-1;
			 setContentView(layoutId[i]);
			 initbtn();
		}else if(v.getId()==R.id.button2){
			i=i+1;
			setContentView(layoutId[i]);
			initbtn();
		}
		
	}
    
}
