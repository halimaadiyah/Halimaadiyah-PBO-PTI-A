package Praktikum;

public class Sales extends Pegawai {
    private double komisi;
    private int penjualan;

    // construktor (pada subclass ini digunakan untuk menginisialisasi atribut penjualan dan komisi,
    // serta memanggil construktor pada subclass)
    public Sales(String nama, String noKTP, int penjualan, double komisi) {
        super(nama, noKTP);
        this.penjualan = penjualan;
        this.komisi = komisi;
    }

    // override dari method gaji ini untuk menghitung 
    // gaji berdasarkan jumlah penjualan dan besaran komisinya
    @Override
    public double gaji() {
        return penjualan * komisi;
    }

    // getter
    public int getPenjualan() {
        return penjualan;
    }

    public double getKomisi() {
        return komisi;
    }

    // setter
    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }

    // override dari method ini untuk menampilkan informasi terkait penjualan, komisi dan gaji pada sales
    @Override
    public String toString() {
        return super.toString() + "\nTotal Penjualan: " + penjualan + "\nBesaran Komisi: " + komisi + "\nPendapatan: Rp. " + gaji();
    }
}
