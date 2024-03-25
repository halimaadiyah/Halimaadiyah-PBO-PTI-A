package Tugas4.T4;

import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {

    // a jawaban no 4. membuat array
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan Jumlah Peserta Didik ");
    int urutanAbsensiMahasiswa = input.nextInt();
    Student [] Mahasiswa = new Student [urutanAbsensiMahasiswa];

    for (int i = 0; i < urutanAbsensiMahasiswa; i++){
        Mahasiswa[i] = new Student();
        System.out.println("Masukkan data Peserta didik ke- " + (1+1));
        System.out.print("Nama: ");
        String name = input.next();
        System.out.print("Alamat: ");
        String address = input.next();
        System.out.print("Umur: ");
        int age = input.nextInt();
        System.out.print("Nilai Matematika: ");
        double mathGrade = input .nextDouble();
        System.out.print("Nilai IPA: ");
        double scienceGrade = input.nextDouble();
        System.out.print("Nilai Bahasa Inggris: ");
        double englishGrade = input.nextDouble();
    }

    System.out.println("===================");
    Student anna = new Student();
    anna.setName("Anna");
    anna.setAddress("Malang");
    anna.setAge(20);
    anna.setMath(100);
    anna.setScience(89);
    anna.setEnglish(80);
    anna.displayMessage();
    
    //menggunakan constructor lain
    System.out.println("===================");
    Student chris = new Student("Chris", "Kediri", 21);
    chris.setMath(70);
    chris.setScience(60);
    chris.setEnglish(90);
    chris.displayMessage();
    
     //siswa dengan nama anna dirubah informasi alamat dan umurnya melalui constructor
    System.out.println("===================");
    anna = new Student("anna", "Batu", 18);
    anna.displayMessage();
    //siswa denagan nama chris dirubah informasi alamat dan umurnya melalui method
    System.out.println("===================");
    chris.setAddress("Surabaya");
    chris.setAge(22);
    chris.displayMessage();

    // no 2(objek dari konstruktor)
    System.out.println("===================");
    Student carla = new Student();
    carla.setName("Clarla");
    carla.setAddress("Surabaya");
    carla.setAge(17);
    carla.setMath(98);
    carla.setScience(98);
    carla.setEnglish(99);
    carla.displayMessage();
    Student.jumlahObjek();
    }
}