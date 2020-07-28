package com.example.androidgittesting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class ActivityHomePage extends AppCompatActivity {

    LinearLayout lvStaggered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        lvStaggered = findViewById(R.id.ll_Main);
        lvStaggered.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityHomePage.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
