package com.example.sammitafoya.counterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //THE MODEL
    private Counter count;

    //THE VIEW
    private TextView countView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        count = new Counter();
        countView = (TextView) findViewById(R.id.textView);
    }

    public void countTap (View view){
        count.addCount();
        countView.setText(count.getCount().toString());
        Log.v(TAG, "Sammi, count is: " + count.getCount().toString());
    }

}
