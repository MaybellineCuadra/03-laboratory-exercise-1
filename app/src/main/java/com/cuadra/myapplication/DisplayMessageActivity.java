package com.cuadra.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_display_message);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(sendmessage);
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String sendmessage = intent.getStringExtra(MyActivity.EXTRA_MESSAGE);
        /*setContentView(R.layout.activity_display_message);*/
    }
}
