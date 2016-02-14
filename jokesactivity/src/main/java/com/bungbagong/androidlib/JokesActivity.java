package com.bungbagong.androidlib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class JokesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes);

        Intent intent = getIntent();
        String receivedString = intent.getStringExtra("joke");

        Log.d("bungbagong", "received String =" + receivedString);

        TextView text = (TextView) findViewById(R.id.textJoke);
        text.setText(receivedString);


    }
}
