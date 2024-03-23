package Tugas4.T4.src;

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

    // tugas praktikum 01
    public ayam() {
        warna = "kuning";
        jenisKelamin = true;
        klasifikasiJenis = "ayam kampung";
        nama = "piyuk";
        usia = 3;
        bertelur = true;
    }

    public ayam(String warna, boolean jenisKelamin){
        this.warna = warna;
        this.jenisKelamin = jenisKelamin;
        klasifikasiJenis = "ayam kampung";
        nama = "piyak";
        usia = 5;
        bertelur = false; 
    }


    public void main() {
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
        System.out.println("Bertelur: " + (bertelur ? "iya" : "tidak"));
        System.out.println("Klasifikasi Jenis: " + klasifikasiJenis );
        System.out.println("Jenis Kelamin: " + (jenisKelamin ? "Jantan" : "Betina"));
    }

    
    // tugas praktikum 02
    // 3 method overload dimana: makan, mematuk, berkokok.
    public void makan(String jenisMakanan) {
        System.out.println(nama + " sedang makan " + jenisMakanan);
    }

    
    public void mematuk() {
        System.out.println(nama + " sedang mematuk");
    }

    
    public void berkokok() {
        System.out.println(nama + " sedang berkokok");
    }

    // tugas praktikum 07. method overloading,
    public void tidur() {
        System.out.println(nama + " sedang tidur ");
    }

    // tugas praktikum 03. method instans 
    void bermain () {
        System.out.println( nama + " bermain " );
    }

    
    public String getWarna() {
        return warna;
    }

    
    public void setWarna(String warna) {
        this.warna = warna;
    }
}
