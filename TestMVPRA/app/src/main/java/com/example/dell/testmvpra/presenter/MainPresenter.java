package com.example.dell.testmvpra.presenter;

import com.example.dell.testmvpra.retrofit.ApiService;
import com.example.dell.testmvpra.view.MainView;

import rx.Observable;
import rx.Subscriber;

/**
 * Created by dell on 2016/10/10.
 */

public class MainPresenter extends BasePresenter<MainView>{

    public void MainPresenter(MainView mainView){
        attachView(mainView);
    }

    public void loadData(String cityId){
        mainView.showProgress();
        addSubscription(apiService.loadData(cityId), new Subscriber() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(Object o) {

            }
        });

    }

}
