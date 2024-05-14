package Modul;

public class Main {
    public static void main(String[] args) {
        // Casting
        double angka = 5.4;
        int angka_int = (int) angka;
        System.out.println(angka_int);

        // Object dengan class HeroIntel
        HeroIntel hero1 = new HeroIntel("Ucup", 100);
        hero1.display();

        // Upcasting
        Hero heroUp = (Hero)hero1;
        heroUp.display();
        // System.out.println(heroUp.getType()); // ini erorr

        // Object dengan class Hero
        Hero heroReg = new Hero("Boy", 100);
        heroReg.display();

        //downcasting
        // HeroAgility heroDown = (HeroAgility) heroReg ; // ini erorr

        // heroUp dikembalikan ke hero1
        HeroIntel hero2 = (HeroIntel) heroUp;
        hero2.display(); //ini berhasil downcasting

        // Object dengan class HeroMagic
        HeroMagic hero3 = new HeroMagic("Reen", 100);
        hero1.display();

        // HeroAgility hero3 = (HeroAgility) heroUp;
        // hero3.display();
        // no. 3 yang terjadi akan eror atau terjadi classCastException dimana heroUp 
        // merupakan objek dari class hero dan tidak dapat langsung di-downcasting ke class heroAgility

        // no.5
        // Upcasting
        Hero heroUpgr = (Hero)hero3;
        heroUp.display();


        // Downcasting
        HeroMagic heroDown = (HeroMagic) heroUpgr;
        heroDown.display();

    
    }
}

// no. 1
// extends adalah kata kunci berguna untuk mendefinisikan hubungan pewarisan antara dua class. 
// bila terdapat kelas yang menggunakan kata kunci extends maka class ini di sebut class turunan atau subclass. 
// sedangkan kelas yang diwarisi merupakan superclass super adalah kata kunci berguna 
// untuk mengakses atribut dan method dari superclass. memiliki fungsi untuk kata super bisa 
// digunakan di dalam konstruktor subclass untuk memanggil konstruktor pada superclass

//  no. 2
// keyword this diperlukan untuk membedakan antara variabel lokal dan variabel instan yang memiliki nama sama. 
// lalu pada construkctor, setter dan getter ini this digunakan untuk merujuk pada variabel instanclass

//  no. 4
// tentu atribut bisa diakses langsung akan tetapi hal ini tidak disarankan 
// karena atribut type merupakan atribut spesifik dari class herointel dan heroAgility apabila akses langsung ke atribut tersebut 
// kemungkinan akan terjadi kekeliruan program dan kurang baik dari konsep kapsulasi. 
// namun ada cara lain dan sebaiknya kita lakukan dapat mengakses atribut type melalui 
// method setter dan getter yang telah didefinisikan pada kedua kelas tersebut


