package Tugas7.src.Praktikum;

public class MainKue {
    public static void main(String[] args) {
        Kue[] kueArray = new Kue[21];
        
        kueArray[0] = new KuePesanan("Kue Brownies", 30, 0.5);
        kueArray[1] = new KuePesanan("Kue Bolu", 20, 0.3);
        kueArray[2] = new KueJadi("Kue Lapis", 25, 5);
        kueArray[3] = new KueJadi("Kue Donat", 15, 10);
        kueArray[4] = new KuePesanan("Kue Tart", 50, 0.8);
        kueArray[5] = new KuePesanan("Kue Cucur", 40, 0.8);
        kueArray[6] = new KueJadi ("Kue onde", 30, 11);
        kueArray[7] = new KueJadi("Kue Serabi", 10, 20);
        kueArray[8] = new KuePesanan("kue nagasari", 20, 0.3);
        kueArray[9] = new KuePesanan("Kue Bikang", 30, 0.4);
        kueArray[10] = new KueJadi("Kue Putu", 35, 15);
        kueArray[11] = new KueJadi("Kue lapis legit", 85, 35);
        kueArray[12] = new KuePesanan("Kue Lumpur", 45, 0.9);
        kueArray[13] = new KuePesanan("Kue apem", 17, 0.2);
        kueArray[14] = new KueJadi ("Kue mangkok", 45, 17);
        kueArray[15] = new KueJadi("Kue Lindri", 37, 20);
        kueArray[16] = new KuePesanan("kue jentik Manis ", 31, 0.9);
        kueArray[17] = new KuePesanan("Kue wajik", 46, 0.7);
        kueArray[18] = new KueJadi("Kue Bugis Ketan", 39, 8);
        kueArray[19] = new KueJadi("Kue Lupis", 13, 23);
        kueArray[20] = new KuePesanan("Kue Dadar Gulung", 15, 0.5);
       

        // Tampilkan semua kue dan jenis kue
        for (Kue kue : kueArray) {
            System.out.println(kue);
            if (kue instanceof KuePesanan) {
                System.out.println("Jenis Kue: Pesanan");
            } else if (kue instanceof KueJadi) {
                System.out.println("Jenis Kue: Jadi");
            }
            System.out.println();
        }

        // Hitung total harga dari semua jenis kue
        double totalHarga = 0;
        for (Kue kue : kueArray) {
            totalHarga += kue.hitungHarga();
        }
        System.out.println("Total Harga Semua Kue: " + totalHarga);

        // Hitung total harga dan total berat dari KuePesanan
        double totalHargaPesanan = 0;
        double totalBerat = 0;
        for (Kue kue : kueArray) {
            if (kue instanceof KuePesanan) {
                totalHargaPesanan += kue.hitungHarga();
                totalBerat += ((KuePesanan) kue).getBerat();
            }
        }

        System.out.println("Total Harga Kue Pesanan: " + totalHargaPesanan);
        System.out.println("Total Berat Kue Pesanan: " + totalBerat);

        // Hitung total harga dan total jumlah dari KueJadi
        double totalHargaJadi = 0;
        int totalJumlah = 0;
        for (Kue kue : kueArray) {
            if (kue instanceof KueJadi) {
                totalHargaJadi += kue.hitungHarga();
                totalJumlah += ((KueJadi) kue).getJumlah();
            }
        }
        System.out.println("Total Harga Kue Jadi: " + totalHargaJadi);
        System.out.println("Total Jumlah Kue Jadi: " + totalJumlah);

        // Tampilkan informasi kue dengan harga (harga akhir) terbesar
        double hargaTerbesar = -1;
        Kue kueTerbesar = null;
        for (Kue kue : kueArray) {
            if (kue.hitungHarga() > hargaTerbesar) {
                hargaTerbesar = kue.hitungHarga();
                kueTerbesar = kue;
            }
        }
        if (kueTerbesar != null) {
            System.out.println("Informasi Kue dengan Harga Terbesar:");
            System.out.println(kueTerbesar);
            System.out.println("Harga Terbesar: " + hargaTerbesar);
        }
    }
 }