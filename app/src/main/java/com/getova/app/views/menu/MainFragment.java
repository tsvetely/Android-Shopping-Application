package com.getova.app.views.menu;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.getova.app.R;
import com.getova.app.models.Product;
import com.getova.app.repositories.base.Repository;
import com.getova.app.uiutils.Navigator;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment implements AdapterView.OnItemClickListener {

    private Navigator mNavigator;
    private ListView mProductView;
    private ArrayAdapter<String> mProductAdapter;
    private FirebaseFirestore mDb;
    private Repository<Product> mRepository;

    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        mDb = FirebaseFirestore.getInstance();

        mProductView = view.findViewById(R.id.lv_menu);
        mProductAdapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1);

        mProductView.setAdapter(mProductAdapter);
        mProductView.setOnItemClickListener(this);

//        mRepository = new FirebaseRepository<>(Product.class);

        mDb.collection("products").get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
            @Override
            public void onComplete(@NonNull Task<QuerySnapshot> task) {
                List<Product> products = task.getResult()
                        .toObjects(Product.class);
                for (Product product : products) {
                    mProductAdapter.add(product.productName);
                }
            }
        });

        return view;
    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        String product = mProductAdapter.getItem(position);
        mNavigator.navigateWith(product);
    }

    public void setNavigator(Navigator navigator) {
        mNavigator = navigator;
    }

    public static MainFragment newInstance() {
        return new MainFragment();
    }
}
