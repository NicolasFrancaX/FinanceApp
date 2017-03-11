package com.databases.example.view;

/**
 * Created by kwelsh on 3/11/17.
 */

public interface RecyclerViewListener<T> {
    void onItemClick(T model, int position);
    boolean onItemLongClick(T model, int position);
}
