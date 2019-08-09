package com.example.bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    EditText edtNama, edtAlamat, edtPekerjaan, edtNoHP, edtLamaKerja, edtKompetensi,edtAsalSekolah;
    String Namanya, Alamatnya, pekerjaannya, noHpnya, lamaKerjanya, Kompetensinya, AsalSekolahnya;
    Button btnInput;
    Pegawai pegawainya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNama = (EditText) findViewById(R.id.Edt_Nama);
        edtAlamat = (EditText) findViewById(R.id.Edt_Alamat);
        edtPekerjaan = (EditText) findViewById(R.id.Edt_Pekerjaan);
        edtNoHP = (EditText) findViewById(R.id.Edt_Nohp);
        edtKompetensi = (EditText) findViewById(R.id.Edt_Kompetensi);
        edtLamaKerja = (EditText) findViewById(R.id.Edt_Lamakerja);
        edtAsalSekolah=(EditText)findViewById(R.id.Edt_Asalsekolah);

        btnInput = (Button) findViewById(R.id.Btn_Input);
        btnInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Namanya=edtNama.getText().toString();
                Alamatnya=edtAlamat.getText().toString();
                pekerjaannya=edtPekerjaan.getText().toString();
                noHpnya=edtNoHP.getText().toString();
                Kompetensinya=edtKompetensi.getText().toString();
                lamaKerjanya=edtLamaKerja.getText().toString();
                AsalSekolahnya=edtAsalSekolah.getText().toString();
                pegawainya=new Pegawai(Namanya,Alamatnya,pekerjaannya,noHpnya,lamaKerjanya,AsalSekolahnya,Kompetensinya);
                Intent kirim=new Intent(MainActivity.this,DetailActivity.class);
                kirim.putExtra("xyz",(Serializable)pegawainya);
                startActivity(kirim);
            }
        });
    }
}