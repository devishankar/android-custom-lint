package com.github.devishankar.locallint;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        test t1 = test.TEST;
    }

    enum test {
        TEST
    }
}
