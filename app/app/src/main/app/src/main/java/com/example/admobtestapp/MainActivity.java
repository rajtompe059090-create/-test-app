package com.example.admobtestapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView = new TextView(this);
        textView.setText("AdMob Test App");
        textView.setTextSize(24);
        textView.setPadding(40, 40, 40, 40);

        setContentView(textView);
    }
}
