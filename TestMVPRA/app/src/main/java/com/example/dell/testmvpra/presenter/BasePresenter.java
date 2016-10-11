package com.example.dell.testmvpra.presenter;

import com.example.dell.testmvpra.retrofit.ApiService;
import com.example.dell.testmvpra.retrofit.AppClient;
import com.example.dell.testmvpra.view.MainView;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;
import rx.subscriptions.SerialSubscription;

/**
 * Created by dell on 2016/10/10.
 */

public class BasePresenter<V> implements Presenter<V>{

    public V mainView;
    public ApiService apiService = AppClient.retrofit().create(ApiService.class);
    public CompositeSubscription compositeSubscription;

    @Override
    public void attachView(V mainView) {
        this.mainView = mainView;
    }

    @Override
    public void detachView() {
        this.mainView = null;
        onUnsubscribe();
    }

    private void onUnsubscribe() {
        if(compositeSubscription !=null && compositeSubscription.hasSubscriptions()){
            compositeSubscription.unsubscribe();
        }
    }

    public void addSubscription(Observable observable, Subscriber subscriber){
        if (compositeSubscription == null) {
            compositeSubscription = new CompositeSubscription();
        }
        compositeSubscription.add(observable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber));
    };
}
