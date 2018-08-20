package com.getova.app.views.menu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.getova.app.R;
import com.getova.app.uiutils.Navigator;
import com.getova.app.views.details.DetailsActivity;

public class MainActivity extends Activity implements Navigator{

    private MainFragment mListFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListFragment = MainFragment.newInstance();
        mListFragment.setNavigator(this);

        getFragmentManager()
                .beginTransaction()
                .replace(R.id.content, mListFragment)
                .commit();
    }

    @Override
    public void navigateWith(String product) {
        Intent intent = new Intent(
                this,
                DetailsActivity.class
        );

        intent.putExtra("PRODUCT_NAME", product);
        startActivity(intent);
    }

}
