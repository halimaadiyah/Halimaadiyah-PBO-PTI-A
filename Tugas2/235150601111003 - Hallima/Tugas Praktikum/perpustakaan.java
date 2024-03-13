public class perpustakaan {
    static Scanner input = new Scanner(System.in);
    
    public static int mainMenu() {
        System.out.println("Nama : Khalimatus Sa'diyah");
        System.out.println("NIM : 235150601111003");
        System.out.println("Kelas : PTI - A \n\n");
        System.out.println("Selamat datang di perpustakaan");
        System.out.println("Kami memiliki persediaan 7 kategori buku : ");
        System.out.println("1. Teknologi\n2. Filsafat\n3. Sejarah\n4. Agama\n5. Psikologi\n6. Politik\n7. Fiksi\n0. Keluar");
        System.out.print("Silahkan Pilih kategori yang ingin dicari : "); 
        int pilihanMenu = input.nextInt();
        input.nextLine();
        return pilihanMenu;
    }
    
    public static void main(String[] args) {
        mainPusatBukuPerpustakaan listBuku = new mainPusatBukuPerpustakaan();    
        listBuku.berdasarkanKategori(mainMenu());
    
}
}
