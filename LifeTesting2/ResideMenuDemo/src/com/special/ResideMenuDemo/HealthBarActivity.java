package com.special.ResideMenuDemo;

import com.special.ResideMenu.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class HealthBarActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	requestWindowFeature(Window.FEATURE_NO_TITLE);
    	super.onCreate(savedInstanceState);
        setContentView(R.layout.healthbar);
        LinearLayout mainLayout=(LinearLayout)findViewById(R.id.mainLayout);
        FrameLayout fLayout=(FrameLayout)findViewById(R.id.flayout);
        fLayout.setBackgroundResource(R.drawable.faxian);
        LinearLayout.LayoutParams lps= new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT);
        LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(100,100);
        for(int i=0;i<pics.length;i++){
        	//创建子布局存放图片和简介
        	LinearLayout childLayout=new LinearLayout(this);
        	childLayout.setOrientation(LinearLayout.HORIZONTAL);
        	childLayout.setPadding(2, 5, 2, 5);
        	childLayout.setLayoutParams(lps);
        	ImageView iv = new ImageView(this);//创建健康吧图片组件
        	iv.setImageResource(pics[i]);//设置资源图片
        	iv.setLayoutParams(params);//设置图片组件参数对象
        	TextView tv = new TextView(this);//创建健康吧文字说明
        	tv.setPadding(5, 5, 5, 5);//设置文本间距
        	tv.setText(titles[i]);//设置文本内容
        	childLayout.addView(iv);
        	childLayout.addView(tv);
        	mainLayout.addView(childLayout);       	
        }
    }
    //个人头像说明
    private int[] pics=
    	{R.drawable.ico1,R.drawable.ico2,R.drawable.ico3,R.drawable.ico4,R.drawable.ico5,R.drawable.ico6};
    //健康吧内容数组
    private String[] titles=
    	{"适量的紫外线能促进钙质的吸收，对预防骨质疏松、佝偻病有好处，但过量的紫外线会大大增加患皮肤癌的危险，还会增加皱纹。",
    		"如果能经常使用牙线，就可以减少牙周炎的发生，不刷牙则会减寿一年。",
    		"吃甜食过多，会引起高脂血症、动脉硬化、肥胖症、高血压病、冠心病、糖尿病和骨质疏松等疾病，还会促发乳腺癌，加速细胞的老化，使人体环境适应能力差等。",
    		"快餐在营养学家眼中是高热、高脂、高蛋白的“垃圾食品”，会导致肥胖、糖尿病、癌症等各种慢性疾病。",
    		"降低体内的铁质很可能会减缓老化过程，并让人能够避免跟老化有关的疾病，可以让寿命增加。",
    		"如果排便不规律，每天清晨起来一杯凉白开，就能解决这个问题。"};
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.health_bar, menu);
        return true;
    }
    
}
