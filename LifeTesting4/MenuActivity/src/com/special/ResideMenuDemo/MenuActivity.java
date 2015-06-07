package com.special.ResideMenuDemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.special.ResideMenu.ResideMenu;
import com.special.ResideMenu.ResideMenuItem;

public class MenuActivity extends FragmentActivity implements View.OnClickListener{

    private ResideMenu resideMenu;
    private MenuActivity mContext;
    private ResideMenuItem itemTesting;
    private ResideMenuItem itemMe;
    private ResideMenuItem itemHistory;
    private ResideMenuItem itemHealthBar;
    private TextView title;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        title=(TextView)findViewById(R.id.title);
        mContext = this;
        setUpMenu();
        if( savedInstanceState == null )
            changeFragment(new TestingFragment());
    }

    private void setUpMenu() {

        // attach to current activity;
        resideMenu = new ResideMenu(this);
        resideMenu.setBackground(R.drawable.menu_background);
        resideMenu.attachToActivity(this);
        resideMenu.setMenuListener(menuListener);
        //valid scale factor is between 0.0f and 1.0f. leftmenu'width is 150dip. 
        resideMenu.setScaleValue(0.6f);

        // create menu items;
        itemTesting  = new ResideMenuItem(this, R.drawable.icon_testing,"Testing");
        itemMe = new ResideMenuItem(this, R.drawable.icon_me, "Me");
        itemHistory  = new ResideMenuItem(this, R.drawable.icon_history,  "History");
        itemHealthBar = new ResideMenuItem(this, R.drawable.icon_bar, "HealthBar");

        itemTesting.setOnClickListener(this);
        itemMe.setOnClickListener(this);
        itemHistory.setOnClickListener(this);
        itemHealthBar.setOnClickListener(this);

        resideMenu.addMenuItem(itemTesting, ResideMenu.DIRECTION_LEFT);
        resideMenu.addMenuItem(itemMe, ResideMenu.DIRECTION_LEFT);
        resideMenu.addMenuItem(itemHistory, ResideMenu.DIRECTION_RIGHT);
        resideMenu.addMenuItem(itemHealthBar, ResideMenu.DIRECTION_RIGHT);

        // You can disable a direction by setting ->
        // resideMenu.setSwipeDirectionDisable(ResideMenu.DIRECTION_RIGHT);

        findViewById(R.id.title_bar_left_menu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resideMenu.openMenu(ResideMenu.DIRECTION_LEFT);
            }
        });
        findViewById(R.id.title_bar_right_menu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resideMenu.openMenu(ResideMenu.DIRECTION_RIGHT);
            }
        });
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        return resideMenu.dispatchTouchEvent(ev);
    }

    @Override
    public void onClick(View view) {

        if (view == itemTesting){
            changeFragment(new TestingFragment());
            title.setText("Test");
        }else if (view == itemMe){
            changeFragment(new MeFragment());
            title.setText("Me");
        }else if (view == itemHistory){
        	title.setText("History");
            changeFragment(new HistoryFragment());
        }else if (view == itemHealthBar){
        	title.setText("HealthBar");
            changeFragment(new HealthBarFragment());
        }

        resideMenu.closeMenu();
    }

    private ResideMenu.OnMenuListener menuListener = new ResideMenu.OnMenuListener() {
        @Override
        public void openMenu() {
            Toast.makeText(mContext, "Menu is opened!", Toast.LENGTH_SHORT).show();
        }

        @Override
        public void closeMenu() {
            Toast.makeText(mContext, "Menu is closed!", Toast.LENGTH_SHORT).show();
        }
    };

    private void changeFragment(Fragment targetFragment){
        resideMenu.clearIgnoredViewList();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.main_fragment, targetFragment, "fragment")
                .setTransitionStyle(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .commit();
    }

    // What good method is to access resideMenu锛�
    public ResideMenu getResideMenu(){
        return resideMenu;
    }
}
