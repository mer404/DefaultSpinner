package com.example.defaultspinner;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    String[] courses = {"C", "Data structures",
            "Interview prep", "Algorithms",
            "DSA with java", "OS"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        Spinner spinner = findViewById(R.id.spinner);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, courses);
        spinner.setAdapter(adapter);

    }
}