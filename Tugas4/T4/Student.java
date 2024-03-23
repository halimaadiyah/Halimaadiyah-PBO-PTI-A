package Tugas4.T4;

public class Student {
     private String name;
     private String address;
     private int age;
     private double mathGrade;
     private double englishGrade;
     private double scienceGrade;
     private double average;
     private boolean statusAkhir;
     private static int keseluruhanObjek = 0;


     public Student(){
     name = "";
     address = "";
     age = 0;
     keseluruhanObjek++;
     }

     public Student(String n, String a, int ag){
     name = n;
     address = a;
     age = ag;
     keseluruhanObjek++;
     }

     public void setName(String n){
     name = n;
     }

     public void setAddress(String a){
     address = a;
     }

     public void setAge(int ag){
     age = ag;
     }

     public void setMath(int math){
     mathGrade = math;
     }

     public void setEnglish(int english){
     englishGrade = english;
     }

     public void setScience(int science){
     scienceGrade = science;
     }

     private double getAverage(){
     double result = 0;
     result = (mathGrade+scienceGrade+englishGrade)/3;
     return result;
     }

    //   a. jawaban nomor 5
     public static void jumlahObjek (){
        System.out.println("Jumlah Objek : " + keseluruhanObjek);
     }

     // a. jawaban nomor 2 (konstruktor)
     public Student(String name, String address, int age, double mathGrade, double englishGrade, double scienceGrade, double average){
        this.name = name;
        this.address = address;
        this.age = age;
        this.mathGrade = mathGrade;
        this.englishGrade = englishGrade;
        this.scienceGrade = scienceGrade;
        this.average = average;
        keseluruhanObjek++;
     }

    //  a. jawaban nomor 3
    public boolean statusAkhir(){
        double averagePoint = (mathGrade + englishGrade + scienceGrade ) /3;
        if(averagePoint >= 61){
            return true;
        }else{
            return false;
        }
    }


     public void displayMessage(){
     System.out.println("Siswa dengan nama "+name);
     System.out.println("beramalat di "+address);
     System.out.println("berumur "+age);
     System.out.println("mempunyai nilai rata rata"+getAverage());


    //  lanjutan no3 melakukan implementasian
    if (statusAkhir()){
        System.out.println(name + " Selamat nilai anda memenuhi passing graded");
    }else{
        System.out.println(name + " Nice try, Anda di haruskan untuk mengikuti remedial");
    }

    }
}
    