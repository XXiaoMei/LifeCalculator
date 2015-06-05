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
				System.out.println("position--��"+arg0);
				if(pager.getCurrentItem()==0){
					last.setText("");
				}else{
					last.setText("��һҳ");
				}
				
				if(pager.getCurrentItem()==list.size()-1){
					next.setText("�ύ");
				}else{
					next.setText("��һҳ");
				}
				if(next.getText().toString().equals("��һҳ")){
					System.out.println(next.getText().toString());
					next.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View v) {
							pager.setCurrentItem(pager.getCurrentItem()+1);
						}
					});
					}else if(next.getText().toString().equals("�ύ")){
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
		PageEntity p0=new PageEntity("����Ա�");
		p0.setChoices("��", "Ů");
		list.add(p0);
		
		PageEntity p1=new PageEntity("���Ƿ��ѻ�");
		p1.setChoices("��", "����");
		list.add(p1);
		
		PageEntity p2=new PageEntity("��ͼ���֮����ϵ���У������Ѿ������");
		p2.setChoices("��", "����");
		list.add(p2);
		
		PageEntity p3=new PageEntity("������Ŀǰ��ѹ��ˮƽ");
		p3.setChoices("��", "��");
		list.add(p3);
		
		PageEntity p4=new PageEntity("���Ƿ����ڼ�ѹ");
		p4.setChoices("����","������");
		list.add(p4);
		
		PageEntity p5=new PageEntity("ÿ���˯��ʱ��");
		p5.setChoices("3~5��Сʱ","6Сʱ����");
		list.add(p5);
		
		PageEntity p6=new PageEntity("����ܹ���������������");
		p6.setChoices("16������","����8��");
		list.add(p6);
		
		PageEntity p7=new PageEntity("��һ�ܹ�������Сʱ");
		p7.setChoices("����40Сʱ","40��60��Сʱ");
		list.add(p7);
		
		PageEntity p8=new PageEntity("�������������˥�ϸе��ֹ�");
		p8.setChoices("�ֹ�","����");
		list.add(p8);
		
		PageEntity p9=new PageEntity("���ס�ĵط����������ܺ�");
		p9.setChoices("�ܺ�","�ܲ�");
		list.add(p9);
		
		PageEntity p10=new PageEntity("������˽�ҳ��У������ǻ�ϵ�ð�ȫ��");
		p10.setChoices("��","����");
		list.add(p10);
		
		PageEntity p11=new PageEntity("��ÿ��ȶ��ٱ����п�����Ŀ���");
		p11.setChoices("2������","3������");
		list.add(p11);
		
		PageEntity p12=new PageEntity("��ÿ���2~3���̲� ");
		p12.setChoices("��","����");
		list.add(p12);
		
		PageEntity p13=new PageEntity("�����̻�¶�ڶ����̵Ļ��� ");
		p13.setChoices("��","����");
		list.add(p13);
		
		PageEntity p14=new PageEntity("��ÿ�춼���� ");
		p14.setChoices("��","����");
		list.add(p14);
		
		PageEntity p15=new PageEntity("��ÿ��������֧��");
		p15.setChoices("10֧����","20֧����","40֧����","��������");
		list.add(p15);
		
		PageEntity p16=new PageEntity("��ÿ������ơ�Ƴ���3�����򺬾ƾ�����Ʒ����3������4���׾�");
		p16.setChoices("��","����");
		list.add(p16);
		
		PageEntity p17=new PageEntity("��ÿ�����һƬ��˾ƥ��");
		p17.setChoices("��","����");
		list.add(p17);
		
		PageEntity p18=new PageEntity("���������ͿĨ��ɹ��������Ƥ����");
		p18.setChoices("����","�����÷���");
		list.add(p18);
		
		PageEntity p19=new PageEntity("��û�д���Σ������Ϊ��Ҳ��ע��Υ��ҩ��");
		p19.setChoices("����","�����÷���");
		list.add(p19);
		
		PageEntity p20=new PageEntity("��ÿ�춼�����߽�����");
		p20.setChoices("��","����");
		list.add(p20);
		
		PageEntity p21=new PageEntity("��һ�ܳԶ��ٴο�ͺ���ʳ");
		p21.setChoices("��������","5������");
		list.add(p21);
		
		PageEntity p22=new PageEntity("����ٳ��տ����㣬���ݻ�����");
		p22.setChoices("��","����");
		list.add(p22);
		
		PageEntity p23=new PageEntity("��ÿ��Ჹ���");
		p23.setChoices("��","����");
		list.add(p23);
		
		PageEntity p24=new PageEntity("���������֮�����ʳ��ͨ�����ѡ��ɹ�");
		p24.setChoices("��","����");
		list.add(p24);
		
		PageEntity p25=new PageEntity("�㳣�Դ�������ʳ��������裬���⣬�ǹ���");
		p25.setChoices("��","����");
		list.add(p25);
		
		PageEntity p26=new PageEntity("��ÿ�춼�Եĺܶ࣬����");
		p26.setChoices("��","����");
		list.add(p26);
		
		PageEntity p27=new PageEntity("�㲻�������ΪӪ���ص�һ����������");
		p27.setChoices("��","����");
		list.add(p27);
		
		PageEntity p28=new PageEntity("��һ���ж������ܴﵽ���ٶ���30����");
		p28.setChoices("ÿ��7��","ÿ��3��","�Һ��ٶ���");
		list.add(p28);
		
		PageEntity p29=new PageEntity("���ű��Ƿ����");
		p29.setChoices("��","����");
		list.add(p29);
		
		PageEntity p30=new PageEntity("����ܵ��̴�ˮƽ����180mg/dl(5mmol/L)");
		p30.setChoices("��","����","��֪��");
		list.add(p30);
		
		PageEntity p31=new PageEntity("�����������ѹ�Ƕ���");
		p31.setChoices("����120","����230","��֪��");
		list.add(p31);
		
		PageEntity p32=new PageEntity("�����������ѹ����80");
		p32.setChoices("��","����","��֪��");
		list.add(p32);
		
		PageEntity p33=new PageEntity("��ÿ�궼��Ѫ�Ǽ��");
		p33.setChoices("��","����");
		list.add(p33);
		
		PageEntity p34=new PageEntity("�����������ǰ��������������Ҳû�в�ȡ�κδ�ʩ��Ԥ�����ٴη���");
		p34.setChoices("��","����","��֪��");
		list.add(p34);
		
		PageEntity p35=new PageEntity("���ֱϵ�������Ƿ����û�л��������߻������ಡ��");
		p35.setChoices("��","����","��֪��");
		list.add(p35);
		
		PageEntity p36=new PageEntity("ֱϵ�������Ƿ�����λ�������˻��а�֢");
		p36.setChoices("��","����","��֪��");
		list.add(p36);
		
		PageEntity p37=new PageEntity("��ĸ�׻90������");
		p37.setChoices("��","����","��֪��");
		list.add(p37);
		
		PageEntity p38=new PageEntity("�㸸�׻90������");
		p38.setChoices("��","����","��֪��");
		list.add(p38);
		
		PageEntity p39=new PageEntity("����游ĸ�����游ĸ���дﵽ�򳬹�98������");
		p39.setChoices("��","����","��֪��");
		list.add(p39);
		
		PageEntity p40=new PageEntity("��û�н����κ��˹������ֶ��������һ������ʱ�Ƕ�����");
		p40.setChoices("35~43��","35������");
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
			if(list.get(position).getSelect()!=-1){//��ѡ
				rg.check(list.get(position).getSelect());
			}else{//δѡ
				
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
		if(next.getText().toString().equals("��һҳ")){
			System.out.println(next.getText().toString());
			next.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					pager.setCurrentItem(pager.getCurrentItem()+1);
				}
			});
			}else if(next.getText().toString().equals("�ύ")){
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
