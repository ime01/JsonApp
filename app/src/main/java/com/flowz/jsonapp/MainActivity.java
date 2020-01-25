package com.flowz.jsonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.flowz.jsonapp.entity.fetchData;

public class MainActivity extends AppCompatActivity {

    Button fetch;
    public static TextView showJson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fetch = findViewById(R.id.button_fetch);
        showJson = findViewById(R.id.show_data);

        fetch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                fetchData process = new fetchData();
                process.execute();

            }
        });
    }
}
