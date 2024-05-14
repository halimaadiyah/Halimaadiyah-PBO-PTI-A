package Praktikum;

public class MainPegawai {
    public static void main(String[] args) {
        Sales sales = new Sales("pak sapiro", "351678192374506", 80, 50000.0);
        System.out.println("Sales:\n" + sales + "\n");

        PegawaiHarian pegawaiHarian = new PegawaiHarian("pak yanuar", "351728394019618", 70000.0, 10);
        System.out.println("PegawaiHarian:\n" + pegawaiHarian + "\n");

        PegawaiTetap pegawaiTetap = new PegawaiTetap("pak budi", "35182934658219", 5000000.0);
        System.out.println("PegawaiTetap:\n" + pegawaiTetap);
    }
}
