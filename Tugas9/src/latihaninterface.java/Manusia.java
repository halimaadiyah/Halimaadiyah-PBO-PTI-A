public class Manusia implements MakhlukHidup, Identitas {
    
    private String nama;
    private int umur;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    // implementasian nomor 06
    // Konstruktor dengan parameter umur dan nama
    public Manusia(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // implementasian nomor 08 membuat method yang berbeda
    // smembuat method memasak, rakit, lomba
    public void memasak() {
        System.out.println(nama + " sedang memasak ...");
    }

    public void rakit(){
        System.out.println(nama + " sedang merakit lego marvel ...");
    }

    public void lomba(){
        System.out.println(nama + " sedang mengikuti perlombaan basket ...");
    }
    
    @Override
    public void makan() {
        System.out.println("Makan pakai sendok garpu");}
    
    @Override
    public void berjalan(){
        System.out.println("Jalan pakai dua kaki");}

    @Override
    public void bersuara(){
        System.out.println("Suaranya Merdu");}

    @Override
    public void tampilkanNama(){
        System.out.println("Nama Saya: " + this.nama);}

    @Override
    public void tampilkanUmur(){
        System.out.println("Umur Saya: "+ this.umur);}
}
