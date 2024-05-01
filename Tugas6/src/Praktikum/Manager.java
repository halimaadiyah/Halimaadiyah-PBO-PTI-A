package Tugas6.src.Praktikum;
import java.time.LocalDate;

public class Manager extends Pekerja {
    String departemen;

    public Manager(String nama, String nik, String jenisKelamin, double gaji, LocalDate tahunMasuk, int jumlahAnak, String departemen) {
        super(nama, nik, jenisKelamin, gaji, tahunMasuk, jumlahAnak);
        this.departemen = departemen;
    }


    public Manager(String nama, boolean menikah, String nik, boolean jenisKelamin, double gaji, LocalDate masuk, int tahun, String jabatan) {
        super(nama, menikah, nik, jenisKelamin, gaji, masuk, tahun);
        this.departemen = departemen;
    }

    // getters and setters
    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }


    // method representasi string objek manager
    public String toString() {
        return "Manager, lama bekerja " + (LocalDate.now().getYear() - getTahunMasuk().getYear()) + " tahun dengan gaji $" + gaji + "\n" + super.toString() + "\ndepartemen : " + departemen;
    }


}