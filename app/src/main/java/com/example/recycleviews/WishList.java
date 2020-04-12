package com.example.recycleviews;

public class WishList {
    String nama, deskripsi;

    public WishList(){
    }

    public WishList(String nama, String deskripsi){
        this.nama = nama;
        this.deskripsi = deskripsi;
    }

    public String getNama(){
        return nama;
    }

    public void setNama (String nama){
        this.nama = nama;
    }

    public String getDeskripsi(){
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi){
        this.deskripsi = deskripsi;
    }
}
