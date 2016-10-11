package com.example.dell.testmvpra.presenter;

/**
 * Created by dell on 2016/10/10.
 */

public interface Presenter<V> {

    void attachView(V mainView);
    void detachView();

}
