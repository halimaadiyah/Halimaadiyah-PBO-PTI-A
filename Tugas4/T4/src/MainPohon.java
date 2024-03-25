package Tugas4.T4.src;

public class MainPohon {
    public static void main(String[] args) {
        pohon pohonMangga = new pohon("Mangga", 5, "Keras", "Tanah");
        pohonMangga.main();
        pohonMangga.bernafas();
        pohonMangga.berbuah();
        pohonMangga.fotosintesis(new MainCahaya("Hijau"));
    }
    
}
