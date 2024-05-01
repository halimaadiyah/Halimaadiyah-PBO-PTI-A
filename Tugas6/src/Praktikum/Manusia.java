package Tugas6.src.Praktikum;
import java.time.LocalDate;

public class Manusia {
    

    protected String nama;
    protected boolean jenisKelamin; // true didefinisikan untuk laki-laki dan false untuk perempuan
    protected String nik;
    protected static boolean menikah;
    private String nim;
    private double ipk;
    private String status;

    // sebagai constructor
    public Manusia(String nama, boolean jenisKelamin, String nik, boolean menikah) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.nik = nik;
        this.menikah = menikah;
    }

    public Manusia(String nim, double ipk){
        this.nim = nim;
        this.ipk = ipk;
    }

    public Manusia(String nama2, String jenisKelamin2, String nik2, double gaji2, LocalDate tahunMasuk2, double ipk2) {
        
    }

    public Manusia(String nama2, boolean jenisKelamin2, String nik2, boolean menikah2, String nim2, double ipk2) {
        
    }

    // sebagai getter dan setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public boolean isJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public boolean isMenikah() {
        return menikah;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }


    // sebagai method untuk mendapatkan tunjangan berdasarkan kategori yang telah di tentukan
    public double getTunjangan() {
        if (menikah) {
            if (jenisKelamin) { // true didefinisikan untuk laki-laki dan false untuk perempuan 
                return 25.0; // kategori, laki-laki yang telah menikah akan mendapatkan tunjangan 25%
            } else {
                return 20.0; // kategori, perempuan yang telah menikah akan mendapatkan tunjangan 20%
            }
        } else {
            return 15.0; // kategori, katika kedua jenis kelamin yang telah di tentukan belum menikah maka tunjangannya 15%
        }
    }
 

    public double getPendapatan() {
        return getTunjangan();
    }

    public String toString() { // pada methode tostring ini berfungsi untuk mengembalikan representasi string objek, yang mencakup nilai nama, nik, jenis kelamin, pendapatan
        String jenisKelaminStr = jenisKelamin? "Laki-laki" : "Perempuan";
        return "nama : " + nama + "\n" +
               "nik : " + nik + "\n" +
               "jenisKelamin : " + jenisKelaminStr + "\n" +
               "pendapatan : " + getPendapatan();
    }

    public double getBeasiswa() {
        if (ipk >= 3.0 && ipk <= 3.5) {
            return 50.0;
        } else if (ipk > 3.5 && ipk <= 4.0) {
            return 75.0;
        } else {
            return 0.0;
        }
    }


}