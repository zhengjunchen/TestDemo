package com.czj.testdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("TAG", "onCreate: " + "我修改了diamagnetic");


        for (int i = 0; i < 10; i++) {
            Log.e("TAG", "onCreate: aa增加的代码");
        }

        //

        //hello 我增加了注释
    }


}
