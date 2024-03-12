package Tugas3.src;

public class ayam {
    private String warna;
    private boolean jenisKelamin;
    private String klasifikasiJenis;
    private String nama;
    private int usia;
    private boolean bertelur;

    
    public ayam(String warna, boolean jenisKelamin, String klasifikasiJenis, String nama, int usia, boolean bertelur) {
        this.warna = warna;
        this.jenisKelamin = jenisKelamin;
        this.klasifikasiJenis = klasifikasiJenis;
        this.nama = nama;
        this.usia = usia;
        this.bertelur = bertelur;
    }
    public void main() {
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
        System.out.println("Bertelur: " + (bertelur ? "iya" : "tidak"));
        System.out.println("Klasifikasi Jenis: " + klasifikasiJenis );
        System.out.println("Jenis Kelamin: " + (jenisKelamin ? "Jantan" : "Betina"));
    }
    
    public void makan(String jenisMakanan) {
        System.out.println(nama + " sedang makan " + jenisMakanan);
    }

    
    public void mematuk() {
        System.out.println(nama + " sedang mematuk");
    }

    
    public void berkokok() {
        System.out.println(nama + " sedang berkokok");
    }

    
    public String getWarna() {
        return warna;
    }

    
    public void setWarna(String warna) {
        this.warna = warna;
    }
}
