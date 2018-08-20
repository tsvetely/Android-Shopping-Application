package com.getova.app.views.menu;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.getova.app.R;
import com.getova.app.uiutils.Navigator;

/**
 * A simple {@link Fragment} subclass.
 */
public class MenuTabListFragment extends Fragment implements AdapterView.OnItemClickListener {

    private Navigator mNavigator;

    private ListView mMenuListView;
    private ArrayAdapter<String> mMenuAdapter;

    public MenuTabListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_menu, container, false);

        mMenuListView = view.findViewById(R.id.lv_menu);
        mMenuAdapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1);

        mMenuListView.setAdapter(mMenuAdapter);
        mMenuListView.setOnItemClickListener(this);

        return view;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String menu = mMenuAdapter.getItem(position);
        mNavigator.navigateWith(menu);
    }

    public static MenuTabListFragment newInstance() {
        return new MenuTabListFragment();
    }

    public void setNavigator(Navigator navigator) {
        mNavigator = navigator;
    }
}
