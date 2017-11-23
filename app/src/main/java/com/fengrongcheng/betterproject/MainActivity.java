package com.fengrongcheng.betterproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.fengrongcheng.betterproject.utils.ApkVersionUtils;

public class MainActivity extends AppCompatActivity {
    private String TAG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TAG = this.getClass().getSimpleName();
        setContentView(R.layout.activity_main);
        Log.e(TAG, "VersionCode ::      " + ApkVersionUtils.getVersionCode(this));
    }
}
