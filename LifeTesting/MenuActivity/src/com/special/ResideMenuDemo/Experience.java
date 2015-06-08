package com.special.ResideMenuDemo;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Experience extends Activity {
	
	private ListView list;
	private List<HashMap<String, Object>> experienceData;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_experience);
		list = (ListView)findViewById(R.id.experienceListView);
		
		experienceData = getData();
		
		experienceAdapter adapter = new experienceAdapter(this);
		list.setAdapter(adapter);
		list.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Experience.this, ExperienceDetail.class);
				HashMap<String, Object> hash = experienceData.get(position);
				//intent.putExtra("data", (Serializable)data);
				//intent.putExtra("position", position);
				intent.putExtra("url", hash.get("url").toString());
				startActivity(intent);
			}
			
		});
	}


	private List<HashMap<String, Object>> getData() {
		// TODO Auto-generated method stub
		List<HashMap<String,Object>> list = new ArrayList<HashMap<String, Object>>();
		HashMap<String, Object> map;
		for (int i = 0; i < 10 ; i++) {
			map = new HashMap<String, Object>();
			if(i % 6 == 0) {
				map.put("image", R.drawable.ico1);
				map.put("title", "中医养生之道 养生需坚持12个习惯");
				map.put("date", "2014-12-15");
				map.put("url", "http://health.pclady.com.cn/124/1242582.html");
			}
			if( i % 6 == 1) {
				map.put("image", R.drawable.ico2);
				map.put("title", "“清心”养生法 中华养生之道 ");
				map.put("date", "2014-11-27 ");
				map.put("url", "http://health.pclady.com.cn/123/1236215.html");
			}
			if( i % 6 == 2) {
				map.put("image", R.drawable.ico3);
				map.put("title", "水润秋燥 肌肤的秋季养生之道");
				map.put("date", "2014-10-21");
				map.put("url", "http://beauty.pclady.com.cn/121/1217322.html");
			
			}
			if( i % 6 == 3) {
				map.put("image", R.drawable.ico4);
				map.put("title", "女人不同的特殊时期的养生之道");
				map.put("date", "2014-09-03");
				map.put("url", "http://health.pclady.com.cn/119/1197789.html");
			
				
			}
			if( i % 6 == 4) {
				map.put("image", R.drawable.ico5);
				map.put("title", "养生之道 日常养生警惕“五久”伤身");
				map.put("date", "2014-09-02");
				map.put("url", "http://health.pclady.com.cn/119/1195741.html");
			

			}
			if( i % 6 == 5) {
				map.put("image", R.drawable.ico6);
				map.put("title", "苹果能做茶 养生之道大发现");
				map.put("date", "2014-04-29");
				map.put("url", "http://health.pclady.com.cn/113/1132855.html");
			

			}
			
			list.add(map);
		}
		return list;
	}
	/*
	private List<HashMap<String, Object>> getData() throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		
		
		String url = "http://192.168.1.102:8080/zhidao/getJobMsgServlet";
        List<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
        //测试参数
		String params = ""; 
		SyncHttp syncHttp = new SyncHttp();
		
		
		try {
			System.out.println("-----------------------------");
			String retStr = syncHttp.httpGet(url, params);
			//System.out.println("-----------------------------"+retStr);
			JSONObject jsonObject = new JSONObject(retStr);
			int retCode = jsonObject.getInt("retMsg");
			if (retCode == 0 ) {
				JSONObject dataObject = jsonObject.getJSONObject("data");
				int totalnum = dataObject.getInt("totalnum");
				System.out.println(totalnum);
				
				if (totalnum > 0 ) {
					JSONArray infList = dataObject.getJSONArray("MsgList");
					for (int i = 0 ; i < infList.length(); i++) {
						JSONObject infObject = (JSONObject) infList.opt(i);
						HashMap<String, Object> hashMap = new HashMap<String, Object>();
						hashMap.put("title", infObject.getString("title"));
						hashMap.put("date", infObject.getString("date"));
						hashMap.put("url", infObject.getString("link"));
						list.add(hashMap);
					}
				}
			}  else {
				return list;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			//return list;
		}
		return list;
	}
	*/
	static class ViewHolder {
		public ImageView img;
		public TextView title;
		public TextView date;
	}
	
	public class experienceAdapter extends BaseAdapter {
		private LayoutInflater mInflater = null;
		 
		private experienceAdapter (Context context) {
			this.mInflater = LayoutInflater.from(context);
		}
		
		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return experienceData.size();
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return position;
		}
		
		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return position;
		}
		
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// TODO Auto-generated method stub
			ViewHolder holder = null;
			if (convertView == null) {
				holder = new ViewHolder();
				convertView = mInflater.inflate(R.layout.activity_experience_item, null);
				holder.img = (ImageView)convertView.findViewById(R.id.experienceListImg);
				holder.title = (TextView)convertView.findViewById(R.id.experienceListTitle);
				holder.date = (TextView)convertView.findViewById(R.id.experienceListDate);
				convertView.setTag(holder);	
			} else {
				holder = (ViewHolder) convertView.getTag();
			}
			
			holder.img.setBackgroundResource((Integer)experienceData.get(position).get("image"));
			holder.title.setText((String)experienceData.get(position).get("title"));
			holder.date.setText((String)experienceData.get(position).get("date"));
			return convertView;
		}
		
	}
}
