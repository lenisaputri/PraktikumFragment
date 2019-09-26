package com.example.praktikumfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.praktikumfragment.activies.DynamicActivity;
import com.example.praktikumfragment.activies.StaticActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void handlerStaticFragment(View view) {
        Intent intent = new Intent(this, StaticActivity.class);
        startActivity(intent);
    }

    public void handlerDynamicFragment(View view) {
        Intent intent = new Intent(this, DynamicActivity.class);
        startActivity(intent);
    }

    public void handlerPraktikumFragment(View view) {
    }
}
