package com.example.myapplicationstart;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 实现布局
        setContentView(R.layout.activity_main);
        // 初始化布局
        initUI();

    }

    private void initUI() {
        // 传入音频文件
        MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.awosmoe);
        // 找到我们的按钮.添加点击事件
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                }
                else{
                    mediaPlayer.start();
                }
            }
        });
    }
}