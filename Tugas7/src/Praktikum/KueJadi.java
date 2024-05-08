package Tugas7.src.Praktikum;

public class KueJadi extends Kue {
    private int jumlah;

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public KueJadi(String nama, double harga, int jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    @Override
    public double hitungHarga() {
        return super.getHarga() * jumlah * 2;
    }
}
