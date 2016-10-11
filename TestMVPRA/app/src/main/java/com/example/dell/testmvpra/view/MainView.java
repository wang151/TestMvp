package com.example.dell.testmvpra.view;

/**
 * Created by dell on 2016/9/26.
 */

public interface MainView {

    public void hideProgress();
    public void showProgress();
    public void getDataSuccess(String data);
    public void getDateFail(String because);

}
