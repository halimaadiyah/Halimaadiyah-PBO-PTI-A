package Praktikum;

public class PegawaiTetap extends Pegawai {
    private double upah;

    // construktor (pada subclass ini digunakan untuk menginisialisasi atribut upah,
    // serta memanggil construktor pada subclass)
    public PegawaiTetap(String nama, String noKTP, double upah) {
        super(nama, noKTP);
        this.upah = upah;
    }

    @Override
    public double gaji() {
        return upah;
    }

    // getter
    public double getUpah() {
        return upah;
    }

    // setter
    public void setUpah(double upah) {
        this.upah = upah;
    }

    // override dari method ini untuk menampilkan informasi terkait upah dan gaji pegawaiTetap
    @Override
    public String toString() {
        return super.toString() + "\nUpah: " + upah + "\nPendapatan: Rp. " + gaji();
    }
}
