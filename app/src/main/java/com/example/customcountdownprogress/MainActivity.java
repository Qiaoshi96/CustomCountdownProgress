package com.example.customcountdownprogress;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CountDownProgress countDownProgress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//    获取控件的id
        countDownProgress = (CountDownProgress) findViewById(R.id.countdownProgress);
//        三秒倒计时
        countDownProgress.setCountdownTime(3*1000);
//        结束后设置的监听
        countDownProgress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countDownProgress.startCountDownTime(new CountDownProgress.OnCountdownFinishListener() {
                    @Override
                    public void countdownFinished() {
                        Toast.makeText(MainActivity.this, "这是倒计时结束后要执行的具体界面", Toast.LENGTH_LONG).show();
                    }
                });

            }
        });
    }
}
