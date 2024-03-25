package Tugas4.T4.src;

public class manusia {
    private String nama;
    private boolean jenisKelamin;
    private int usia;
    private String status;
    private String ras;
    private String agama;

    // Constructor
    public manusia(String nama, boolean jenisKelamin, int usia, String status, String ras, String agama) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
        this.status = status;
        this.ras = ras;
        this.agama = agama;
    }
    public void main() {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + (jenisKelamin ? "laki-laki" : "Perempuan"));
        System.out.println("Usia: " + usia);
        System.out.println("Status: " + status);
        System.out.println("Ras: " + ras );
        System.out.println("Agama: " + agama );
    }
    // Method makan
    public void makan(String jenisMakanan) {
        System.out.println(nama + " sedang makan " + jenisMakanan);
    }

    // Method beribadah
    public void beribadah(boolean agama) {
        if (agama) {
            System.out.println(nama + " sedang beribadah");
        } else {
            System.out.println(nama + " tidak beribadah");
        }
    }

    // Method expresi
    public void expresi() {
        System.out.println(nama + " sedang berkata: 'Halo, hari ini aku happy!'");
    }

    // mengambil nama
    public String getNama() {
        return nama;
    }

    // Setting nama 
    public void setNama(String nama) {
        this.nama = nama;
    }
    
}
