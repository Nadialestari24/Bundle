package com.example.bundle;

import java.io.Serializable;

public class Pegawai  implements Serializable {

    private String Namanya;
    private String alamat;
    private String nohp;
    private String pekerjaan;
    private String lamaKerja;
    private String AsalSekolah;
    private String kompetensi;

    public Pegawai(String namanya, String alamatnya, String pekerjaanya, String nohp, String lamaKerja, String AsalSekolah, String Kompetensi) {
        this.Namanya=namanya;
        this.alamat=alamatnya;
        this.pekerjaan=pekerjaanya;
        this.nohp=nohp;
        this.lamaKerja=lamaKerja;
        this.kompetensi=Kompetensi;
        this.AsalSekolah=AsalSekolah;


    }
    public String getNamanya() {
        return Namanya;
    }

    public void setNamanya(String namanya) {
        Namanya = namanya;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNohp() {
        return nohp;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getLamaKerja() {
        return lamaKerja;
    }

    public void setLamaKerja(String lamaKerja) {
        this.lamaKerja = lamaKerja;
    }

    public String getAsalSekolah() {
        return AsalSekolah;
    }

    public void setAsalSekolah(String asalSekolah) {
        AsalSekolah = asalSekolah;
    }

    public String getKompetensi() {
        return kompetensi;
    }

    public void setKompetensi(String kompetensi) {
        this.kompetensi = kompetensi;
    }


}

