package com.example.svetofor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void red(View view) {
        ConstraintLayout constraint = findViewById(R.id.activity);
        constraint.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.purple_200));
    }
    public void yellow(View view) {
        ConstraintLayout constraint = findViewById(R.id.activity);
        constraint.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.purple_500));
    }
    public void green(View view) {
        ConstraintLayout constraint = findViewById(R.id.activity);
        constraint.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.purple_700));
    }
}