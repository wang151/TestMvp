package com.example.dell.testmvpra.view;

import android.os.Bundle;

import com.example.dell.testmvpra.presenter.BasePresenter;
import com.example.dell.testmvpra.presenter.MainPresenter;

public abstract class MVPActivity<P extends BasePresenter> extends BaseActivity {

    protected P mvpPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mvpPresenter = createPresenter();
        super.onCreate(savedInstanceState);
    }

    protected abstract P createPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mvpPresenter != null) {
            mvpPresenter.detachView();
        }
    }
}
