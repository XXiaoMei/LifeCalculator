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
        	//�����Ӳ��ִ��ͼƬ�ͼ��
        	LinearLayout childLayout=new LinearLayout(this);
        	childLayout.setOrientation(LinearLayout.HORIZONTAL);
        	childLayout.setPadding(2, 5, 2, 5);
        	childLayout.setLayoutParams(lps);
        	ImageView iv = new ImageView(this);//����������ͼƬ���
        	iv.setImageResource(pics[i]);//������ԴͼƬ
        	iv.setLayoutParams(params);//����ͼƬ�����������
        	TextView tv = new TextView(this);//��������������˵��
        	tv.setPadding(5, 5, 5, 5);//�����ı����
        	tv.setText(titles[i]);//�����ı�����
        	childLayout.addView(iv);
        	childLayout.addView(tv);
        	mainLayout.addView(childLayout);       	
        }
    }
    //����ͷ��˵��
    private int[] pics=
    	{R.drawable.ico1,R.drawable.ico2,R.drawable.ico3,R.drawable.ico4,R.drawable.ico5,R.drawable.ico6};
    //��������������
    private String[] titles=
    	{"�������������ܴٽ����ʵ����գ���Ԥ���������ɡ����Ͳ��кô����������������߻������ӻ�Ƥ������Σ�գ������������ơ�",
    		"����ܾ���ʹ�����ߣ��Ϳ��Լ��������׵ķ�������ˢ��������һ�ꡣ",
    		"����ʳ���࣬�������֬Ѫ֢������Ӳ��������֢����Ѫѹ�������Ĳ������򲡺͹������ɵȼ���������ٷ����ٰ�������ϸ�����ϻ���ʹ���廷����Ӧ������ȡ�",
    		"�����Ӫ��ѧ�������Ǹ��ȡ���֬���ߵ��׵ġ�����ʳƷ�����ᵼ�·��֡����򲡡���֢�ȸ������Լ�����",
    		"�������ڵ����ʺܿ��ܻ�����ϻ����̣��������ܹ�������ϻ��йصļ������������������ӡ�",
    		"����ű㲻���ɣ�ÿ���峿����һ�����׿������ܽ��������⡣"};
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.health_bar, menu);
        return true;
    }
    
}
