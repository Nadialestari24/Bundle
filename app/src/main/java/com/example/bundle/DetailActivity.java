package com.example.bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class DetailActivity extends AppCompatActivity {

   private ViewPager viewPager;
   private TabLayout Tablayout;
   Pegawai pegawaidetail;
   TabFragmentAdapter PagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Tablayout=(TabLayout) findViewById(R.id.tab_layout);
        viewPager=(ViewPager)findViewById(R.id.pager);

        Intent kirim=getIntent();
        pegawaidetail=(Pegawai) getIntent().getSerializableExtra("xyz");
        PagerAdapter=new TabFragmentAdapter(getSupportFragmentManager(),pegawaidetail);
        viewPager.setAdapter(PagerAdapter);
        Tablayout.setTabTextColors(getResources().getColor(R.color.colorBlue),getResources().getColor(R.color.colorAccent));
        Tablayout.setupWithViewPager(viewPager);
        Tablayout.setTabGravity(TabLayout.GRAVITY_FILL);


    }
}
