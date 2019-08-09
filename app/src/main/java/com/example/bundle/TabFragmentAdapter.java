package com.example.bundle;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class TabFragmentAdapter extends FragmentPagerAdapter {
    String[]judul=new  String[]{"Personal","Job","Skill"};
    Pegawai objPegawai;

    public TabFragmentAdapter(FragmentManager fm,Pegawai objPegawai) {
        super(fm);
        this.objPegawai=objPegawai;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                Fragment FragmentPersonal=new FragmentPersonal();
                Bundle bungkus=new Bundle();
                bungkus.putSerializable("bungkus1",objPegawai);
                FragmentPersonal.setArguments(bungkus);
                return FragmentPersonal;
            case 1:
                Fragment FragmentJob=new FragmentJob();
                Bundle bungkus2=new Bundle();
                bungkus2.putSerializable("bungkus2",objPegawai);
                FragmentJob.setArguments(bungkus2);
                return FragmentJob;
            case 2:
                Fragment FragmentSkill=new FragmentSkill();
                Bundle bungkus3=new Bundle();
                bungkus3.putSerializable("bungkus3",objPegawai);
                FragmentSkill.setArguments(bungkus3);
                return FragmentSkill;

        }
        return null;
    }

    @Override
    public int getCount() {
        return judul.length;
    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return judul[position];
    }
}






