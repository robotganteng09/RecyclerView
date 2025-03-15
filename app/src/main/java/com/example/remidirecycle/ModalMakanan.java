package com.example.remidirecycle;

public class ModalMakanan {
    private String namaMakanan;
    private String hargaMakanan;

    private int gambarMakanan;

    // Konstruktor untuk menginisialisasi objek
    public ModalMakanan(String namaMakanan, String hargaMakanan, String namaMinuman, int gambarMakanan) {
        this.namaMakanan = namaMakanan;
        this.hargaMakanan = hargaMakanan;

        this.gambarMakanan = gambarMakanan;
    }

    // Getter untuk mengambil nilai atribut
    public String getNamaMakanan() {
        return namaMakanan;
    }

    public String getHargaMakanan() {
        return hargaMakanan;
    }



    public int getGambarMakanan() {
        return gambarMakanan;
    }
}
