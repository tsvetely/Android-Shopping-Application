package com.getova.app.views.favorites;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.getova.app.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyFavoritesListFragment extends Fragment {


    public MyFavoritesListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_favorites_list, container, false);
    }

}
