package com.example.forfriend;
//20-05-2019,10117221,Savero Rama Raynaldi,IF-7

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
            viewPager.setAdapter(new CustomPagerAdapter(this));

        }

    public void Pindah(View view) {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);
    }

}

