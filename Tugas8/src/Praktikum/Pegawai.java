package Praktikum;

public abstract class Pegawai {
    protected String nama;
    protected String noKTP;

    // constructor
    public Pegawai(String nama, String noKTP) {
        this.nama = nama;
        this.noKTP = noKTP;
    }

    // method abstrak yang akan diimplementasikan pada class turunan
    public abstract double gaji();

    // getter
    public String getNama() {
        return nama;
    }

    public String getNoKTP() {
        return noKTP;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + "\nNo.KTP: " + noKTP;
    }
}
