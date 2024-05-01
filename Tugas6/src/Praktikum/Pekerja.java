package Tugas6.src.Praktikum;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class Pekerja extends Manusia {
    protected double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;
    private Object departemen;

    public Pekerja(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji , LocalDate tahunMasuk, int jumlahAnak){
        super(nama, jenisKelamin, nik, menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.jumlahAnak = jumlahAnak;
    }

    public Pekerja(String nama, String nik, String jenisKelamin, double gaji2, LocalDate tahunMasuk2, int jumlahAnak2) {
        super(nama, jenisKelamin, nik, gaji2, tahunMasuk2, jumlahAnak2);
        this.departemen = departemen;
    }

    // Getter dan Setter
    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }

    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public double getBonus() { // method untuk mendapatkan uang bonus pekerja 
        long yearsWorked = ChronoUnit.YEARS.between(tahunMasuk, LocalDate.now());
        if (yearsWorked >= 0 && yearsWorked <= 5) { // ketika lama bekerja  dari 0 sampai 5 tahun
            return gaji * 0.05; // akan mendapatkan besaran bonus 5% dari gaji
        } else if (yearsWorked > 5 && yearsWorked <= 10) { // ketika lama bekerja dari 5 sampai 10 tahun
            return gaji * 0.10; // akan mendapatkan tunjangan sebesar 10% dari gaji
        } else { // ketika lama bekerja lebih dari 10 tahun
            return gaji * 0.15; // akan mendapatkan tunjangan 15%
        }
    }

    // pada methode tostring ini berfungsi untuk mengembalikan representasi objek
    // yang mencakup nilai nama, nik, jenis kelamin, tahun masuk, jumlah anak, gaji, pendapatan
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMM yyyy");
        double tunjangan = jumlahAnak * 20;
        double pendapatan = gaji + tunjangan + getBonus();

        return "nama: " + nama + "\n" +
                "nik: " + nik + "\n" +
                "jenisKelamin: " + jenisKelamin + "\n" +
                "tahun masuk: " + formatter.format(tahunMasuk) + "\n" +
                "jumlah anak: " + jumlahAnak + "\n" +
                "gaji: " + String.format("%.1f", gaji) + "\n" +
                "pendapatan: " + String.format("%.1f", pendapatan);
    }
}
