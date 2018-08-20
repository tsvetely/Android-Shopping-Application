package com.getova.app.views.details;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.getova.app.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetailsFragment extends Fragment {

    private String mProduct;
    private TextView mTextView;

    public DetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_details, container, false);

        mTextView = view.findViewById(R.id.tv_details);
        mTextView.setText(mProduct);

        return view;
    }

    public void setProduct(String product) {
        mProduct = product;
//        if (mTextView == null){
//            return;
//        }
        mTextView.setText(product);
    }

    public static DetailsFragment newInstance() {
        return new DetailsFragment();
    }
}
