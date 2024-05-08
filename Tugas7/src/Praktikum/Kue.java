package Tugas7.src.Praktikum;

public abstract class Kue {
    private String nama;
    private double harga;

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public Kue(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public abstract double hitungHarga();

    @Override
    public String toString() {
        return "Nama Kue: " + nama + "\nHarga: " + harga;
    }
    
}
