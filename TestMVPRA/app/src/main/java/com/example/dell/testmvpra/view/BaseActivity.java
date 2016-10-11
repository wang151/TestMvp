package com.example.dell.testmvpra.view;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.dell.testmvpra.R;

public class BaseActivity extends AppCompatActivity {

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
    }

    protected void Toast(String content){
        Toast.makeText(context, content, Toast.LENGTH_SHORT);
    }

    protected void Toast(int id){
        Toast.makeText(context, id, Toast.LENGTH_SHORT);
    }
}
