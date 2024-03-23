package Tugas4.T4.src;

public class MainAyam {
    public static void main(String[] args) {
        ayam ayam1 = new ayam("putih", true, "ayam kampung", "piyek", 2, true);
        // Tugas praktikum no.05 ayam piyak piyek piyuk merupakan hasil objek dari penggunaan constructor overloading
        ayam1.main();
        ayam1.makan("purr");
        ayam1.mematuk();
        ayam1.berkokok();
        ayam1.bermain();
        ayam1.tidur();

        System.out.println("=============================");
        ayam ayam2 = new ayam();
        ayam2.main();
        ayam2.makan("dedak");
        ayam2.mematuk();
        ayam2.berkokok();

        System.out.println("=============================");
        ayam ayam3 = new ayam("ungu", false);
        ayam3.main();
        ayam3.makan("jangung biji");
        ayam3.mematuk();
        ayam3.berkokok();

        // System.out.println("Warna ayam: " + ayam1.getWarna());
    }
}
