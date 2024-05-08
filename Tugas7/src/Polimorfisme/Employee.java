package Tugas7.src.Polimorfisme;

public abstract class Employee {
    private String name;
    //penambahan untuk keperluan dari penugasan no.4
    private int birthMonth;
    private double salary;
    private String noKTP;
    //penambahan 2 atribut di bawah untuk kebutuhan dari tugas no 5
    private int jumlahBarangDiproduksi;
    private double upahPerBarang;

    public Employee (String name, String noKTP){
        this.name = name;
        this.noKTP = noKTP;
    }

    // objek no.4 
    public Employee(String name, int birthMonth, double salary) {
        this.name = name;
        this.birthMonth = birthMonth;
        this.salary = salary;
    }

    // no.5 Method berfungsi untuk mengatur informasi produksi barang dari seorang karyawan
    public void setProductionInfo(int jumlahBarang, double upahPerBarang) {
        this.jumlahBarangDiproduksi = jumlahBarang;
        this.upahPerBarang = upahPerBarang;
    }

    // no.5 Method berfungsi untuk menghitung gaji karyawan berdasarkan informasi produksi barang yang telah disimpan
    public double calculateSalary() {
        return jumlahBarangDiproduksi * upahPerBarang;
    }

    //Accessor no.4
    public String getName(){
        return name;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public double getSalary() {
        return salary;
    }

    //mutator no.4
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // no.4
    public double calculateTotalSalary() {
        double totalSalary = calculateSalary();
        if (birthMonth != 5) { // set penambahan gaji bila dia ulang tahun pada bulan mei
            totalSalary += 100000; // Tambah gaji jika bulan ulang tahun
        }
        return totalSalary;
    }

    public String getnoKTP(){
        return noKTP;
    }

    public String toString(){
        return String.format(" "+getName()+"\nNo. KTP:"+getnoKTP());
    }

    public abstract double earnings(); //pendapatan
}
