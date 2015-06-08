package com.special.ResideMenuDemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class ExperienceDetail extends Activity {
	private WebView webView;
	
	
	private int display = 0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_information_detail);
		
		
		webView = (WebView) findViewById(R.id.detailWebView);
		
		
		
		
		//获取传递的数据
		Intent intent = getIntent();
		Bundle bundle = intent.getExtras();
		String url = bundle.getString("url");
		
		webView.loadUrl(url);
		WebSettings websettings = webView.getSettings();
		websettings.setJavaScriptEnabled(true);
		
		webView.setWebViewClient(new WebViewClient());
		
		
		
	}
}
