import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // nomor 6. kemudian panggil pada Class Main 
        // dengan menginstan objek bernama nama anda = (halima)
        // Menginstansiasi objek Manusia dengan nama halima
        Manusia Halima = new Manusia("Halimah", 19);
       
        // System.out.println("Nama: " + Halima.getNama());
        // System.out.println("Umur: " + Halima.getUmur());


        // implementasian dari nomor 07
        // dimana meminta inputan dari user dan membuatnya menjadi interaktif
        // Scanner scanner = new Scanner(System.in);

        // // Meminta input nama dari pengguna
        // System.out.print("Masukkan nama: ");
        // String nama = scanner.nextLine();

        // // Meminta input umur dari pengguna
        // System.out.print("Masukkan umur: ");
        // int umur = scanner.nextInt();

        // implementasi dari nomor 8
        Halima.memasak();
        Halima.rakit();
        Halima.lomba();
    }
}
// 2. class yang berbentuk interface tidak bisa diinstansikan menjadi sebuah objek. 
// karena interface merupakan penghubung antar objek saja. 
// interface hanya mendefinisikan keterhubungan antar kelas yang akan mengimplementasikannya, lalu interface juga bersifat abstrak
// 3.tentu dalam sebuah class dapat mengimentasikan beberapa classinterface lebih dari satu classinterface. 
// namun hal ini dilakukan berdasarkan kebutuhan saja sebab dengan melakukan hal ini 
// maka objek dalam class tersebut akan memuat semua yang ditetapkan dalam penyertaan class interface
// 4. ketika melakukan hapus method pada class interface"identitas.java" 
// ini yang terjadi eror, pada class Manusia. karena di class manusia melakukan pengimplementasian terhadap classinterface identitas
// 5. ketika kita ingin menghilangi sala satu implementasi class interface, 
// yang sebelumnya sudah ada atau suda di pergunakan dalam class hewan, 
// yang terjadi akan keseluruhan method yang berkaitan dengan classinterface "identitas" akan tidak lagi tersedia pada class hewan. 
// hal ini dapat memungkinkan untuk menimbulkan eror dalam compilation
