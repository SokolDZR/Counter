package com.example.student2.counter_;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = this.getIntent();
        String text1 = intent.getStringExtra("mytext");
        TextView out1 = (TextView) this.findViewById(R.id.out1);
        out1.setText(text1);
    }
}