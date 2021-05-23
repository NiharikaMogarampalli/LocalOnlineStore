package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DeliveredProductsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivered_products);
    }

    public void deliveredproducts(View view) {
        Intent i =new Intent(this,DeliveredProductActivity.class);
        startActivity(i);
    }
}