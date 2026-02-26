package com.example.androiduitesting;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ShowActivity extends AppCompatActivity {

    public static final String EXTRA_CITY = "EXTRA_CITY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        TextView tv = findViewById(R.id.text_city_name);
        Button back = findViewById(R.id.button_back);

        String city = getIntent().getStringExtra(EXTRA_CITY);
        if (city == null) city = "";
        tv.setText(city);

        back.setOnClickListener(v -> finish()); // go back to MainActivity
    }
}