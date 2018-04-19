package com.countdowntimer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    ValidateCodeView validateCodeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        validateCodeView = (ValidateCodeView) findViewById(R.id.validateCodeView);
        validateCodeView.onCreate();

        validateCodeView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateCodeView.start();
            }
        });
    }

    @Override
    protected void onDestroy() {
        validateCodeView.onDestroy();
        super.onDestroy();
    }
}
