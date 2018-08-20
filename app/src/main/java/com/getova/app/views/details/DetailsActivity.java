package com.getova.app.views.details;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;

import com.getova.app.R;

public class DetailsActivity extends Activity {

    private DetailsFragment mDetailsFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Intent intent = getIntent();
        String product = intent.getStringExtra("PRUDUCT_NAME");

        mDetailsFragment = DetailsFragment.newInstance();
        mDetailsFragment.setProduct(product);

        getFragmentManager()
                .beginTransaction()
                .replace(R.id.content, mDetailsFragment)
                .commit();
    }

}
