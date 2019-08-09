package com.example.bundle;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentPersonal extends Fragment {
    private Bundle bundle;
    private Pegawai pegawaiNyaa;
    private TextView txtNama,txtAlamat,txtNoHp;

    public FragmentPersonal() {
        // Required empty public constructor
    }
    @Override
    public  void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        bundle=getArguments();
        pegawaiNyaa=(Pegawai)bundle.getSerializable("bungkus1");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_fragment_personal,container,false);
        txtNama=(TextView)view.findViewById(R.id.txt_nama);
        txtAlamat=(TextView)view.findViewById(R.id.txt_alamat);
        txtNoHp=(TextView)view.findViewById(R.id.txt_noHP);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        txtNama.setText(pegawaiNyaa.getNamanya());
        txtAlamat.setText(pegawaiNyaa.getAlamat());
        txtNoHp.setText(pegawaiNyaa.getNohp());
    }
}
