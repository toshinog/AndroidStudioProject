package com.example.a0000038244.hello;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mPlayer;

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Tag", "onResumeが実行されました");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Tag", "onResumeが実行されました");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Tag", "onStartが実行されました");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Tag", "onDestroyが実行されました");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Tag", "onStoopが実行されました");
    }

    @Override
    protected void onPause() {
        super.onPause();
        mPlayer.stop();
        Log.d("Tag", "onPauseが実行されました");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Tag", "onCreateが実行されました");
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.button);
        btn.setText("Hello");
        mPlayer = MediaPlayer.create(this, R.raw.music);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button btn = (Button)v;
                btn.setText("こんにちは");
                mPlayer.start();
            }
        });


        //Button btn = new Button(this);
        //btn.setText("Hello");
        //btn.setOnClickListener(new View.OnClickListener(){
        //    @Override
        //    public void onClick(View v){
        //        Button b = (Button) v;
        //        b.setText("こんにちは");
        //    }
        //});
        //setContentView(btn);
    }
}
