package Tugas5.src;

import java.util.Scanner;

public class MainAkunSwalayan {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        AkunSwalayan account = new AkunSwalayan ("Khalimatus Sa'diyah", "3877665544",38);
        account.getNama();
        account.getNomorAkunCustomer();
        account.setBalance(500_000);
        account.getCashbackRate();

        System.out.println("Nama : " + account.getNama());
        System.out.println("Nomor Akun Pelanggan : "+ account.getNomorAkunCustomer());
        System.out.println("Saldo Pekanggan : "+account.getBalance());


        //account.CashbackRate();
       System.out.print("Masukkan PIN Pelanggan: ");
        int pin = input.nextInt();
        int counter = 1;
        while (pin != 2332 && counter < 3) {
        System.out.println("PIN salah. Masukkan Kembali.");
        pin = input.nextInt();
        counter++;
        }
    
        if (pin == 2332) {
            System.out.println("Pelanggan jenis rekening: " + account.getJenisRekeningString());
            System.out.println("Saldo Anda: " + account.getBalance());
            System.out.print("Masukkan harga pembelian: ");
            int hargaPembelian = input.nextInt();
    
            // Memeriksa apakah saldo cukup
            if (hargaPembelian > account.getBalance()) {
            System.out.println("Saldo tidak cukup.");
            System.out.print("Masukkan jumlah yang ingin ditop up: ");
            int topUpAmount = input.nextInt();
            account.tambahSaldo(topUpAmount);
            System.out.println("Saldo Anda sekarang: " + account.getBalance());
    
            // Memasukkan Harga ulang
            System.out.print("Masukkan harga pembelian : ");
            hargaPembelian = input.nextInt();
        }
    
            account.kurangSaldo(hargaPembelian);
            int cashback = account.cashbackRate();
            System.out.println("Cashback yang didapat: " + cashback);
            System.out.println("Saldo Anda sekarang: " + account.getBalance());
        } else {
            System.out.println("PIN salah lebih dari 3 kali. Akun terblokir.");
        }
        
            
    }
}
