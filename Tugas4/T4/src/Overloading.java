package Tugas4.T4.src;

import java.util.Scanner;

public class Overloading {
    public static void HitungLuas(int a,int b){
        int nilai = a*b;
        System.out.println("maka hasil luas : "+nilai);
    }

    // public static double HitungLuas(double value, double value2){
    //     double nilai = value* value2;
    //     return nilai;
    // }


    // Jawaban nomor 3
    public static void HitungLuas(double value, double value2){
        double nilai = value* value2;
        System.out.println(" Maka Hasil Luasnya : " +nilai);
    }

    // implementasian nomer 02 | yang terjadi yakni di dapati eror sebab konstruktor sebeumnya 
    // sudah memakai parameter tersebut jadi wajib hukumnya menggunakan para meter yang berbeda
    
    // public static double HitungLuas(int a, int b){
    //     double nilai = value* value2;
    //     return nilai;
    // }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("masukkan nilai integer 1 : ");
        int integer1 = in.nextInt();
        System.out.print("masukkan nilai integer 2 : ");
        int integer2 = in.nextInt();
        HitungLuas(integer1, integer2);
        System.out.print("masukkan nilai double 1 : ");
        double double1 = in.nextDouble();
        System.out.print("masukkan nilai double 2 : ");
        double double2 = in.nextDouble();
        HitungLuas(double1, double2);

        // implementasi jawaban nomor 3
        HitungLuas(double1, double2);
        System.out.print ("Maka hasil luas : + HitungLuas (double1, double2)"); 
    }

}