package com.getova.app.views.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.getova.app.R;

public class MenuActivity extends Activity {

    private ListView mMenuListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        mMenuListView = findViewById(R.id.lv_menu);
    }
}
