package com.poc.samplebroadcastsender;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button sendBroadcast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sendBroadcast = findViewById(R.id.sendBroadcast);
        sendBroadcast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                broadcastIntent();
            }
        });
    }

    public void broadcastIntent(){
        Intent intent = new Intent();
        intent.setAction("com.payment.request.CUSTOM_INTENT");
        sendBroadcast(intent);
    }
}
