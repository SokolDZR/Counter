package com.example.student2.counter_;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void plus(View v){
        EditText num1 = (EditText) this.findViewById(R.id.num1);
        String snum1 = num1.getText().toString();
        EditText num2 = (EditText) this.findViewById(R.id.num2);
        String snum2 = num2.getText().toString();
        TextView out = (TextView) this.findViewById(R.id.out);
        out.setText("" + (Double.parseDouble(snum1) + Double.parseDouble(snum2)));

    }
    public void minus(View v){
        EditText num2 = (EditText) this.findViewById(R.id.num2);
        String snum2 = num2.getText().toString();
    }
}
