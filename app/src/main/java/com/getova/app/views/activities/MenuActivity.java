package com.getova.app.views.activities;

import android.app.Activity;
import android.os.Bundle;

import com.getova.app.R;
import com.getova.app.views.fragments.MenuListFragment;

public class MenuActivity extends Activity {

    private MenuListFragment mMenuListFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        mMenuListFragment = MenuListFragment.newInstance();

        getFragmentManager()
                .beginTransaction()
                .replace(R.id.content, mMenuListFragment)
                .commit();
    }
}
