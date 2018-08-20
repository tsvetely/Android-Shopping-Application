package com.getova.app.views.menu;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;
import android.widget.TextView;

import com.getova.app.R;

public class MenuTabListActivity extends Activity {

    private TextView mTextMessage;

//    final Fragment fragment1 = new MenuTabListFragment();
//    final Fragment fragment2 = new MyFavoritesListFragment();
//    final Fragment fragment3 = new OrderFragment();
//    final Fragment fragment4 = new HistoryFragment();
//    final FragmentManager fm = getSupportFragmentManager();
//    Fragment active = fragment1;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.menu_menu:
//                    fm.beginTransaction().hide(active).show(fragment1).commit();
//                    active = fragment1;
                    return true;
                case R.id.menu_favorites:
//                    fm.beginTransaction().hide(active).show(fragment2).commit();
//                    active = fragment2;
                    return true;
                case R.id.menu_order:
//                    fm.beginTransaction().hide(active).show(fragment3).commit();
//                    active = fragment2;
                    return true;
                case R.id.menu_history:
//                    fm.beginTransaction().hide(active).show(fragment4).commit();
//                    active = fragment4;
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_tab_list);

//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

//        fm.beginTransaction().add(R.id.main_container, fragment4, "4").hide(fragment4).commit();
//        fm.beginTransaction().add(R.id.main_container, fragment3, "3").hide(fragment3).commit();
//        fm.beginTransaction().add(R.id.main_container, fragment2, "2").hide(fragment2).commit();
//        fm.beginTransaction().add(R.id.main_container,fragment1, "1").commit();

        mTextMessage = (TextView) findViewById(R.id.message);
    }
}
