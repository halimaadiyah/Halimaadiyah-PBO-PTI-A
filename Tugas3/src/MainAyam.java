package Tugas3.src;

public class MainAyam {
    public static void main(String[] args) {
        ayam ayam1 = new ayam("putih", true, "ayam kampung", "piyek", 2, true);
        ayam1.main();
        ayam1.makan("purr");
        ayam1.mematuk();
        ayam1.berkokok();

        System.out.println("Warna ayam: " + ayam1.getWarna());
    }
    
}
