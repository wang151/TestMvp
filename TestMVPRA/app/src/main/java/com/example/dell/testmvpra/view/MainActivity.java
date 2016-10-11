package com.example.dell.testmvpra.view;

import android.os.Bundle;
import com.example.dell.testmvpra.R;
import com.example.dell.testmvpra.presenter.MainPresenter;
import com.example.dell.testmvpra.view.MainView;

public class MainActivity extends MVPActivity<MainPresenter> implements MainView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mvpPresenter.loadData("444");
    }

    @Override
    protected MainPresenter createPresenter() {
        return new MainPresenter(this);
    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void showProgress() {

    }

    @Override
    public void getDataSuccess(String data) {

    }

    @Override
    public void getDateFail(String because) {

    }
}
