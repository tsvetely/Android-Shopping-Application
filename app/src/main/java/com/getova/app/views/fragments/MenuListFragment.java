package com.getova.app.views.fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.getova.app.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MenuListFragment extends Fragment implements AdapterView.OnItemClickListener {

    private ListView mMenuListView;
    private ArrayAdapter<String> mMenuAdapter;

    public MenuListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_menu_list, container, false);

        mMenuListView = view.findViewById(R.id.lv_menu);
        mMenuAdapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1);

        mMenuListView.setAdapter(mMenuAdapter);
        mMenuListView.setOnItemClickListener(this);

        mMenuAdapter.add("DRINKS");
        mMenuAdapter.add("FOODS");

        return view;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getContext(), mMenuAdapter.getItem(position),
                Toast.LENGTH_SHORT)
                .show();
    }

    public static MenuListFragment newInstance() {
        return new MenuListFragment();
    }
}
