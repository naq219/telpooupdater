package com.lemy.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.lemy.library.UpdateChecker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UpdateChecker.setUrl("http://abc.com",this);
        UpdateChecker.checkForDialog(this);

    }
}
