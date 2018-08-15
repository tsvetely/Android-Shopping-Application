package com.getova.app.repositories;

import android.annotation.TargetApi;
import android.os.Build;

import com.getova.app.repositories.base.Repository;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.List;
import java.util.function.Consumer;

public class FirebaseRepository<T> implements Repository<T> {
    private final FirebaseFirestore mDb;
    private final Class<T> mKlass;
    private final String mCollectionName;

    public FirebaseRepository(Class<T> klass) {
        mDb = FirebaseFirestore.getInstance();
        mKlass = klass;
        mCollectionName = klass.getSimpleName().toLowerCase() + "s";
    }

    @TargetApi(Build.VERSION_CODES.N)
    @Override
    public void getAll(Consumer<List<T>> action) {
        mDb.collection(mCollectionName)
                .get()
                .addOnCompleteListener(task -> {
                    List<T> items = task.getResult()
                            .toObjects(mKlass);
                    action.accept(items);
                });
    }

    @Override
    public void remove() {

    }

    @TargetApi(Build.VERSION_CODES.N)
    @Override
    public void add(T item, Consumer<T> action) {
        mDb.collection(mCollectionName)
                .add(item)
                .addOnCompleteListener(task -> action.accept(item));
    }

}
