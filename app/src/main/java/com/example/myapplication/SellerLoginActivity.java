package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SellerLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller_login);
    }

    public void myproducts(View view) {
        Intent i =new Intent(this,SellerproductActivity.class);
        startActivity(i);
    }

    public void adddiscount(View view) {
        Intent i =new Intent(this,DiscountActivity.class);
        startActivity(i);
    }

    public void pendingdeliveries(View view) {
        Intent i =new Intent(this,PendingDeliveriesActivity.class);
        startActivity(i);
    }

    public void addproduct(View view) {
        Intent i =new Intent(this,AddProductActivity.class);
        startActivity(i);
    }

    public void myaccount(View view) {
        Intent i =new Intent(this,SellerLoginActivity.class);
        startActivity(i);
    }

    public void myprofile(View view) {
        Intent i =new Intent(this,SellerProfileActivity.class);
        startActivity(i);
    }

    public void deliveredproducts(View view) {
        Intent i =new Intent(this,DeliveredProductsActivity.class);
        startActivity(i);
    }
}