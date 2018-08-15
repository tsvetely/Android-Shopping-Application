package com.getova.app.repositories.base;

import java.util.List;
import java.util.function.Consumer;

public interface Repository<T> {
    void add(T item, Consumer<T> action);

    void getAll(Consumer<List<T>> action);

    void remove ();
}
