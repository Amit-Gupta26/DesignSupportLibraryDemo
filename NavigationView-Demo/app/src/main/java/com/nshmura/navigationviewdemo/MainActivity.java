package com.nshmura.navigationviewdemo;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout mDrawerLayout;
    private NavigationView mNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mNavigationView = (NavigationView) findViewById(R.id.navigation_view);
        mNavigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem menuItem) {
        menuItem.setChecked(true);
        mDrawerLayout.closeDrawer(mNavigationView);

        switch (menuItem.getItemId()) {
            case R.id.drawer_item_home:
                //TODO open home
                break;
            case R.id.drawer_item_mypage:
                //TODO open mypage
                break;
            case R.id.drawer_item_wishlist:
                //TODO open wishlist
                break;
            case R.id.drawer_item_user:
                //TODO open user
                break;
            case R.id.drawer_item_account:
                //TODO open account
                break;
        }

        return true;
    }
}