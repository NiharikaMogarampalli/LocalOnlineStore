package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout=findViewById(R.id.tablayout);
        viewPager=findViewById(R.id.viewpager);
        viewPager.setAdapter(new Myadapterviewpager(getSupportFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);


    }
    public class Myadapterviewpager extends FragmentPagerAdapter {

        //for giveing tabs titles create string array
        String titles[]={"Customer","Seller"};

        public Myadapterviewpager(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            if (position==0){
                return new CustomerLoginFragment();
            }
            if (position==1){
                return new SellerLoginFragment();
            }
            return null;
        }

        @Override
        public int getCount() {
            return titles.length;
        }

        @Nullable
        @Override
        //import the default override getpagetitle()
        public CharSequence getPageTitle(int position) {
            return titles[position];
        }
    }


}