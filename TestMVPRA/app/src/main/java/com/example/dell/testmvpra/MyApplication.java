package com.example.dell.testmvpra;

import android.app.Application;
import android.content.Context;

/**
 * Created by dell on 2016/9/8.
 */

public class MyApplication extends Application {

    static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }

    public static Context getContext() {
        return context;
    }

}
