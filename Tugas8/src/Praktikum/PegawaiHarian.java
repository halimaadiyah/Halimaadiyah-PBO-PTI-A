package Praktikum;

public class PegawaiHarian extends Pegawai {
    private double upahPerJam;
    private int totalJam;

    // construktor (pada subclass ini digunakan untuk menginisialisasi atribut upahPerJam, totalJam
    // serta memanggil construktor pada subclass)
    public PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam) {
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJam = totalJam;
    }

    // override dari method gaji ini untuk menghitung 
    // gaji berdasarkan upah perjam dan totalJamKerja
    @Override
    public double gaji() {
        return upahPerJam * totalJam;
    }

    // getter
    public double getUpahPerJam() {
        return upahPerJam;
    }

    public int getTotalJam() {
        return totalJam;
    }

    // setter
    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }

    // override dari method ini untuk menampilkan informasi terkait upahPerJam, totalJamKerja, dan gaji pegawai harian
    @Override
    public String toString() {
        return super.toString() + "\nUpah/Jam: " + upahPerJam + "\nTotal Jam Kerja: " + totalJam + "\nPendapatan: Rp. " + gaji();
    }
}
