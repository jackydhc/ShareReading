package com.jacky.sharereading;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.google.firebase.crash.FirebaseCrash;


public class MainActivity extends AppCompatActivity {

    private FrameLayout layoutContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layoutContainer = (FrameLayout) findViewById(R.id.layout_container);
        FirebaseCrash.zzUL();

    }
}
