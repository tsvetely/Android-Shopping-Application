package com.getova.app.views.activities;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.widget.Button;

import com.getova.app.R;
import com.getova.app.views.fragments.HomeFragment;

public class HomeActivity extends Activity {

    private HomeFragment mHomeFragment;
//    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mHomeFragment = HomeFragment.newInstance();

        getFragmentManager()
                .beginTransaction()
                .replace(R.id.content, mHomeFragment)
                .commit();
    }
}
