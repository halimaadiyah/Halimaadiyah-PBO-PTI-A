package Tugas3.src;

public class pohon {
    private String jenisPohon;
    private int usia;
    private String jenisAkar;
    private String mediaTanam;

    public pohon(String jenisPohon, int usia, String jenisAkar, String mediaTanam) {
        this.jenisPohon = jenisPohon;
        this.usia = usia;
        this.jenisAkar = jenisAkar;
        this.mediaTanam = mediaTanam;
    }
    public void main() {
        System.out.println("Jenis Pohon " + jenisPohon);
        System.out.println("Usia: " + usia);
        System.out.println("Jenis Akar: " + jenisAkar);
        System.out.println("Media Tanam: " + mediaTanam);
    }

    public void bernafas() {
        System.out.println( jenisPohon + " bernafas.");
    }

    public void berbuah() {
        System.out.println( jenisPohon + " menghasilakan buah yang telah matang.");
    }

    public void fotosintesis(String klorofil) {
        System.out.println( jenisPohon + " sedang melakukan fotosintesis menggunakan " + klorofil.getNama() + ".");
    }

    
    public String getJenisPohon() {
        return jenisPohon;
    }

    public void setJenisPohon(String jenisPohon) {
        this.jenisPohon = jenisPohon;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public String getJenisAkar() {
        return jenisAkar;
    }

    public void setJenisAkar(String jenisAkar) {
        this.jenisAkar = jenisAkar;
    }

    public String getMediaTanam() {
        return mediaTanam;
    }

    public void setMediaTanam(String mediaTanam) {
        this.mediaTanam = mediaTanam;
    }
}
