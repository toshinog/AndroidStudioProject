package com.example.a0000038244.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        Button btn = new Button(this);
        btn.setText("Hello");
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Button b = (Button) v;
                b.setText("こんにちは");
            }
        });
        setContentView(btn);
    }
}