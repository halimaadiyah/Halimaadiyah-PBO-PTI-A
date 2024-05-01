package Tugas6.src.Praktikum;
import java.time.LocalDate;

public class MainKeseluruhan {
    public static void main(String[] args) {
        Manusia arya = new Manusia("arya", true, "111111", true);
        Manusia raya = new Manusia("raya", false, "222222", true);
        Manusia ara = new Manusia("ara", false, "3333333", false);
        
        System.out.println("---HASIL CLASS MANUSIA---");
        System.out.println(arya.toString());
        System.out.println();
        System.out.println(raya.toString());
        System.out.println();
        System.out.println(ara.toString());
        System.out.println();

        System.out.println("---HASIL CLASS MAHASISWA FILKOM--- ");
        MahasiswaFILKOM mahasiswaArya = new MahasiswaFILKOM("arya", true, "1111111", true, "111222", 2.9);
        MahasiswaFILKOM mahasiswaRaya = new MahasiswaFILKOM("raya", false, "222222", true, "222333", 3.5);
        MahasiswaFILKOM mahasisiwaAra = new MahasiswaFILKOM("ara", false, "333333", false, "333444", 3.9);

        System.out.println(arya.toString());
        System.out.println("Besaran Beasiswa: $0" + arya.getBeasiswa());
        System.out.println();
        System.out.println(raya.toString());
        System.out.println("Besaran Beasiswa: $50" + raya.getBeasiswa());
        System.out.println();
        System.out.println(ara.toString());
        System.out.println("Besaran Beasiswa: $75" + ara.getBeasiswa());
        System.out.println();

        System.out.println("---HASIL CLASS PEKERJA---");
        Pekerja pekerja1 = new Pekerja("jono", true, "77777", true, 1000.0, LocalDate.of(2016, 3, 2), 2);
        Pekerja pekerja2 = new Pekerja("reke", false, "88888", true, 1000.0, LocalDate.of(2016, 3, 2), 4);
        Pekerja pekerja3 = new Pekerja("tino", true, "99999", false, 1000.0, LocalDate.of(2016, 3, 2), 10);

        System.out.println("a. pekerja ke-1");
        System.out.println(pekerja1);
        System.out.println("\nb. pekerja ke-2");
        System.out.println(pekerja2);
        System.out.println("\nc. pekerja ke-3");
        System.out.println(pekerja3);
        
        System.out.println();
        System.out.println("---HASIL CLASS MANAGER---");
        Manager manager = new Manager("yusuf", true, "4567895", true, 7500.0, LocalDate.of(2017, 1, 2), 3, "HRD");
        System.out.println(manager);

    }
}