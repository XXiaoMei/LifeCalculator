package com.special.ResideMenuDemo;

import java.io.Serializable;
import java.util.ArrayList;

import com.msquirrel.bean.PageEntity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;

public class MainActivity extends Activity {

	private ViewPager pager;
	private ArrayList<PageEntity> list;
	private TextView timu;
	private RadioGroup rg;
	private LinearLayout linear;
	private TextView last;
	private TextView next;
	WindowManager wm;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		wm = (WindowManager)this.getSystemService(Context.WINDOW_SERVICE);
		last=(TextView)findViewById(R.id.last);
		next=(TextView)findViewById(R.id.next);
		pager=(ViewPager)findViewById(R.id.square_viewpager);
		list=new ArrayList<PageEntity>();
		last.setText("");
		init();
		pager.setAdapter(new ImageAdapter(MainActivity.this,list));
			next.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					pager.setCurrentItem(pager.getCurrentItem()+1);
				}
			});
			
		
		last.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				pager.setCurrentItem(pager.getCurrentItem()-1);
			}
		});
		
		pager.setOnPageChangeListener(new OnPageChangeListener() {
			
			@Override
			public void onPageSelected(int arg0) {
				System.out.println("position--》"+arg0);
				if(pager.getCurrentItem()==0){
					last.setText("");
				}else{
					last.setText("上一页");
				}
				
				if(pager.getCurrentItem()==list.size()-1){
					next.setText("提交");
				}else{
					next.setText("下一页");
				}
				if(next.getText().toString().equals("下一页")){
					System.out.println(next.getText().toString());
					next.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View v) {
							pager.setCurrentItem(pager.getCurrentItem()+1);
						}
					});
					}else if(next.getText().toString().equals("提交")){
						next.setOnClickListener(new OnClickListener() {
							
							@Override
							public void onClick(View v) {
								Intent intent=new Intent(MainActivity.this,GetScores.class);
								intent.putExtra("list", (Serializable) list); 
								//intent.putExtra("position", position);
								startActivity(intent);
								finish();
							}
						});
						
					}
			}
			
			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onPageScrollStateChanged(int arg0) {
				// TODO Auto-generated method stub
				
			}
		});
	}

	public void init(){
		PageEntity p0=new PageEntity("你的性别");
		p0.setChoices("男", "女");
		list.add(p0);
		
		PageEntity p1=new PageEntity("你是否已婚");
		p1.setChoices("是", "不是");
		list.add(p1);
		
		PageEntity p2=new PageEntity("你和家人之间联系密切，与朋友经常相聚");
		p2.setChoices("是", "不是");
		list.add(p2);
		
		PageEntity p3=new PageEntity("评估你目前的压力水平");
		p3.setChoices("低", "高");
		list.add(p3);
		
		PageEntity p4=new PageEntity("你是否善于减压");
		p4.setChoices("善于","不善于");
		list.add(p4);
		
		PageEntity p5=new PageEntity("每天的睡眠时间");
		p5.setChoices("3~5个小时","6小时以上");
		list.add(p5);
		
		PageEntity p6=new PageEntity("你接受过多少年的正规教育");
		p6.setChoices("16年以上","低于8年");
		list.add(p6);
		
		PageEntity p7=new PageEntity("你一周工作多少小时");
		p7.setChoices("低于40小时","40至60个小时");
		list.add(p7);
		
		PageEntity p8=new PageEntity("你对人生逐渐走向衰老感到乐观");
		p8.setChoices("乐观","悲观");
		list.add(p8);
		
		PageEntity p9=new PageEntity("你居住的地方空气质量很好");
		p9.setChoices("很好","很差");
		list.add(p9);
		
		PageEntity p10=new PageEntity("当你在私家车中，你总是会系好安全带");
		p10.setChoices("是","不是");
		list.add(p10);
		
		PageEntity p11=new PageEntity("你每天喝多少杯含有咖啡因的咖啡");
		p11.setChoices("2杯以下","3杯以上");
		list.add(p11);
		
		PageEntity p12=new PageEntity("你每天喝2~3杯绿茶 ");
		p12.setChoices("是","不是");
		list.add(p12);
		
		PageEntity p13=new PageEntity("你吸烟或暴露在二手烟的环境 ");
		p13.setChoices("是","不是");
		list.add(p13);
		
		PageEntity p14=new PageEntity("你每天都吸烟 ");
		p14.setChoices("是","不是");
		list.add(p14);
		
		PageEntity p15=new PageEntity("你每天吸多少支烟");
		p15.setChoices("10支以内","20支以内","40支以上","从来不吸");
		list.add(p15);
		
		PageEntity p16=new PageEntity("你每天饮用啤酒超过3杯，或含酒精的饮品超过3杯，或4杯白酒");
		p16.setChoices("是","不是");
		list.add(p16);
		
		PageEntity p17=new PageEntity("你每天服用一片阿司匹林");
		p17.setChoices("是","不是");
		list.add(p17);
		
		PageEntity p18=new PageEntity("阳光下你会涂抹防晒油来保护皮肤吗");
		p18.setChoices("很少","会做好防护");
		list.add(p18);
		
		PageEntity p19=new PageEntity("你没有从事危险性行为，也不注射违法药物");
		p19.setChoices("很少","会做好防护");
		list.add(p19);
		
		PageEntity p20=new PageEntity("你每天都用牙线洁牙吗");
		p20.setChoices("是","不是");
		list.add(p20);
		
		PageEntity p21=new PageEntity("你一周吃多少次快餐和熟食");
		p21.setChoices("从来不吃","5次以上");
		list.add(p21);
		
		PageEntity p22=new PageEntity("你很少吃烧烤的鱼，家禽或肉类");
		p22.setChoices("是","不是");
		list.add(p22);
		
		PageEntity p23=new PageEntity("你每天会补充钙");
		p23.setChoices("是","不是");
		list.add(p23);
		
		PageEntity p24=new PageEntity("如果在正餐之间吃零食，通常你会选择干果");
		p24.setChoices("是","不是");
		list.add(p24);
		
		PageEntity p25=new PageEntity("你常吃大量的甜食，如冰激凌，蛋糕，糖果等");
		p25.setChoices("是","不是");
		list.add(p25);
		
		PageEntity p26=new PageEntity("我每天都吃的很多，肥胖");
		p26.setChoices("是","不是");
		list.add(p26);
		
		PageEntity p27=new PageEntity("你不会把铁作为营养素的一部分来补充");
		p27.setChoices("是","不是");
		list.add(p27);
		
		PageEntity p28=new PageEntity("你一周有多少天能达到至少锻炼30分钟");
		p28.setChoices("每周7天","每周3天","我很少锻炼");
		list.add(p28);
		
		PageEntity p29=new PageEntity("你排便是否规律");
		p29.setChoices("是","不是");
		list.add(p29);
		
		PageEntity p30=new PageEntity("你的总胆固醇水平高于180mg/dl(5mmol/L)");
		p30.setChoices("是","不是","不知道");
		list.add(p30);
		
		PageEntity p31=new PageEntity("你心脏的收缩压是多少");
		p31.setChoices("低于120","高于230","不知道");
		list.add(p31);
		
		PageEntity p32=new PageEntity("你心脏的舒张压低于80");
		p32.setChoices("是","不是","不知道");
		list.add(p32);
		
		PageEntity p33=new PageEntity("你每年都做血糖检测");
		p33.setChoices("是","不是");
		list.add(p33);
		
		PageEntity p34=new PageEntity("你的心脏两年前发作过，但后来也没有采取任何措施来预防它再次发作");
		p34.setChoices("是","不是","不知道");
		list.add(p34);
		
		PageEntity p35=new PageEntity("你的直系亲属中是否从来没有患过糖尿病者或者心脏病者");
		p35.setChoices("是","不是","不知道");
		list.add(p35);
		
		PageEntity p36=new PageEntity("直系亲属中是否有三位或更多的人患有癌症");
		p36.setChoices("是","不是","不知道");
		list.add(p36);
		
		PageEntity p37=new PageEntity("你母亲活到90岁以上");
		p37.setChoices("是","不是","不知道");
		list.add(p37);
		
		PageEntity p38=new PageEntity("你父亲活到90岁以上");
		p38.setChoices("是","不是","不知道");
		list.add(p38);
		
		PageEntity p39=new PageEntity("你的祖父母或曾祖父母中有达到或超过98岁高龄的");
		p39.setChoices("是","不是","不知道");
		list.add(p39);
		
		PageEntity p40=new PageEntity("你没有借助任何人工生育手段生育最后一个孩子时是多少岁");
		p40.setChoices("35~43岁","35岁以下");
		list.add(p40);
	}
	
	void listAdd(String title,String...choices){
		PageEntity p=new PageEntity(title);
		
	}

	
	
	private final class ImageAdapter extends PagerAdapter {

//		private static final String[] IMAGE_URLS = Constants.IMAGES;

		private LayoutInflater inflater;
		ArrayList<PageEntity> list;
		Context context;

		ImageAdapter(Context context,ArrayList<PageEntity> list) {
			this.context=context;
			inflater = LayoutInflater.from(context);
			this.list=list;
			
		}

		@Override
		public void destroyItem(ViewGroup container, int position, Object object) {
			container.removeView((View) object);
		}

		@Override
		public int getCount() {
			return list.size();
		}

		@Override
		public Object instantiateItem(ViewGroup view,final int position) {
			View imageLayout = inflater.inflate(R.layout.viewpageritem, view, false);
			assert imageLayout != null;
			
			
			System.out.println("pos-->"+pager.getCurrentItem());
			
			linear=(LinearLayout)imageLayout.findViewById(R.id.linear);
			timu=(TextView)imageLayout.findViewById(R.id.timu);
			timu.setText(list.get(position).getTitle());
			rg=(RadioGroup)imageLayout.findViewById(R.id.radiogroup);
			System.out.println("length-->"+list.get(position).getChoices().length);
			for (int i = 0; i <list.get(position).getChoices().length; i++) {
				RadioButton radioButton = new RadioButton(context);
				radioButton.setWidth(wm.getDefaultDisplay().getWidth());
				radioButton.setText(list.get(position).getChoices()[i]);
				radioButton.setId(i);
				rg.addView(radioButton);
				}
			if(list.get(position).getSelect()!=-1){//已选
				rg.check(list.get(position).getSelect());
			}else{//未选
				
			}
			rg.setOnCheckedChangeListener(new OnCheckedChangeListener() {
				
				@Override
				public void onCheckedChanged(RadioGroup group, int checkedId) {
					System.out.println(checkedId);
					list.get(position).setSelect(checkedId);
					pager.setCurrentItem(pager.getCurrentItem()+1);
					
				}
			});
			view.addView(imageLayout, 0);
			return imageLayout;
		}

		@Override
		public boolean isViewFromObject(View view, Object object) {
			return view.equals(object);
		}

		@Override
		public void restoreState(Parcelable state, ClassLoader loader) {
		}

		@Override
		public Parcelable saveState() {
			return null;
		}
		
	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		if(next.getText().toString().equals("下一页")){
			System.out.println(next.getText().toString());
			next.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					pager.setCurrentItem(pager.getCurrentItem()+1);
				}
			});
			}else if(next.getText().toString().equals("提交")){
				next.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
						Intent intent=new Intent(MainActivity.this,GetScores.class);
						intent.putExtra("list", (Serializable) list); 
						//intent.putExtra("position", position);
						startActivity(intent);
					}
				});
				
			}
	}

}
